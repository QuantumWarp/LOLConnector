package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.GameType;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;

/**
 * Provides league requests.
 * Supports BR, EUNE, EUW, NA, TR on versions 2.3, 2.2 and 2.1
 * @author John Lowther
 */
public class LeagueConnector extends LOLConnector {
	private final String leagueChallengerRequest = "/api/lol/{region}/v2.3/league/challenger";
	private final String leagueEntryRequest = "/api/lol/%s/%s/league/by-summoner/%s/entry";
	private final String leagueRequest = "/api/lol/%s/%s/league/by-summoner/%s";
	
	public LeagueConnector() {
		this(true);
	}
	
	public LeagueConnector(boolean isValidating) {
		super(isValidating);
		setSupported(Version.TWO_POINT_THREE, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.NORTH_AMERICA, Region.TURKEY);
		setSupported(Version.TWO_POINT_TWO, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.NORTH_AMERICA, Region.TURKEY);
		setSupported(Version.TWO_POINT_ONE, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.NORTH_AMERICA, Region.TURKEY);
	}
	
	/**
	 * Retrieves leagues data for summoner, including leagues for all of summoner's teams
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON league info
	 */
	public String getLeague(Region region, Version version, String summonerId) 
			throws NotSupportedException {
		
		String request = constructRequest(leagueRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves leagues entry data for summoner, including league entries for all of summoner's teams
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON league info
	 */
	public String getLeagueEntry(Region region, Version version, String summonerId) 
			throws NotSupportedException {
		
		String request = constructRequest(leagueEntryRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves challenger tier leagues
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON league info
	 */
	public String getLeagueChallenger(Region region, Version version, GameType gameType) 
			throws NotSupportedException {
		
		String request = constructRequest(leagueChallengerRequest, region, version);
		
		request = addParamToRequest(request, "type", gameType.toString());
		
		return Connector.getInstance().submitApiRequest(request);
	}
}