package john_lowther.leagueoflegends.lolconnector.dataobjects.team;

import java.util.ArrayList;
import java.util.List;

/**
 * Team stat summary data.
 * @author John Lowther
 */
public class TeamStatSummaryDto {
	private String fullId;	
	private List<TeamStatDetailDto> teamStatDetails = new ArrayList<TeamStatDetailDto>();
	
	public String getFullId() {
		return fullId;
	}
	public void setFullId(String fullId) {
		this.fullId = fullId;
	}
	public List<TeamStatDetailDto> getTeamStatDetails() {
		return teamStatDetails;
	}
	public void setTeamStatDetails(List<TeamStatDetailDto> teamStatDetails) {
		this.teamStatDetails = teamStatDetails;
	}
}
