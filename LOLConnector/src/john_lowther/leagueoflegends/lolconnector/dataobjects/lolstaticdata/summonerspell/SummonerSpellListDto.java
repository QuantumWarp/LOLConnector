package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.summonerspell;

import java.util.Map;

/**
 * Summoner spell list dto.
 * @author John Lowther
 */
public class SummonerSpellListDto {
	private Map<String, SummonerSpellDto> data;
	private String type;
	private String version;
	
	public Map<String, SummonerSpellDto> getData() {
		return data;
	}
	public void setData(Map<String, SummonerSpellDto> data) {
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
