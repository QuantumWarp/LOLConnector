package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * Enums for champ data.
 * @author John Lowther
 */
public enum ChampData {
	ALL ("all"),
	IMAGE ("image"),
	SKINS ("skins"),
	LORE ("lore"),
	BLURB ("blurb"),
	ALLYTIPS ("allytips"),
	ENEMYTIPS ("enemytips"),
	TAGS ("tags"),
	PARTYPE ("partype"),
	INFO ("info"),
	STATS ("stats"),
	SPELLS ("spells"),
	PASSIVE ("passive"),
	RECOMMENDED ("recommended");
	
	private String code;
	
	private ChampData(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
