package john_lowther.leagueoflegends.lolconnector.parselayer;

import john_lowther.leagueoflegends.lolconnector.connector.LOLStaticDataConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.ChampData;
import john_lowther.leagueoflegends.lolconnector.dataenums.ItemData;
import john_lowther.leagueoflegends.lolconnector.dataenums.MasteryData;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataenums.RuneData;
import john_lowther.leagueoflegends.lolconnector.dataenums.SpellData;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion.ChampionDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion.ChampionListDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.item.ItemDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.item.ItemListDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.mastery.MasteryDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.mastery.MasteryListDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.realm.RealmDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.rune.RuneDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.rune.RuneListDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.summonerspell.SummonerSpellDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.summonerspell.SummonerSpellListDto;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

public class LOLStaticDataParser extends Parser {
	LOLStaticDataConnector connector = new LOLStaticDataConnector();
	
	/**
	 * Retrieves all champion list data.
	 * @return ChampionListDto
	 */
	public ChampionListDto getChampionList() 
			throws NotSupportedException, RequestException {
		return customChampionListRequest(defaultRegion, null, null, ChampData.ALL);
	}
	
	/**
	 * Retrieves champion list data by data type.
	 * @return ChampionListDto
	 */
	public ChampionListDto getChampionList(ChampData champData) 
			throws NotSupportedException, RequestException {
		return customChampionListRequest(defaultRegion, null, null, champData);
	}
	
	/**
	 * Custom champion list request.
	 * @return ChampionListDto
	 */
	public ChampionListDto customChampionListRequest(Region region, String locale, String dataDragonVersion, ChampData champData) 
			throws NotSupportedException, RequestException {
		String response = connector.getChampionList(region, null, locale, dataDragonVersion, champData);
		return parse(response, ChampionListDto.class);
	}
	
	/**
	 * Retrieves all champion data.
	 * @return ChampionDto
	 */
	public ChampionDto getChampion(String championId) 
			throws NotSupportedException, RequestException {
		return customChampionRequest(defaultRegion, championId, null, null, ChampData.ALL);
	}
	
	/**
	 * Retrieves champion data by data type.
	 * @return ChampionDto
	 */
	public ChampionDto getChampion(String championId, ChampData champData) 
			throws NotSupportedException, RequestException {
		return customChampionRequest(defaultRegion, championId, null, null, champData);
	}
	
	/**
	 * Custom champion request.
	 * @return ChampionDto
	 */
	public ChampionDto customChampionRequest(Region region, String championId, String locale, String dataDragonVersion, ChampData champData) 
			throws NotSupportedException, RequestException {
		String response = connector.getChampion(region, null, championId, locale, dataDragonVersion, champData);
		return parse(response, ChampionDto.class);
	}
	
	/**
	 * Retrieves all item list data.
	 * @return ItemListDto
	 */
	public ItemListDto getItemList() 
			throws NotSupportedException, RequestException {
		return customItemListRequest(defaultRegion, null, null, ItemData.ALL);
	}
	
	/**
	 * Retrieves item list data by data type.
	 * @return ItemListDto
	 */
	public ItemListDto getItemList(ItemData itemData) 
			throws NotSupportedException, RequestException {
		return customItemListRequest(defaultRegion, null, null, itemData);
	}
	
	/**
	 * Custom item list request.
	 * @return ItemListDto
	 */
	public ItemListDto customItemListRequest(Region region, String locale, String dataDragonVersion, ItemData itemData) 
			throws NotSupportedException, RequestException {
		String response = connector.getItemList(region, null, locale, dataDragonVersion, itemData);
		return parse(response, ItemListDto.class);
	}
	
	/**
	 * Retrieves all item data.
	 * @return ItemDto
	 */
	public ItemDto getItem(String itemId) 
			throws NotSupportedException, RequestException {
		return customItemRequest(defaultRegion, itemId, null, null, ItemData.ALL);
	}
	
	/**
	 * Retrieves item data by data type.
	 * @return ItemDto
	 */
	public ItemDto getItem(String itemId, ItemData itemData) 
			throws NotSupportedException, RequestException {
		return customItemRequest(defaultRegion, itemId, null, null, itemData);
	}
	
	/**
	 * Custom item request.
	 * @return ItemDto
	 */
	public ItemDto customItemRequest(Region region, String itemId, String locale, String dataDragonVersion, ItemData itemData) 
			throws NotSupportedException, RequestException {
		String response = connector.getItem(region, null, itemId, locale, dataDragonVersion, itemData);
		return parse(response, ItemDto.class);
	}
	
	/**
	 * Retrieves all mastery list data.
	 * @return MasteryListDto
	 */
	public MasteryListDto getMasteryList() 
			throws NotSupportedException, RequestException {
		return customMasteryListRequest(defaultRegion, null, null, MasteryData.ALL);
	}
	
	/**
	 * Retrieves mastery list data by data type.
	 * @return MasteryListDto
	 */
	public MasteryListDto getMasteryList(MasteryData masteryData) 
			throws NotSupportedException, RequestException {
		return customMasteryListRequest(defaultRegion, null, null, masteryData);
	}
	
	/**
	 * Custom mastery list request.
	 * @return MasteryListDto
	 */
	public MasteryListDto customMasteryListRequest(Region region, String locale, String dataDragonVersion, MasteryData masteryData) 
			throws NotSupportedException, RequestException {
		String response = connector.getMasteryList(region, null, locale, dataDragonVersion, masteryData);
		return parse(response, MasteryListDto.class);
	}
	
