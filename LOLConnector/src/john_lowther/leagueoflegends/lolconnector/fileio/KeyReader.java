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
	private String api_keyLocation = "api_key.txt";
	
	/**
	 * Method that returns the api_key, based on the file name.
	 * @return api_key
	 */
	public String getApiKey() {
	    try(
	    	BufferedReader br = new BufferedReader(new FileReader(api_keyLocation))) {
	        String line = br.readLine();
	        return line;
	        
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
		return null;
	}

	public String getApi_keyLocation() {
		return api_keyLocation;
	}

	public void setApi_keyLocation(String api_keyLocation) {
		this.api_keyLocation = api_keyLocation;
	}
}
