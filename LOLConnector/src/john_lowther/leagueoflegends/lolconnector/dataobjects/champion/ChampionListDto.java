package john_lowther.leagueoflegends.lolconnector.dataobjects.champion;

import java.util.List;

public class ChampionListDto {
	List<ChampionDto> champions;

	public List<ChampionDto> getChampions() {
		return champions;
	}

	public void setChampions(List<ChampionDto> champions) {
		this.champions = champions;
	}
	
}
