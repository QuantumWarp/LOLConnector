package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;

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
	 * Stats summary retrieval by summoner
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON stats summary info
	 */
	public String getStatsSummary(Region region, Version version, String summonerId) 
			throws NotSupportedException {
		String request = constructRequest(statsSummaryRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Ranked stats retrieval by summoner
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON ranked stats info
	 */
	public String getRankedStats(Region region, Version version, String summonerId) 
			throws NotSupportedException {
		String request = constructRequest(rankedStatsRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
}
