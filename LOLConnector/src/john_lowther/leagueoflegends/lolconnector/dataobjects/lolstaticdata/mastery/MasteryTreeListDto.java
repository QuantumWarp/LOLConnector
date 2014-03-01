package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.mastery;

import java.util.ArrayList;
import java.util.List;

/**
 * Mastery tree list dto.
 * @author John Lowther
 */
public class MasteryTreeListDto {
	private List<MasteryTreeItemDto> masteryTreeItems = new ArrayList<MasteryTreeItemDto>();

	public List<MasteryTreeItemDto> getMasteryTreeItems() {
		return masteryTreeItems;
	}

	public void setMasteryTreeItems(List<MasteryTreeItemDto> masteryTreeItems) {
		this.masteryTreeItems = masteryTreeItems;
	}
}
