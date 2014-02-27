package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * Enums for seasons.
 * @author John Lowther
 */
public enum Season {
	SEASON3 ("SEASON3"),
	SEASON4 ("SEASON4");
	
	private String code;
	
	private Season(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
