package john_lowther.leagueoflegends.lolconnector.dataobjects.team;

/**
 * Team stats data.
 * @author John Lowther
 */
public class TeamStatDetailDto {
	private int averageGamesPlayed;	
	private String fullId;	
	private int losses;	
	private String teamStatType;	
	private int wins;
	
	public int getAverageGamesPlayed() {
		return averageGamesPlayed;
	}
	public void setAverageGamesPlayed(int averageGamesPlayed) {
		this.averageGamesPlayed = averageGamesPlayed;
	}
	public String getFullId() {
		return fullId;
	}
	public void setFullId(String fullId) {
		this.fullId = fullId;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public String getTeamStatType() {
		return teamStatType;
	}
	public void setTeamStatType(String teamStatType) {
		this.teamStatType = teamStatType;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
}
