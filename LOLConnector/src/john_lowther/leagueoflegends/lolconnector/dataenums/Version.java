package john_lowther.leagueoflegends.lolconnector.dataenums;

public enum Version {
	ONE ("v1"),
	ONE_POINT_ONE ("v1.1"),
	ONE_POINT_TWO ("v1.2"),
	ONE_POINT_THREE ("v1.3"),
	TWO_POINT_ONE ("v2.1"),
	TWO_POINT_TWO ("v2.2"),
	TWO_POINT_THREE ("v2.3");
	
	private final String code;
	
    Version(String code) {
        this.code = code;
    }

    /**
     * @return version code
     */
	public String toString() {
		return getCode();
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
