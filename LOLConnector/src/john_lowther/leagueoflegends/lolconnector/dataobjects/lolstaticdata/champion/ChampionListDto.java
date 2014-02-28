package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

import java.util.Map;

/**
 * Champion list dto.
 * @author John Lowther
 */
public class ChampionListDto {
	private Map<String, ChampionDto> data;	
	private String format;	
	private Map<String, String> keys;
	private String type;	
	private String version;
	
	public Map<String, ChampionDto> getData() {
		return data;
	}
	public void setData(Map<String, ChampionDto> data) {
		this.data = data;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Map<String, String> getKeys() {
		return keys;
	}
	public void setKeys(Map<String, String> keys) {
		this.keys = keys;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
