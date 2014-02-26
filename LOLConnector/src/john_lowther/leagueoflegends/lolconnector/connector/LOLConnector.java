package john_lowther.leagueoflegends.lolconnector.connector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.RegionNotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.VersionNotSupportedException;

//Need to add URL encoding
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
	protected Map<Version, List<Region>> supportedMap = Version.getBlankVersionMap();
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
			version = Version.getLatest(supportedMap);
		
		if (isValidating) {
			if (supportedMap.get(version) ==  null)
				throw new VersionNotSupportedException();
			if (!supportedMap.get(version).contains(region))
				throw new RegionNotSupportedException();
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
	
	/**
	 * Sets what is supported for a particular version
	 * @param version
	 * @param regions
	 */
	protected void setSupported(Version version, Region... regions) {
		supportedMap.put(version, Arrays.asList(regions));
	}
	
	/**
	 * @return supported versions
	 */
	public List<Version> getSupportedVersions() {
		List<Version> list = new ArrayList<Version>();
		
		for (Version version : Version.values()) {
			if (supportedMap.get(version) != null) {
				list.add(version);
			}
		}
		
		return list;
	}
	
	/**
	 * @param version
	 * @return supported regions for this version
	 */
	public List<Region> getSupportedRegions(Version version) {
		return supportedMap.get(version);
	}
}
