package john_lowther.leagueoflegends.lolconnector.dataobjects.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Game data
 * @author John Lowther
 */
public class GameDto {
	private int championId;
	private long createDate;
	private List<PlayerDto> fellowPlayers = new ArrayList<PlayerDto>();
	private long gameId;
	private String gameMode;
	private String gameType;
	private boolean invalid;
	private int level;
	private int mapId;
	private int spell1;
	private int spell2;
	private RawStatsDto stats = new RawStatsDto();
	private String subType;
	private int teamId;
	
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	public List<PlayerDto> getFellowPlayers() {
		return fellowPlayers;
	}
	public void setFellowPlayers(List<PlayerDto> fellowPlayers) {
		this.fellowPlayers = fellowPlayers;
	}
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public String getGameMode() {
		return gameMode;
	}
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public boolean isInvalid() {
		return invalid;
	}
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMapId() {
		return mapId;
	}
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	public int getSpell1() {
		return spell1;
	}
	public void setSpell1(int spell1) {
		this.spell1 = spell1;
	}
	public int getSpell2() {
		return spell2;
	}
	public void setSpell2(int spell2) {
		this.spell2 = spell2;
	}
	public RawStatsDto getStats() {
		return stats;
	}
	public void setStats(RawStatsDto stats) {
		this.stats = stats;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
}
