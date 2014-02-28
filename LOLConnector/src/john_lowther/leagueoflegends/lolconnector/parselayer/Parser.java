package john_lowther.leagueoflegends.lolconnector.parselayer;

import java.lang.reflect.Type;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;

import com.google.gson.Gson;

/**
 * Provides parsing methods.
 * @author John Lowther
 */
public class Parser {
	protected Region defaultRegion;
	
	public void setDefaultRegion(Region region) {
		this.defaultRegion = region;
	}
	
	protected <T> T parse(String json, Type type) {
		return new Gson().fromJson(json, type);
	}
}