	/**
	 * Retrieves all mastery data.
	 * @return MasteryDto
	 */
	public MasteryDto getMastery(String masteryId) 
			throws NotSupportedException, RequestException {
		return customMasteryRequest(defaultRegion, masteryId, null, null, MasteryData.ALL);
	}
	
	/**
	 * Retrieves mastery data by data type.
	 * @return MasteryDto
	 */
	public MasteryDto getMastery(String masteryId, MasteryData masteryData) 
			throws NotSupportedException, RequestException {
		return customMasteryRequest(defaultRegion, masteryId, null, null, masteryData);
	}
	
	/**
	 * Custom mastery request.
	 * @return MasteryDto
	 */
	public MasteryDto customMasteryRequest(Region region, String masteryId, String locale, String dataDragonVersion, MasteryData masteryData) 
			throws NotSupportedException, RequestException {
		String response = connector.getMastery(region, null, masteryId, locale, dataDragonVersion, masteryData);
		return parse(response, MasteryDto.class);
	}
	
	/**
	 * Retrieves all rune list data.
	 * @return RuneListDto
	 */
	public RuneListDto getRuneList() 
			throws NotSupportedException, RequestException {
		return customRuneListRequest(defaultRegion, null, null, RuneData.ALL);
	}
	
	/**
	 * Retrieves rune list data by data type.
	 * @return RuneListDto
	 */
	public RuneListDto getRuneList(RuneData runeData) 
			throws NotSupportedException, RequestException {
		return customRuneListRequest(defaultRegion, null, null, runeData);
	}
	
	/**
	 * Custom rune list request.
	 * @return RuneListDto
	 */
	public RuneListDto customRuneListRequest(Region region, String locale, String dataDragonVersion, RuneData runeData) 
			throws NotSupportedException, RequestException {
		String response = connector.getRuneList(region, null, locale, dataDragonVersion, runeData);
		return parse(response, RuneListDto.class);
	}
	
	/**
	 * Retrieves all rune data.
	 * @return RuneDto
	 */
	public RuneDto getRune(String runeId) 
			throws NotSupportedException, RequestException {
		return customRuneRequest(defaultRegion, runeId, null, null, RuneData.ALL);
	}
	
	/**
	 * Retrieves rune data by data type.
	 * @return RuneDto
	 */
	public RuneDto getRune(String runeId, RuneData runeData) 
			throws NotSupportedException, RequestException {
		return customRuneRequest(defaultRegion, runeId, null, null, runeData);
	}
	
	/**
	 * Custom rune request.
	 * @return RuneDto
	 */
	public RuneDto customRuneRequest(Region region, String runeId, String locale, String dataDragonVersion, RuneData runeData) 
			throws NotSupportedException, RequestException {
		String response = connector.getRune(region, null, runeId, locale, dataDragonVersion, runeData);
		return parse(response, RuneDto.class);
	}
	
	/**
	 * Retrieves all summonerSpell list data.
	 * @return SummonerSpellListDto
	 */
	public SummonerSpellListDto getSummonerSpellList() 
			throws NotSupportedException, RequestException {
		return customSummonerSpellListRequest(defaultRegion, null, null, SpellData.ALL);
	}
	
	/**
	 * Retrieves summonerSpell list data by data type.
	 * @return SummonerSpellListDto
	 */
	public SummonerSpellListDto getSummonerSpellList(SpellData spellData) 
			throws NotSupportedException, RequestException {
		return customSummonerSpellListRequest(defaultRegion, null, null, spellData);
	}
	
	/**
	 * Custom summonerSpell list request.
	 * @return SummonerSpellListDto
	 */
	public SummonerSpellListDto customSummonerSpellListRequest(Region region, String locale, String dataDragonVersion, SpellData spellData) 
			throws NotSupportedException, RequestException {
		String response = connector.getSummonerSpellList(region, null, locale, dataDragonVersion, spellData);
		return parse(response, SummonerSpellListDto.class);
	}
	
	/**
	 * Retrieves all summonerSpell data.
	 * @return SummonerSpellDto
	 */
	public SummonerSpellDto getSummonerSpell(String summonerSpellId) 
			throws NotSupportedException, RequestException {
		return customSummonerSpellRequest(defaultRegion, summonerSpellId, null, null, SpellData.ALL);
	}
	
	/**
	 * Retrieves summonerSpell data by data type.
	 * @return SummonerSpellDto
	 */
	public SummonerSpellDto getSummonerSpell(String summonerSpellId, SpellData spellData) 
			throws NotSupportedException, RequestException {
		return customSummonerSpellRequest(defaultRegion, summonerSpellId, null, null, spellData);
	}
	
	/**
	 * Custom summonerSpell request.
	 * @return SummonerSpellDto
	 */
	public SummonerSpellDto customSummonerSpellRequest(Region region, String summonerSpellId, String locale, String dataDragonVersion, SpellData spellData) 
			throws NotSupportedException, RequestException {
		String response = connector.getSummonerSpell(region, null, summonerSpellId, locale, dataDragonVersion, spellData);
		return parse(response, SummonerSpellDto.class);
	}
	
	/**
	 * Retrieves realm data.
	 * @return SummonerSpellDto
	 */
	public RealmDto getRealm() 
			throws NotSupportedException, RequestException {
		return customRealmRequest(defaultRegion);
	}
	
	/**
	 * Custom realm data request.
	 * @return SummonerSpellDto
	 */
	public RealmDto customRealmRequest(Region region) 
			throws NotSupportedException, RequestException {
		String response = connector.getRealm(region, null);
		return parse(response, RealmDto.class);
	}
}
