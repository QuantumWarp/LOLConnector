package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

import java.util.ArrayList;
import java.util.List;

/**
 * Recommended data.
 * @author John Lowther
 */
public class RecommendedDto {
	private List<BlockDto> blocks = new ArrayList<BlockDto>();
	private String champion;	
	private String map;	
	private String mode;
	private boolean	priority;
	private String 	title;
	private String 	type;
	
	public List<BlockDto> getBlocks() {
		return blocks;
	}
	public void setBlocks(List<BlockDto> blocks) {
		this.blocks = blocks;
	}
	public String getChampion() {
		return champion;
	}
	public void setChampion(String champion) {
		this.champion = champion;
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public boolean isPriority() {
		return priority;
	}
	public void setPriority(boolean priority) {
		this.priority = priority;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
