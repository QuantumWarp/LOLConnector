package john_lowther.leagueoflegends.lolconnector.parselayer;

import john_lowther.leagueoflegends.lolconnector.connector.LOLStaticDataConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.ChampData;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion.ChampionDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion.ChampionListDto;
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
	
	
}
