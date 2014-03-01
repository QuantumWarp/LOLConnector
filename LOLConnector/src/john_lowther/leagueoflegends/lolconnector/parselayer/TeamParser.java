package john_lowther.leagueoflegends.lolconnector.parselayer;

import java.util.List;
import java.util.Map;

import john_lowther.leagueoflegends.lolconnector.connector.TeamConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.team.TeamDto;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

import com.google.gson.reflect.TypeToken;

public class TeamParser extends Parser {
	TeamConnector connector = new TeamConnector();
	
	/**
	 * Get ranked stats by summoner ID. Includes statistics for Twisted Treeline and Summoner's Rift.
	 * @return List<TeamDto>
	 */
	public List<TeamDto> getTeamsbySummonerId(long summonerId) 
			throws NotSupportedException, RequestException {
		return customTeamsbySummonerIdRequest(defaultRegion, summonerId);
	}
	
	/**
	 * Custom ranked stats request by summoner ID. Includes statistics for Twisted Treeline and Summoner's Rift.
	 * @return List<TeamDto>
	 */
	public List<TeamDto> customTeamsbySummonerIdRequest(Region region, long summonerId) 
			throws NotSupportedException, RequestException {
		String response = connector.getTeamsBySummonerId(region, null, String.valueOf(summonerId));
		return parse(response, new TypeToken<List<TeamDto>>(){}.getType());
	}
	
	/**
	 * Get teams mapped by team ID for a given list of team IDs.
	 * @return Map<String, TeamDto>
	 */
	public Map<String, TeamDto> getTeamsbyTeamIds(long... teamIds) 
			throws NotSupportedException, RequestException {
		return customTeamsbyTeamIdsRequest(defaultRegion, teamIds);
	}
	
	/**
	 * Custom teams request mapped by team ID for a given list of team IDs.
	 * @return Map<String, TeamDto>
	 */
	public Map<String, TeamDto> customTeamsbyTeamIdsRequest(Region region, long... teamIds) 
			throws NotSupportedException, RequestException {
		String response = connector.getTeamsByTeamIds(region, null, stringTogether(teamIds));
		return parse(response, new TypeToken<Map<String, TeamDto>>(){}.getType());
	}
}
