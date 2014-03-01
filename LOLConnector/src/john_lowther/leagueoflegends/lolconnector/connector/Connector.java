package john_lowther.leagueoflegends.lolconnector.connector;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import john_lowther.leagueoflegends.lolconnector.dataenums.ConnectionResponse;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;
import john_lowther.leagueoflegends.lolconnector.fileio.KeyReader;

/**
 * Provides general connection to the Riot API.
 * @author John Lowther
 */
public class Connector {
	private static Connector instance;
	private Point[] rateLimits = {	new Point(10, 10), 
									new Point(500, 600)}; //x is time, y is number of requests.
	private ArrayList<Long> requestTimes = new ArrayList<Long>();
	
	/**
	 * Gets the instance of the Connector object.
	 * @return Connector
	 */
	public static Connector getInstance() {
		if (instance == null) {
			instance = new Connector();
		}
		
		return instance;
	}

	/**
	 * Passes the base url and gets the api_key itself.
	 * @param baseUrl
	 * @return response
	 * @throws RequestException 
	 */
	public String submitApiRequest(String baseUrl) throws RequestException {
		return submitRequest(baseUrl, KeyReader.getApiKey());
	}
	
	/**
	 * Passes the base url and gets the api_key itself.
	 * @param baseUrl
	 * @param count
	 * @return response
	 * @throws RequestException 
	 */
	public String submitApiRequest(String baseUrl, boolean count) throws RequestException {
		return submitRequest(baseUrl, KeyReader.getApiKey());
	}
	
	/**
	 * Passes in the api_key to the url.
	 * @param baseUrl
	 * @param api_key
	 * @return response
	 * @throws RequestException 
	 */
	public String submitRequest(String baseUrl, String apikey) throws RequestException {
		return submitRequest(baseUrl + (baseUrl.contains("?") ? "&" : "?") + "api_key=" + apikey, true);
	}
	
	/**
	 * Passes in the api_key to the url.
	 * @param baseUrl
	 * @param api_key
	 * @param count
	 * @return response
	 * @throws RequestException 
	 */
	public String submitRequest(String baseUrl, String apikey, boolean count) throws RequestException {
		return submitRequest(baseUrl + (baseUrl.contains("?") ? "&" : "?") + "api_key=" + apikey, count);
	}
	
	/**
	 * Main method that actually does the connection work.
	 * @param urlString
	 * @return response
	 * @throws RequestException 
	 */
	public String submitRequest(String urlString, boolean count) throws RequestException {
		HttpURLConnection connection = null;  
		
		if (count) checkRate();
		
		try {
			URL url = new URL(urlString);
			connection = (HttpURLConnection) url.openConnection();

			BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = input.readLine()) != null) {
				response.append(inputLine);
			}

			input.close();

			return response.toString();
		} catch (IOException e) {
			try {
				throw new RequestException(ConnectionResponse.getFromCode(connection.getResponseCode()));
			} catch (IOException e1) {
				e1.printStackTrace();
				return null;
			}
		} finally {
			if (count) saveTime();
			
			if(connection != null) {
				connection.disconnect(); 
			}
		}
	}

	/**
	 * Saves the time this operation was completed.
	 * Clears excess list periodically.
	 */
	private void saveTime() {
		requestTimes.add(0, System.currentTimeMillis());
		
		if (requestTimes.size() >= 1000) {
			requestTimes.subList(500, requestTimes.size()).clear();
		}
	}

	/**
	 * Checks the rate isn't being exceeded.
	 */
	private void checkRate() {
		long timeElapsed;
		long toTest;
		
		for (Point p : rateLimits) {
			if (p.x <= requestTimes.size()) {
				timeElapsed = System.currentTimeMillis() - requestTimes.get(p.x - 1);
				toTest = p.y * 1000;

				if (timeElapsed < toTest) {
					try {
						Thread.sleep(toTest -  timeElapsed);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}