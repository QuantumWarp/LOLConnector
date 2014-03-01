package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.mastery;

import java.util.ArrayList;
import java.util.List;

import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.ImageDto;

/**
 * Mastery data.
 * @author John Lowther
 */
public class MasteryDto {
	private List<String> description = new ArrayList<String>();	
	private int	id;	
	private ImageDto image = new ImageDto();
	private String name;
	private String prereq;
	private int	ranks;
	
	public List<String> getDescription() {
		return description;
	}
	public void setDescription(List<String> description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ImageDto getImage() {
		return image;
	}
	public void setImage(ImageDto image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrereq() {
		return prereq;
	}
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}
	public int getRanks() {
		return ranks;
	}
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
}
