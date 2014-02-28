package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.mastery;

/**
 * Mastery tree item data.
 * @author John Lowther
 */
public class MasteryTreeItemDto {
	private String masteryId;
	private String prereq;
	
	public String getMasteryId() {
		return masteryId;
	}
	public void setMasteryId(String masteryId) {
		this.masteryId = masteryId;
	}
	public String getPrereq() {
		return prereq;
	}
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}
}
