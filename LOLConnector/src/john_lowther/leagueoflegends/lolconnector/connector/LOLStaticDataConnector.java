package john_lowther.leagueoflegends.lolconnector.connector;

import john_lowther.leagueoflegends.lolconnector.dataenums.ChampData;
import john_lowther.leagueoflegends.lolconnector.dataenums.ItemData;
import john_lowther.leagueoflegends.lolconnector.dataenums.MasteryData;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.RuneData;
import john_lowther.leagueoflegends.lolconnector.dataenums.SpellData;
import john_lowther.leagueoflegends.lolconnector.dataenums.Version;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

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
	 * @throws RequestException 
	 */
	public String getChampionList(Region region, Version version, String locale, String dataDragonVersion, ChampData champData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(championListRequest, region, version);
		
		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (champData != null)
			request = addParamToRequest(request, "champData", champData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves a champion by its id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param championId
	 * @return JSON champion info
	 * @throws RequestException 
	 */
	public String getChampion(Region region, Version version, String championId, String locale, String dataDragonVersion, ChampData champData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(championRequest, region, version);
		
		request = String.format(request, championId);

		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (champData != null)
			request = addParamToRequest(request, "champData", champData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves item list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerId
	 * @return JSON item list info
	 * @throws RequestException 
	 */
	public String getItemList(Region region, Version version, String locale, String dataDragonVersion, ItemData itemData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(itemListRequest, region, version);
		
		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (itemData != null)
			request = addParamToRequest(request, "itemData", itemData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves item by its unique id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param itemId
	 * @return JSON item info
	 * @throws RequestException 
	 */
	public String getItem(Region region, Version version, String itemId, String locale, String dataDragonVersion, ItemData itemData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(itemRequest, region, version);
		
		request = String.format(request, itemId);
		
		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (itemData != null)
			request = addParamToRequest(request, "itemData", itemData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves mastery list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param masteryId
	 * @return JSON mastery list info
	 * @throws RequestException 
	 */
	public String getMasteryList(Region region, Version version, String locale, String dataDragonVersion, MasteryData masteryData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(masteryListRequest, region, version);
		
		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (masteryData != null)
			request = addParamToRequest(request, "masteryData", masteryData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves mastery item by its unique id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param masteryId
	 * @return JSON mastery info
	 * @throws RequestException 
	 */
	public String getMastery(Region region, Version version, String masteryId, String locale, String dataDragonVersion, MasteryData masteryData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(masteryRequest, region, version);
		
		request = String.format(request, masteryId);

		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (masteryData != null)
			request = addParamToRequest(request, "masteryData", masteryData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}	
	
	/**
	 * Retrieves rune list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param runeId
	 * @return JSON rune list info
	 * @throws RequestException 
	 */
	public String getRuneList(Region region, Version version, String locale, String dataDragonVersion, RuneData runeData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(runeListRequest, region, version);

		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (runeData != null)
			request = addParamToRequest(request, "runeData", runeData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves rune by its uniwue id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param runeId
	 * @return JSON rune info
	 * @throws RequestException 
	 */
	public String getRune(Region region, Version version, String runeId, String locale, String dataDragonVersion, RuneData runeData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(runeRequest, region, version);
		
		request = String.format(request, runeId);
		
		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (runeData != null)
			request = addParamToRequest(request, "runeData", runeData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves summoner spell list.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerSpellId
	 * @return JSON summoner spell list info
	 * @throws RequestException 
	 */
	public String getSummonerSpellList(Region region, Version version, String locale, String dataDragonVersion, SpellData spellData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(summonerSpellListRequest, region, version);
		
		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (spellData != null)
			request = addParamToRequest(request, "spellData", spellData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieves summoner spell by its unique id.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param summonerSpellId
	 * @return JSON summoner spell info
	 * @throws RequestException 
	 */
	public String getSummonerSpell(Region region, Version version, String summonerSpellId, String locale, String dataDragonVersion, SpellData spellData) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(summonerSpellRequest, region, version);
		
		request = String.format(request, summonerSpellId);
		
		if (locale != null)
			request = addParamToRequest(request, "locale", locale);
		
		if (dataDragonVersion != null)
			request = addParamToRequest(request, "version", dataDragonVersion);
		
		if (spellData != null)
			request = addParamToRequest(request, "spellData", spellData.getCode());
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
	
	/**
	 * Retrieve realm data.
	 * @param region (must be provided)
	 * @param version (if null defaults to latest)
	 * @param realmId
	 * @return JSON realm info
	 * @throws RequestException 
	 */
	public String getRealm(Region region, Version version) 
			throws NotSupportedException, RequestException {
		String request = constructRequest(realmRequest, region, version);
		
		return Connector.getInstance().submitApiRequest(request, false);
	}
}
