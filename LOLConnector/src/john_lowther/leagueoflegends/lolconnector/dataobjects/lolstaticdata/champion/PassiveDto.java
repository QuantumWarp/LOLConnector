package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.ImageDto;

/**
 * Champion passive data.
 * @author John Lowther
 */
public class PassiveDto {
	private String description;
	private ImageDto image = new ImageDto();
	private String name;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
}
