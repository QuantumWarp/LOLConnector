package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;

/**
 * Provides champion requests.
 * Supports BR, EUNE, EUW, LAN, LAS, NA, OCE.
 * @author John Lowther
 */
public class ChampionConnector extends LOLConnector {
	private final String allChampionRequest = "/api/lol/%s/%s/champion";
	
	public ChampionConnector() {
		this(true);
	}
	
	public ChampionConnector(boolean isValidating) {
		super(isValidating);
		setSupported(Version.ONE_POINT_ONE, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.LATIN_AMERICA_NORTH, Region.LATIN_AMERICA_SOUTH,
				Region.NORTH_AMERICA, Region.OCEANIA);
	}
	
	/**
	 * Retrieve all champions
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param freeToPlay true returns only free to play champions
	 * @return JSON champions
	 */
	public String getChampions(Region region, Version version, Boolean freeToPlay) 
			throws NotSupportedException {
		String request = constructRequest(allChampionRequest, region, version);
		
		if (freeToPlay != null)
			request = addParamToRequest(request, "freeToPlay", freeToPlay);
		
		return Connector.getInstance().submitApiRequest(request);
	}
}
