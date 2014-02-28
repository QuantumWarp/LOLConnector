package john_lowther.leagueoflegends.lolconnector.connector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import john_lowther.leagueoflegends.lolconnector.dataenums.ConnectionResponse;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;
import john_lowther.leagueoflegends.lolconnector.fileio.KeyReader;

/**
 * Provides general connection to the Riot API.
 * @author John Lowther
 */
public class Connector {
	private static Connector instance;
	
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
	 * Passes in the api_key to the url.
	 * @param baseUrl
	 * @param api_key
	 * @return response
	 * @throws RequestException 
	 */
	public String submitRequest(String baseUrl, String apikey) throws RequestException {
		return submitRequest(baseUrl + (baseUrl.contains("?") ? "&" : "?") + "api_key=" + apikey);
	}
	
	/**
	 * Main method that actually does the connection work.
	 * @param urlString
	 * @return response
	 * @throws RequestException 
	 */
	public String submitRequest(String urlString) throws RequestException {
		HttpURLConnection connection = null;  
		
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
			if(connection != null) {
				connection.disconnect(); 
			}
		}
	}
}