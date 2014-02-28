package john_lowther.leagueoflegends.lolconnector.dataobjects.summoner;

import java.util.List;

/**
 * Mastery page by summoner data.
 * @author John Lowther
 */
public class MasteryPageDto {
	private boolean current;
	private long id;
	private String name;
	private List<TalentDto> talents;
	
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TalentDto> getTalents() {
		return talents;
	}
	public void setTalents(List<TalentDto> talents) {
		this.talents = talents;
	}
}
