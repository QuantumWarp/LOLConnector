package john_lowther.leagueoflegends.lolconnector.dataobjects.league;

/**
 * League entries.
 * @author John Lowther
 */
public class LeagueItemDto {
	private boolean isFreshBlood;	
	private boolean isHotStreak;	
	private boolean isInactive;	
	private boolean isVeteran;	
	private long lastPlayed;	
	private String leagueName;
	private int leaguePoints;	
	private MiniSeriesDto miniSeries = new MiniSeriesDto();	
	private String playerOrTeamId;	
	private String playerOrTeamName;	
	private String queueType;	
	private String rank;	
	private String tier;	
	private int wins;
	
	public boolean isFreshBlood() {
		return isFreshBlood;
	}
	public void setFreshBlood(boolean isFreshBlood) {
		this.isFreshBlood = isFreshBlood;
	}
	public boolean isHotStreak() {
		return isHotStreak;
	}
	public void setHotStreak(boolean isHotStreak) {
		this.isHotStreak = isHotStreak;
	}
	public boolean isInactive() {
		return isInactive;
	}
	public void setInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}
	public boolean isVeteran() {
		return isVeteran;
	}
	public void setVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}
	public long getLastPlayed() {
		return lastPlayed;
	}
	public void setLastPlayed(long lastPlayed) {
		this.lastPlayed = lastPlayed;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public int getLeaguePoints() {
		return leaguePoints;
	}
	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}
	public MiniSeriesDto getMiniSeries() {
		return miniSeries;
	}
	public void setMiniSeries(MiniSeriesDto miniSeries) {
		this.miniSeries = miniSeries;
	}
	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}
	public void setPlayerOrTeamId(String playerOrTeamId) {
		this.playerOrTeamId = playerOrTeamId;
	}
	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}
	public void setPlayerOrTeamName(String playerOrTeamName) {
		this.playerOrTeamName = playerOrTeamName;
	}
	public String getQueueType() {
		return queueType;
	}
	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
}
