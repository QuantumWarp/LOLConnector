package john_lowther.leagueoflegends.lolconnector.dataobjects.league;

import java.util.ArrayList;
import java.util.List;

/**
 * Mini series data.
 * @author John Lowther
 */
public class MiniSeriesDto {
	private int losses;
	private List<Character> progress = new ArrayList<Character>();
	private int target;
	private long timeLeftToPlayMillis;
	private int wins;
	
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public List<Character> getProgress() {
		return progress;
	}
	public void setProgress(List<Character> progress) {
		this.progress = progress;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public long getTimeLeftToPlayMillis() {
		return timeLeftToPlayMillis;
	}
	public void setTimeLeftToPlayMillis(long timeLeftToPlayMillis) {
		this.timeLeftToPlayMillis = timeLeftToPlayMillis;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
}
