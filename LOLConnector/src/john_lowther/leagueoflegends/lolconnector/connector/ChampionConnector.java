package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;

/**
 * Provides champion requests.
 * @author John Lowther
 */
public class ChampionConnector extends LOLConnector {
	private final String allChampionRequest = "https://prod.api.pvp.net/api/lol/%s/%s/champion";
	
	/**
	 * Default champion retrieval
	 * @param region
	 * @param version
	 * @return JSON champions
	 */
	public String getChampions(Region region, String version) {
		String request = String.format(allChampionRequest, region.getCode(), version);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Parametered champion retrieval
	 * @param region
	 * @param version
	 * @param freeToPlay true returns only free to play champions
	 * @return JSON champions
	 */
	public String getChampions(Region region, String version, boolean freeToPlay) {
		String request = String.format(allChampionRequest, region.getCode(), version);
		
		request = addParamToRequest(request, "freeToPlay", freeToPlay);
		
		return Connector.getInstance().submitApiRequest(request);
	}
}
