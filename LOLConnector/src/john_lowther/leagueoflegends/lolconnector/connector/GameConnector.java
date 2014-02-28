package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

/**
 * Provides champion requests.
 * Supports BR, EUNE, EUW, LAN, LAS, NA, OCE on version 1.3
 * Supports EUNE, EUW, NA on version 1.2
 * @author John Lowther
 */
public class GameConnector extends LOLConnector {
	private final String gameRequest = "/api/lol/%s/%s/game/by-summoner/%s/recent";
	
	public GameConnector() {
		this(true);
	}
	
	public GameConnector(boolean isValidating) {
		super(isValidating);
		setSupported(Version.ONE_POINT_THREE, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.LATIN_AMERICA_NORTH, Region.LATIN_AMERICA_SOUTH,
				Region.NORTH_AMERICA, Region.OCEANIA);
		setSupported(Version.ONE_POINT_TWO, Region.EU_NORDIC_AND_EAST, Region.EU_WEST, Region.NORTH_AMERICA);
	}
	
	/**
	 * Get recent games by summoner ID
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON game info
	 * @throws RequestException 
	 */
	public String getGame(Region region, Version version, String summonerId) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(gameRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
}
