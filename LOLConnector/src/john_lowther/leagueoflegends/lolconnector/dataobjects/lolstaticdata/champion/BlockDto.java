package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

import java.util.ArrayList;
import java.util.List;

/**
 * Block data.
 * @author John Lowther
 */
public class BlockDto {
	private List<BlockItemDto> items =  new ArrayList<BlockItemDto>();
	private String type;
	
	public List<BlockItemDto> getItems() {
		return items;
	}
	public void setItems(List<BlockItemDto> items) {
		this.items = items;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
