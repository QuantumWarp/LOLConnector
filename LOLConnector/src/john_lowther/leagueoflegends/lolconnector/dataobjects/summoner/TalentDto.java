package john_lowther.leagueoflegends.lolconnector.dataobjects.summoner;

/**
 * Talent spec data.
 * @author John Lowther
 */
public class TalentDto {
	private int id;
	private String name;
	private int rank;
	
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
