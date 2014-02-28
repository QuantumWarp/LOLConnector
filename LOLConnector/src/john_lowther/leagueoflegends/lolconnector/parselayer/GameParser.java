package john_lowther.leagueoflegends.lolconnector.parselayer;

import john_lowther.leagueoflegends.lolconnector.connector.GameConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.game.RecentGamesDto;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;

/**
 * Provides meaningful game requests.
 * @author John Lowther
 */
public class GameParser extends Parser {
	GameConnector connector = new GameConnector();
	
	/**
	 * Retrieve all recent games by summoner id.
	 * @return RecentGamesDto
	 */
	public RecentGamesDto getRecentGames(long summonerId) 
			throws NotSupportedException, RequestException {
		return customRecentGamesRequest(defaultRegion, summonerId);
	}
	
	/**
	 * Custom recent games request.
	 * @return RecentGamesDto
	 */
	public RecentGamesDto customRecentGamesRequest(Region region, long summonerId) 
			throws NotSupportedException, RequestException {
		String response = connector.getGame(region, null, String.valueOf(summonerId));
		return parse(response, RecentGamesDto.class);
	}
}
