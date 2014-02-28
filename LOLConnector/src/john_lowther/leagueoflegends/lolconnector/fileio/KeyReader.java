package john_lowther.leagueoflegends.lolconnector.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Contains a single method to retrieve the API key. By default api_key should be in 
 * a plain text file named "api_key.txt". The file should be in your classpath.
 * @author John Lowther
 */
public class KeyReader {
	private static String apikeyLocation = "api_key.txt";
	private static String apikey = null;
	
	/**
	 * Method that returns the api_key, based on the file name.
	 * @return api_key
	 */
	public static String getApiKey() {
		if (apikey != null)
			return apikey;
		
	    try(
	    	BufferedReader br = new BufferedReader(new FileReader(apikeyLocation))) {
	        String line = br.readLine();
	        return line;
	        
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
		return null;
	}

	public static String resetAndGetApiKey() {
		apikey = null;
		return getApiKey();
	}
	
	public static String getApikeyLocation() {
		return apikeyLocation;
	}

	public static void setApiKey(String apikey) {
		KeyReader.apikey = apikey;
	}
	
	public static void setApikeyLocation(String apikeyLocation) {
		KeyReader.apikeyLocation = apikeyLocation;
	}
}
