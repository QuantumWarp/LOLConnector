package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

/**
 * Block item data.
 * @author John Lowther
 */
public class BlockItemDto {
	private int count;
	private String id;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
