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
	private static final String apiUrl = "https://prod.api.pvp.net";

	/**
	 * Appends the string onto the end of the base apiUrl.
	 * @param string to append
	 * @param region
	 * @param version
	 * @return complete request string without params
	 */
	protected String constructRequest(String append, Region region, Version version) {
		if (version == null)
			version = Version.getLatest(supportedVersions);
		
		int splitPoint = append.indexOf("%s", append.indexOf("%s") + 2) + 2;
		
		append = String.format(append.substring(0, splitPoint), region.getCode(), version.getCode())
				+ append.substring(splitPoint);
		
		return apiUrl + append;
	}
	
	/**
	 * Adds a parameter to the request.
	 * @param request
	 * @param paramName
	 * @param param
	 */
	protected String addParamToRequest(String request, String paramName, Object param) {
		return request + (request.contains("?") ? "&" : "?") + paramName + "=" + param.toString();
	}
	
//================== Getters and Setters ==================//
	
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
