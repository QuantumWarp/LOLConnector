package john_lowther.leagueoflegends.lolconnector.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Contains a single method to retrieve the API key.
 * @author John Lowther
 */
public class KeyReader {
	
	/**
	 * Method that returns the api_key. api_key should be in a plain text file named "api_key.txt".
	 * The file should be in your classpath.
	 * @return api_key
	 */
	public String getApiKey() {
		return getApiKey("api_key.txt");
	}
	
	/**
	 * Method that returns the api_key, based on the file name.
	 * @return api_key
	 */
	public String getApiKey(String filename) {
	    try(
	    	BufferedReader br = new BufferedReader(new FileReader(filename))) {
	        String line = br.readLine();
	        return line;
	        
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
		return null;
	}
}
