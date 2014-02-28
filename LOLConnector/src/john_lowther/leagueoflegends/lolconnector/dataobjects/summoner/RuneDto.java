package john_lowther.leagueoflegends.lolconnector.dataobjects.summoner;

/**
 * Rune data.
 * @author John Lowther
 */
public class RuneDto {
	private String description;
	private int id;
	private String name;
	private int tier;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
}
