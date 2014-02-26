package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;

/**
 * Provides lol static data requests.
 * Supports BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR on version 1.3
 * @author John Lowther
 */
public class LOLStaticDataConnector extends LOLConnector {
	private final String championListRequest = "/api/lol/static-data/%s/%s/champion";
	private final String championRequest = "/api/lol/static-data/%s/%s/champion/%s";
	private final String itemListRequest = "/api/lol/static-data/{region}/v1/item";
	private final String itemRequest = "/api/lol/static-data/%s/%s/item/%s";
	private final String masteryListRequest = "/api/lol/static-data/%s/%s/mastery";
	private final String masteryRequest = "/api/lol/static-data/%s/%s/mastery/%s";
	private final String runeListRequest = "/api/lol/static-data/%s/%s/rune";
	private final String runeRequest = "/api/lol/static-data/%s/%s/rune/%s";
	private final String summonerSpellListRequest = "/api/lol/static-data/%s/%s/summoner-spell";
	private final String summonerSpellRequest = "/api/lol/static-data/%s/%s/summoner-spell/%s";
	private final String realmRequest = "/api/lol/static-data/%s/%s/realm";
	
	
	public LOLStaticDataConnector() {
		this(true);
	}
	
	public LOLStaticDataConnector(boolean isValidating) {
		super(isValidating);
		setSupported(Version.ONE, Region.BRAZIL, Region.EU_NORDIC_AND_EAST, Region.EU_WEST,
				Region.KOREA, Region.LATIN_AMERICA_NORTH, Region.LATIN_AMERICA_SOUTH,
				Region.RUSSIA, Region.NORTH_AMERICA, Region.OCEANIA, Region.TURKEY);
	}
	
	/**
	 * Retrieves champion list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON champion list info
	 */
	public String getChampionList(Region region, Version version) 
			throws NotSupportedException {
		String request = constructRequest(championListRequest, region, version);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves a champion by its id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param championId
	 * @return JSON champion info
	 */
	public String getChampion(Region region, Version version, String championId) 
			throws NotSupportedException {
		String request = constructRequest(championRequest, region, version);
		
		request = String.format(request, championId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves item list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON item list info
	 */
	public String getItemList(Region region, Version version) 
			throws NotSupportedException {
		String request = constructRequest(itemListRequest, region, version);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves item by its unique id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param itemId
	 * @return JSON item info
	 */
	public String getItem(Region region, Version version, String itemId) 
			throws NotSupportedException {
		String request = constructRequest(itemRequest, region, version);
		
		request = String.format(request, itemId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves mastery list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param masteryId
	 * @return JSON mastery list info
	 */
	public String getMasteryList(Region region, Version version) 
			throws NotSupportedException {
		String request = constructRequest(masteryListRequest, region, version);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves mastery item by its unique id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param masteryId
	 * @return JSON mastery info
	 */
	public String getMastery(Region region, Version version, String masteryId) 
			throws NotSupportedException {
		String request = constructRequest(masteryRequest, region, version);
		
		request = String.format(request, masteryId);
		
		return Connector.getInstance().submitApiRequest(request);
	}	
	
	/**
	 * Retrieves rune list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param runeId
	 * @return JSON rune list info
	 */
	public String getRuneList(Region region, Version version) 
			throws NotSupportedException {
		String request = constructRequest(runeListRequest, region, version);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves rune by its uniwue id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param runeId
	 * @return JSON rune info
	 */
	public String getRune(Region region, Version version, String runeId) 
			throws NotSupportedException {
		String request = constructRequest(runeRequest, region, version);
		
		request = String.format(request, runeId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves summoner spell list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerSpellId
	 * @return JSON summoner spell list info
	 */
	public String getSummonerSpellList(Region region, Version version) 
			throws NotSupportedException {
		String request = constructRequest(summonerSpellListRequest, region, version);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieves summoner spell by its unique id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerSpellId
	 * @return JSON summoner spell info
	 */
	public String getSummonerSpell(Region region, Version version, String summonerSpellId) 
			throws NotSupportedException {
		String request = constructRequest(summonerSpellRequest, region, version);
		
		request = String.format(request, summonerSpellId);
		
		return Connector.getInstance().submitApiRequest(request);
	}
	
	/**
	 * Retrieve realm data.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param realmId
	 * @return JSON realm info
	 */
	public String getRealm(Region region, Version version) 
			throws NotSupportedException {
		String request = constructRequest(realmRequest, region, version);
		
		return Connector.getInstance().submitApiRequest(request);
	}
}
