package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.mastery;

import java.util.List;

/**
 * Mastery tree dto.
 * @author John Lowther
 */
public class MasteryTreeDto {
	private List<MasteryTreeListDto> Defense;
	private List<MasteryTreeListDto> Offense;
	private List<MasteryTreeListDto> Utility;
	
	public List<MasteryTreeListDto> getDefense() {
		return Defense;
	}
	public void setDefense(List<MasteryTreeListDto> defense) {
		Defense = defense;
	}
	public List<MasteryTreeListDto> getOffense() {
		return Offense;
	}
	public void setOffense(List<MasteryTreeListDto> offense) {
		Offense = offense;
	}
	public List<MasteryTreeListDto> getUtility() {
		return Utility;
	}
	public void setUtility(List<MasteryTreeListDto> utility) {
		Utility = utility;
	}
}
