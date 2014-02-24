package john_lowther.leagueoflegends.lolconnector.connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import john_lowther.leagueoflegends.lolconnector.fileio.KeyReader;

/**
 * Provides general connection to the Riot API.
 * @author John Lowther
 */
public class Connector extends LOLConnector {
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
	 */
	public String submitApiRequest(String baseUrl) {
		return submitRequest(baseUrl, KeyReader.getApiKey());
	}
	
	/**
	 * Passes in the api_key to the url.
	 * @param baseUrl
	 * @param api_key
	 * @return response
	 */
	public String submitRequest(String baseUrl, String api_key) {
		return submitRequest(addParamToRequest(baseUrl, "api_key", api_key));
	}
	
	/**
	 * Main method that actually does the connection work.
	 * @param urlString
	 * @return response
	 */
	public String submitRequest(String urlString) {
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
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {
			if(connection != null) {
				connection.disconnect(); 
			}
		}
	}
}