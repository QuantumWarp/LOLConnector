package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Season;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

/**
 * Provides stats requests.
 * Supports BR, EUNE, EUW, LAN, LAS, NA, OCE on version 1.2
 * @author John Lowther
 */
public class StatsConnector extends LOLConnector {
	private final String statsSummaryRequest = "/api/lol/%s/%s/stats/by-summoner/%s/summary";
	private final String rankedStatsRequest = "/api/lol/%s/%s/stats/by-summoner/%s/ranked";
	
	public StatsConnector() {
		this(true);
	}
	
	public StatsConnector(boolean isValidating) {
		super(isValidating);
		setSupported(Version.ONE_POINT_TWO, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.LATIN_AMERICA_NORTH, Region.LATIN_AMERICA_SOUTH,
				Region.NORTH_AMERICA, Region.OCEANIA);
	}
	
	/**
	 * Get player stats summaries by summoner ID. One summary is returned per queue type.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON stats summary info
	 * @throws RequestException 
	 */
	public String getStatsSummary(Region region, Version version, String summonerId, Season season) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(statsSummaryRequest, region, version);
		
		request = String.format(request, summonerId);

		if (season != null)
			request = addParamToRequest(request, "season", season.getCode());
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Get ranked stats by summoner ID. Includes statistics for Twisted Treeline and Summoner's Rift.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON ranked stats info
	 * @throws RequestException 
	 */
	public String getRankedStats(Region region, Version version, String summonerId, Season season) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(rankedStatsRequest, region, version);
		
		request = String.format(request, summonerId);

		if (season != null)
			request = addParamToRequest(request, "season", season.getCode());
		
		return Connector.getInstance().submitApiRequest(request);
	}
}
