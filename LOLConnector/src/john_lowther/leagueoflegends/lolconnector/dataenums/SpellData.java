package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * Enums for spell data.
 * @author John Lowther
 */
public enum SpellData {
	ALL ("all"),
	TOOLTIP ("tooltip"),
	LEVELTIP ("leveltip"),
	IMAGE ("image"),
	RESOURCE ("resource"),
	MAXRANK ("maxrank"),
	COST ("cost"),
	COST_TYPE ("costType"),
	COST_BURN ("costBurn"),
	COOLDOWN ("cooldown"),
	COOLDOWN_BURN ("cooldownBurn"),
	EFFECT ("effect"),
	EFFECT_BURN ("effectBurn"),
	VARS ("vars"),
	RANGE ("range"),
	RANGE_BURN ("rangeBurn"),
	KEY ("key"),
	MODES ("modes");
	
	private String code;
	
	private SpellData(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
