package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * Enums for item data.
 * @author John Lowther
 */
public enum ItemData {
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
	STATS ("stats");
	
	private String code;
	
	private ItemData(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
