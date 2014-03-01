package john_lowther.leagueoflegends.lolconnector.dataobjects.champion;

import java.util.ArrayList;
import java.util.List;

public class ChampionListDto {
	List<ChampionDto> champions = new ArrayList<ChampionDto>();

	public List<ChampionDto> getChampions() {
		return champions;
	}

	public void setChampions(List<ChampionDto> champions) {
		this.champions = champions;
	}
	
}
