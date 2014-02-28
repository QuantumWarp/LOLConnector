package john_lowther.leagueoflegends.lolconnector.parselayer;

import john_lowther.leagueoflegends.lolconnector.connector.ChampionConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.champion.ChampionListDto;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

/**
 * Provides meaningful champion requests.
 * @author John Lowther
 */
public class ChampionParser extends Parser {
	ChampionConnector connector = new ChampionConnector();
	
	/**
	 * Retrieve all champions.
	 * @return ChampionListDto
	 */
	public ChampionListDto getChampions() 
			throws NotSupportedException, RequestException {
		String response = connector.getChampions(defaultRegion, null, null);
		return parse(response, ChampionListDto.class);
	}
	
	/**
	 * Retrieve all free to play champions.
	 * @return ChampionListDto
	 */
	public ChampionListDto getFreeToPlayChampions() 
			throws NotSupportedException, RequestException {
		String response = connector.getChampions(defaultRegion, null, true);
		return parse(response, ChampionListDto.class);
	}
	
	/**
	 * Custom champion request.
	 * @return ChampionListDto
	 */
	public ChampionListDto customChampionRequest(Region region, boolean freeToPlay) 
			throws NotSupportedException, RequestException{
		String response = connector.getChampions(defaultRegion, null, true);
		return parse(response, ChampionListDto.class);
	}
}
