package john_lowther.leagueoflegends.lolconnector.dataobjects.stats;

import java.util.ArrayList;
import java.util.List;

/**
 * Player stats summary list.
 * @author John Lowther
 */
public class PlayerStatsSummaryListDto {
	private List<PlayerStatsSummaryDto> playerStatSummaries = new ArrayList<PlayerStatsSummaryDto>();
	private long summonerId;
	
	public List<PlayerStatsSummaryDto> getPlayerStatSummaries() {
		return playerStatSummaries;
	}
	public void setPlayerStatSummaries(
			List<PlayerStatsSummaryDto> playerStatSummaries) {
		this.playerStatSummaries = playerStatSummaries;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
