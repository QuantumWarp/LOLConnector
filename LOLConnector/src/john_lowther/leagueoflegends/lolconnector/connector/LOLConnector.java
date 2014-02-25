package john_lowther.leagueoflegends.lolconnector.connector;

import java.util.Arrays;
import java.util.List;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.RegionNotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.VersionNotSupportedException;

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
	protected List<Region> supportedRegions;
	protected List<Version> supportedVersions;
	private boolean isValidating;
	private static final String apiUrl = "https://prod.api.pvp.net";
	
	public LOLConnector(boolean isValidating) {
		this.isValidating = isValidating;
	}

	/**
	 * Appends the string onto the end of the base apiUrl.
	 * @param string to append
	 * @param region
	 * @param version
	 * @return complete request string without params
	 * @throws VersionNotSupportedException 
	 * @throws RegionNotSupportedException 
	 */
	protected String constructRequest(String append, Region region, Version version) 
			throws VersionNotSupportedException, RegionNotSupportedException {
		if (version == null)
			version = Version.getLatest(supportedVersions);
		
		if (isValidating) {
			if (!supportedRegions.contains(region))
				throw new RegionNotSupportedException();
			if (!supportedVersions.contains(version))
				throw new VersionNotSupportedException();
		}
		
		
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
	
	protected List<Region> getSupportedRegions() {
		return supportedRegions;
	}
	
	protected void setSupportedRegions(Region... regions) {
		supportedRegions = Arrays.asList(regions);
	}
	
	protected List<Version> getSupportedVersions() {
		return supportedVersions;
	}
	
	protected void setSupportedVersions(Version... versions) {
		supportedVersions = Arrays.asList(versions);
	}
}
