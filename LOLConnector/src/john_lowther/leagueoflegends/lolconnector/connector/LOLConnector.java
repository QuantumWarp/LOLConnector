package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;

/**
 * Has methods to help all connection classes. Also acts as a label.
 * Connection classes should use the constructor format:
 * <pre>
 * <code>
 * 		public ChampionConnector() {
 *			setSupportedRegions(...);
 *			setSupportedVersions(...);
 *		}
 *</code>
 * @author John Lowther
 */
public abstract class LOLConnector {
	protected Region[] supportedRegions;
	protected Version[] supportedVersions;

	/**
	 * Adds a parameter to the request.
	 * @param request
	 * @param paramName
	 * @param param
	 */
	protected String addParamToRequest(String request, String paramName, Object param) {
		return request + (request.contains("?") ? "&" : "?") + paramName + "=" + param.toString();
	}
	
	protected Region[] getSupportedRegions() {
		return supportedRegions;
	}
	
	protected void setSupportedRegions(Region... regions) {
		supportedRegions = regions;
	}
	
	protected Version[] getSupportedVersions() {
		return supportedVersions;
	}
	
	protected void setSupportedVersions(Version... versions) {
		supportedVersions = versions;
	}
}
