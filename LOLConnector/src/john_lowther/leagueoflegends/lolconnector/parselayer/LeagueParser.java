package john_lowther.leagueoflegends.lolconnector.parselayer;

import java.util.List;

import john_lowther.leagueoflegends.lolconnector.connector.LeagueConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.GameType;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.league.LeagueDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.league.LeagueItemDto;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

import com.google.gson.reflect.TypeToken;

public class LeagueParser extends Parser {
	LeagueConnector connector = new LeagueConnector();
	
	/**
	 * Retrieve challenger tier by game type.
	 * @return LeagueDto
	 */
	public LeagueDto getChallengerTier(GameType gameType) 
			throws NotSupportedException, RequestException {
		return customChallengerTierRequest(defaultRegion, gameType);
	}
	
	/**
	 * Custom challenger tier request.
	 * @return LeagueDto
	 */
	public LeagueDto customChallengerTierRequest(Region region, GameType gameType) 
			throws NotSupportedException, RequestException {
		String response = connector.getLeagueChallenger(region, null, gameType);
		return parse(response, LeagueDto.class);
	}
	
	/**
	 * Retrieves leagues entry data for summoner, including league 
	 * entries for all of summoner's teams.
	 * @return LeagueItemDto
	 */
	public List<LeagueItemDto> getSummonerEntry(long summonerId) 
			throws NotSupportedException, RequestException {
		return customSummonerEntryRequest(defaultRegion, summonerId);
	}
	
	/**
	 * Custom retrieval of league entry data for summoner, including league 
	 * entries for all of summoner's teams.
	 * @return LeagueItemDto
	 */
	public List<LeagueItemDto> customSummonerEntryRequest(Region region, long summonerId) 
			throws NotSupportedException, RequestException {
		String response = connector.getLeagueEntry(region, null, String.valueOf(summonerId));
		return parse(response, new TypeToken<List<LeagueItemDto>>(){}.getType());
	}
	
	/**
	 * Retrieves leagues data for summoner, including leagues for 
	 * all of summoner's teams.
	 * @return LeagueDto
	 */
	public List<LeagueDto> getSummonerLeague(long summonerId) 
			throws NotSupportedException, RequestException {
		return customSummonerLeagueRequest(defaultRegion, summonerId);
	}
	
	/**
	 * Custom retrieval of league data for summoner, including leagues for 
	 * all of summoner's teams.
	 * @return LeagueDto
	 */
	public List<LeagueDto> customSummonerLeagueRequest(Region region, long summonerId) 
			throws NotSupportedException, RequestException {
		String response = connector.getLeague(region, null, String.valueOf(summonerId));
		return parse(response, new TypeToken<List<LeagueDto>>(){}.getType());
	}
}
