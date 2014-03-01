package john_lowther.leagueoflegends.lolconnector.dataobjects.summoner;

import java.util.ArrayList;
import java.util.List;

/**
 * Rune pages dto.
 * @author John Lowther
 */
public class RunePagesDto {
	private List<RunePageDto> pages = new ArrayList<RunePageDto>();
	private long summonerId;
	
	public List<RunePageDto> getPages() {
		return pages;
	}
	public void setPages(List<RunePageDto> pages) {
		this.pages = pages;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
