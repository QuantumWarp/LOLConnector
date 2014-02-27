package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * Enums for mastery data (TREE is list specific).
 * @author John Lowther
 */
public enum MasteryData {
	ALL ("all"),
	RANKS ("ranks"),
	PREREQ ("prereq"),
	IMAGE ("image"),
	TREE ("tree"); //TREE is list specific
	
	private String code;
	
	private MasteryData(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
