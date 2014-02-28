package john_lowther.leagueoflegends.lolconnector.dataobjects.summoner;

import java.util.List;

/**
 * Mastery pages dto.
 * @author John Lowther
 */
public class MasteryPagesDto {
	private List<MasteryPageDto> pages;
	private long summonerId;
	
	public List<MasteryPageDto> getPages() {
		return pages;
	}
	public void setPages(List<MasteryPageDto> pages) {
		this.pages = pages;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
