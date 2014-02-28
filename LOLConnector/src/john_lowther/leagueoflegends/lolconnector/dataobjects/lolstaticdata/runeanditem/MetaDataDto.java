package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.runeanditem;

/**
 * Meta data.
 * @author John Lowther
 */
public class MetaDataDto {
	private boolean isRune;
	private String tier;
	private String type;
	
	public boolean isRune() {
		return isRune;
	}
	public void setRune(boolean isRune) {
		this.isRune = isRune;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
