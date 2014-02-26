package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;

/**
 * Provides team requests.
 * Supports BR, EUNE, EUW, NA, TR on version 2.2 and 2.1
 * @author John Lowther
 */
public class TeamConnector extends LOLConnector {
	private final String teamsBySummonerIdRequest = "/api/lol/%s/%s/team/by-summoner/%s";
	private final String teamsByTeamIdsRequest = "/api/lol/%s/%s/team/%s";
	
	public TeamConnector() {
		this(true);
	}
	
	public TeamConnector(boolean isValidating) {
		super(isValidating);
		setSupported(Version.TWO_POINT_TWO, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.NORTH_AMERICA, Region.TURKEY);
		setSupported(Version.TWO_POINT_ONE, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.NORTH_AMERICA, Region.TURKEY);
	}
	
	/**
	 * Team retrieval by summoner id
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON teams info
	 */
	public String getTeamsBySummonerId(Region region, Version version, String summonerId) 
			throws NotSupportedException {
		String request = constructRequest(teamsBySummonerIdRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Team retrieval by team ids
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON teams info
	 */
	public String getTeamsByTeamIds(Region region, Version version, String teamIds) 
			throws NotSupportedException {
		String request = constructRequest(teamsByTeamIdsRequest, region, version);
		
		request = String.format(request, teamIds);
		
		return Connector.getInstance().submitApiRequest(request);
	}
}