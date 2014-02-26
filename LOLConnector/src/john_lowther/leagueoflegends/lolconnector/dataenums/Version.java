package john_lowther.leagueoflegends.lolconnector.dataenums;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * League of Legends version codes and values.
 * @author John Lowther
 */
public enum Version {
	ONE ("v1", 1f),
	ONE_POINT_ONE ("v1.1", 1.1f),
	ONE_POINT_TWO ("v1.2", 1.2f),
	ONE_POINT_THREE ("v1.3", 1.3f),
	TWO_POINT_ONE ("v2.1", 2.1f),
	TWO_POINT_TWO ("v2.2", 2.2f),
	TWO_POINT_THREE ("v2.3", 2.3f);
	
	private final String code;
	private final float value;
	
    Version(String code, float value) {
        this.code = code;
        this.value = value;
    }

    /**
     * @return version code
     */
	public String toString() {
		return getCode();
	}
    
	/**
	 * Gets the latest version from a verson map.
	 * @param supported version map
	 * @return latest version
	 */
	public static Version getLatest(Map<Version, List<Region>> map) {
		float latest = 0f;
		Version latestVersion = null;
		
		for (Version version : Version.values()) {
			if (latest < version.getValue() && map.get(version) != null) {
				latest = version.getValue();
				latestVersion = version;
			}
		}
		
		return latestVersion;
	}
	
	/**
	 * Gets the blank map.
	 * @return blank map
	 */
	public static Map<Version, List<Region>> getBlankVersionMap() {
		Map<Version, List<Region>> map = new HashMap<Version, List<Region>>();
		
		for (Version version : Version.values()) {
			map.put(version, null);
		}
		
		return map;
	}
	
	/**
	 * Gets the associated version value
	 * @return value
	 */
	public float getValue() {
		return value;
	}
	
    /**
     * @return version code
     */
    public String getCode() {
		return code;
	}

    /**
     * @return lower case version code (default)
     */
    public String getLowerCaseCode() {
    	return getCode();
    }
    
    /**
     * @return upper case version code
     */
    public String getUpperCaseCode() {
    	return getCode().toUpperCase();
    }
}
