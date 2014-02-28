package john_lowther.leagueoflegends.lolconnector.dataobjects.stats;

import java.util.List;

/**
 * Ranked stats data.
 * @author John Lowther
 */
public class RankedStatsDto {
	private List<ChampionStatsDto> champions;
	private long modifyDate;
	private long summonerId;
	
	public List<ChampionStatsDto> getChampions() {
		return champions;
	}
	public void setChampions(List<ChampionStatsDto> champions) {
		this.champions = champions;
	}
	public long getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(long modifyDate) {
		this.modifyDate = modifyDate;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
