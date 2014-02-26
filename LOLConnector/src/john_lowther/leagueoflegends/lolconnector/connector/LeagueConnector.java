package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;

/**
 * Provides league requests.
 * Supports BR, EUNE, EUW, NA, TR on versions 2.3, 2.2 and 2.1
 * @author John Lowther
 */
public class LeagueConnector extends LOLConnector {
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
	 * League retrieval by summoner
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
}