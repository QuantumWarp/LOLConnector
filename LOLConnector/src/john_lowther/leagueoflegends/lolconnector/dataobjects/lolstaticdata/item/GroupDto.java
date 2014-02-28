package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.item;

/**
 * Group data.
 * @author John Lowther
 */
public class GroupDto {
	private String MaxGroupOwnable;
	private String id;
	
	public String getMaxGroupOwnable() {
		return MaxGroupOwnable;
	}
	public void setMaxGroupOwnable(String maxGroupOwnable) {
		MaxGroupOwnable = maxGroupOwnable;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
