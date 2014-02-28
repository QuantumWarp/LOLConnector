package john_lowther.leagueoflegends.lolconnector.dataobjects.team;

import java.util.List;

/**
 * Roster data.
 * @author John Lowther
 */
public class RosterDto {
	private	List<TeamMemberInfoDto>	memberList;
	private long ownerId;
	
	public List<TeamMemberInfoDto> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<TeamMemberInfoDto> memberList) {
		this.memberList = memberList;
	}
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
}
