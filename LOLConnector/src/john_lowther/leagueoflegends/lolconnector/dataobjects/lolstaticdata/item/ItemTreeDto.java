package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.item;

import java.util.ArrayList;
import java.util.List;

/**
 * Item tree data.
 * @author John Lowther
 */
public class ItemTreeDto {
	private String header;
	private List<String> tags = new ArrayList<String>();
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
