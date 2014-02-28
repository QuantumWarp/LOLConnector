package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.rune;

import java.util.Map;

import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.runeanditem.BasicDataDto;

/**
 * Rune list dto.
 * @author John Lowther
 */
public class RuneListDto {
	private BasicDataDto basic;
	private Map<String, RuneDto> data;
	private String type;
	private String version;
	
	public BasicDataDto getBasic() {
		return basic;
	}
	public void setBasic(BasicDataDto basic) {
		this.basic = basic;
	}
	public Map<String, RuneDto> getData() {
		return data;
	}
	public void setData(Map<String, RuneDto> data) {
		this.data = data;
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
