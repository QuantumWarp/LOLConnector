package john_lowther.leagueoflegends.lolconnector.dataobjects.league;

import java.util.List;

/**
 * League data.
 * @author John Lowther
 */
public class LeagueDto {
	private List<LeagueItemDto> entries;
	private String name;
	private String participantId;
	private String queue;
	private String tier;
	
	public List<LeagueItemDto> getEntries() {
		return entries;
	}
	public void setEntries(List<LeagueItemDto> entries) {
		this.entries = entries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParticipantId() {
		return participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
}
