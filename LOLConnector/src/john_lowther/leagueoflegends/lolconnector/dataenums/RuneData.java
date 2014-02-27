package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * Enums for rune data (BASIC is list specific).
 * @author John Lowther
 */
public enum RuneData {
	ALL ("all"),
	GOLD ("gold"),
	COLLOQ ("colloq"),
	CONSUMED ("consumed"),
	STACKS ("stacks"),
	DEPTH ("depth"),
	CONSUME_ON_FULL ("consumeOnFull"),
	FROM ("from"),
	INTO ("into"),
	SPECIAL_RECIPE ("specialRecipe"),
	IN_STORE ("inStore"),
	HIDE_FROM_ALL ("hideFromAll"),
	REQUIRED_CHAMPION ("requiredChampion"),
	TAGS ("tags"),
	MAPS ("maps"),
	IMAGE ("image"),
	STATS ("stats"),
	BASIC ("basic");
	
	private String code;
	
	private RuneData(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
