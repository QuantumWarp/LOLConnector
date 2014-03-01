package john_lowther.leagueoflegends.lolconnector.dataobjects.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Recent games dto.
 * @author John Lowther
 */
public class RecentGamesDto {
	private List<GameDto> games = new ArrayList<GameDto>();
	private long summonerId;
	
	public List<GameDto> getGames() {
		return games;
	}
	public void setGames(List<GameDto> games) {
		this.games = games;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
