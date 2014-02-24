package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * League of Legends region codes.
 * @author John Lowther
 */
public enum Region {
	NORTH_AMERICA ("na"),
	EU_WEST ("euw"),
	EU_NORDIC_AND_EAST ("eune"),
	BRAZIL ("br"),
	TURKEY ("tr"),
	RUSSIA ("ru"),
	LATIN_AMERICA_NORTH ("lan"),
	LATIN_AMERICA_SOUTH ("las"),
	OCEANIA_AUSTRAILIA ("aus"),
	OCEANIA_NEW_ZEALAND ("nz");
	
	private final String code;
	
    Region(String code) {
        this.code = code;
    }

    /**
     * @return region code
     */
	public String toString() {
		return getCode();
	}
    
    /**
     * @return region code
     */
    public String getCode() {
		return code;
	}

    /**
     * @return lower case region code (default)
     */
    public String getLowerCaseCode() {
    	return getCode();
    }
    
    /**
     * @return upper case region code
     */
    public String getUpperCaseCode() {
    	return getCode().toUpperCase();
    }
}
