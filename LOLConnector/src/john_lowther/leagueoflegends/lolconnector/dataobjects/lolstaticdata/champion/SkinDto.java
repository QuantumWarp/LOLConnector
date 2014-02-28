package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

/**
 * Skin data.
 * @author John Lowther
 */
public class SkinDto {
	private String id;
	private String name;
	private int num;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
