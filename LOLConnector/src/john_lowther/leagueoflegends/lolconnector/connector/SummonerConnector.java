package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;

/**
 * Provides summoner requests.
 * Supports BR, EUNE, EUW, LAN, LAS, NA, OCE on version 1.3
 * Supports EUNE, EUW, NA on version 1.2
 * @author John Lowther
 */
public class SummonerConnector extends LOLConnector {
	private final String masteriesRequest = "/api/lol/%s/%s/summoner/%s/masteries";
	private final String runesRequest = "/api/lol/%s/%s/summoner/%s/runes";
	private final String summonerObjectsByNamesRequest = "/api/lol/%s/%s/summoner/by-name/%s";
	private final String summonerNamesRequest = "/api/lol/%s/%s/summoner/%s/name";
	private final String summonerObjectsByIdsRequest = "/api/lol/%s/%s/summoner/%s";
	
	public SummonerConnector() {
		this(true);
	}
	
	public SummonerConnector(boolean isValidating) {
		super(isValidating);
		setSupported(Version.ONE_POINT_THREE, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.LATIN_AMERICA_NORTH, Region.LATIN_AMERICA_SOUTH,
				Region.NORTH_AMERICA, Region.OCEANIA);
		setSupported(Version.ONE_POINT_TWO, Region.EU_NORDIC_AND_EAST, Region.EU_WEST, Region.NORTH_AMERICA);
	}
	
	/**
	 * Masteries retrieval by summoner
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON summoner masteries info
	 */
	public String getMasteries(Region region, Version version, String summonerId) 
			throws NotSupportedException {
		String request = constructRequest(masteriesRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Runes retrieval by summoner
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON summoner runes info
	 */
	public String getRunes(Region region, Version version, String summonerId) 
			throws NotSupportedException {
		String request = constructRequest(runesRequest, region, version);
		
		request = String.format(request, summonerId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Summoner objects retrieval by names
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerNames
	 * @return JSON summoner info
	 */
	public String getSummonerObjectsByNames(Region region, Version version, String summonerNames) 
			throws NotSupportedException {
		String request = constructRequest(summonerObjectsByNamesRequest, region, version);
		
		request = String.format(request, summonerNames);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Summoner names retrieval by ids
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerIds
	 * @return JSON summoner names info
	 */
	public String getSummonerNames(Region region, Version version, String summonerIds) 
			throws NotSupportedException {
		String request = constructRequest(summonerNamesRequest, region, version);
		
		request = String.format(request, summonerIds);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Summoner object retrieval by ids
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerIds
	 * @return JSON summoner info
	 */
	public String getSummonerObjectsByIds(Region region, Version version, String summonerIds) 
			throws NotSupportedException {
		String request = constructRequest(summonerObjectsByIdsRequest, region, version);
		
		request = String.format(request, summonerIds);
		
		return Connector.getInstance().submitApiRequest(request);
	}
}
