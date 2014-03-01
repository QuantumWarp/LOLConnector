package john_lowther.leagueoflegends.lolconnector.parselayer;

import john_lowther.leagueoflegends.lolconnector.connector.StatsConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Season;
import john_lowther.leagueoflegends.lolconnector.dataobjects.stats.PlayerStatsSummaryListDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.stats.RankedStatsDto;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

public class StatsParser extends Parser {
	StatsConnector connector = new StatsConnector();
	
	/**
	 * Get player stats summaries by summoner ID for season 4. One summary is returned per queue type.
	 * @return PlayerStatsSummaryListDto
	 */
	public PlayerStatsSummaryListDto getPlayerSummary(long summonerId) 
			throws NotSupportedException, RequestException {
		return customPlayerSummaryRequest(defaultRegion, summonerId, Season.SEASON4);
	}
	
	/**
	 * Custom player stat retrieval summaries by summoner ID. One summary is returned per queue type.
	 * @return PlayerStatsSummaryListDto
	 */
	public PlayerStatsSummaryListDto customPlayerSummaryRequest(Region region, long summonerId, Season season) 
			throws NotSupportedException, RequestException {
		String response = connector.getStatsSummary(region, null, String.valueOf(summonerId), season);
		return parse(response, PlayerStatsSummaryListDto.class);
	}
	
	/**
	 * Get ranked stats by summoner ID. Includes statistics for Twisted Treeline and Summoner's Rift.
	 * @return PlayerStatsSummaryListDto
	 */
	public RankedStatsDto getPlayerRanked(long summonerId) 
			throws NotSupportedException, RequestException {
		return customPlayerRankedRequest(defaultRegion, summonerId, Season.SEASON4);
	}
	
	/**
	 * Custom ranked stats request by summoner ID. Includes statistics for Twisted Treeline and Summoner's Rift.
	 * @return PlayerStatsSummaryListDto
	 */
	public RankedStatsDto customPlayerRankedRequest(Region region, long summonerId, Season season) 
			throws NotSupportedException, RequestException {
		String response = connector.getRankedStats(region, null, String.valueOf(summonerId), season);
		return parse(response, RankedStatsDto.class);
	}
}
