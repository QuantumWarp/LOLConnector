package john_lowther.leagueoflegends.lolconnector.parselayer;

import java.util.Map;

import john_lowther.leagueoflegends.lolconnector.connector.SummonerConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.summoner.MasteryPagesDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.summoner.RunePagesDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.summoner.SummonerDto;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

import com.google.gson.reflect.TypeToken;

public class SummonerParser extends Parser {
	SummonerConnector connector = new SummonerConnector();
	
	/**
	 * Get summoner id from name.
	 * @return summoner id
	 */
	public long getSummonerId(Region region, String name) throws NotSupportedException, RequestException {
		Map<String, SummonerDto> map = customSummonersByNamesRequest(region, name);
		return map.get(name.toLowerCase()).getId();
	}
	
	/**
	 * Get mastery pages mapped by summoner ID for a given list of summoner IDs.
	 * @return Map<String, MasteryPagesDto>
	 */
	public Map<String, MasteryPagesDto> getMasteryPages(long... summonerIds) 
			throws NotSupportedException, RequestException {
		return customMasteryPagesRequest(defaultRegion, summonerIds);
	}
	
	/**
	 * Custom mastery pages request mapped by summoner ID for a given list of summoner IDs.
	 * @return Map<String, MasteryPagesDto>
	 */
	public Map<String, MasteryPagesDto> customMasteryPagesRequest(Region region, long... summonerIds) 
			throws NotSupportedException, RequestException {
		String response = connector.getMasteries(region, null, stringTogether(summonerIds));
		return parse(response, new TypeToken<Map<String, MasteryPagesDto>>(){}.getType());
	}
	
	/**
	 * Get rune pages mapped by summoner ID for a given list of summoner IDs.
	 * @return Map<String, RunePagesDto>
	 */
	public Map<String, RunePagesDto> getRunePages(long... summonerIds) 
			throws NotSupportedException, RequestException {
		return customRunePagesRequest(defaultRegion, summonerIds);
	}
	
	/**
	 * Custom rune pages request mapped by summoner ID for a given list of summoner IDs.
	 * @return Map<String, RunePagesDto>
	 */
	public Map<String, RunePagesDto> customRunePagesRequest(Region region, long... summonerIds) 
			throws NotSupportedException, RequestException {
		String response = connector.getRunes(region, null, stringTogether(summonerIds));
		return parse(response, new TypeToken<Map<String, RunePagesDto>>(){}.getType());
	}
	
	/**
	 * Get summoner objects mapped by standardized summoner name for a given list of summoner names or 
     * standardized summoner names
	 * @return Map<String, SummonerDto>
	 */
	public Map<String, SummonerDto> getSummonersByNames(String... summonerNames) 
			throws NotSupportedException, RequestException {
		return customSummonersByNamesRequest(defaultRegion, summonerNames);
	}
	
	/**
	 * Custom summoner objects request mapped by standardized summoner name for a given list of summoner names or 
	 * standardized summoner names
	 * @return Map<String, SummonerDto>
	 */
	public Map<String, SummonerDto> customSummonersByNamesRequest(Region region, String... summonerNames) 
			throws NotSupportedException, RequestException {
		String response = connector.getSummonerObjectsByNames(region, null, stringTogether(summonerNames));
		return parse(response, new TypeToken<Map<String, SummonerDto>>(){}.getType());
	}
	
	/**
	 * Get summoner names mapped by summoner ID for a given list of summoner IDs.
	 * @return Map<String, String>
	 */
	public Map<String, String> getSummonerNames(long... summonerIds) 
			throws NotSupportedException, RequestException {
		return customSummonerNamesRequest(defaultRegion, summonerIds);
	}
	
	/**
	 * Custom summoner names request mapped by summoner ID for a given list of summoner IDs. 
	 * @return Map<String, String>
	 */
	public Map<String, String> customSummonerNamesRequest(Region region, long... summonerIds) 
			throws NotSupportedException, RequestException {
		String response = connector.getSummonerNames(region, null, stringTogether(summonerIds));
		return parse(response, new TypeToken<Map<String, String>>(){}.getType());
	}
	
	/**
	 * Get summoner objects mapped by summoner ID for a given list of summoner IDs.
	 * @return Map<String, SummonerDto>
	 */
	public Map<String, SummonerDto> getSummonersByIds(long... summonerIds) 
			throws NotSupportedException, RequestException {
		return customSummonersByIdsRequest(defaultRegion, summonerIds);
	}
	
	/**
	 * Custom summoner objects request mapped by summoner ID for a given list of summoner IDs.
	 * @return Map<String, SummonerDto>
	 */
	public Map<String, SummonerDto> customSummonersByIdsRequest(Region region, long... summonerIds) 
			throws NotSupportedException, RequestException {
		String response = connector.getSummonerObjectsByIds(region, null, stringTogether(summonerIds));
		return parse(response, new TypeToken<Map<String, SummonerDto>>(){}.getType());
	}
}
