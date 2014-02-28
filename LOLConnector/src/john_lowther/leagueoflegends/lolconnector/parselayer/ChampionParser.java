package john_lowther.leagueoflegends.lolconnector.parselayer;

import john_lowther.leagueoflegends.lolconnector.connector.ChampionConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.champion.ChampionListDto;

import com.google.gson.Gson;

public class ChampionParser {
	public ChampionListDto getChampions() {
		return new Gson().fromJson(new ChampionConnector().getChampions(Region.EU_WEST, null, null), ChampionListDto.class);
	}
}
