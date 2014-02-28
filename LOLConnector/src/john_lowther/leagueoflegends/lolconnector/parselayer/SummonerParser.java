package john_lowther.leagueoflegends.lolconnector.parselayer;

import java.util.Map;

import john_lowther.leagueoflegends.lolconnector.connector.SummonerConnector;
import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.dataobjects.summoner.SummonerDto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class SummonerParser {
	public long getSummonerId(Region region, String name) {
		String json = new SummonerConnector().getSummonerObjectsByNames(region, null, name);
		Map<String, SummonerDto> map = new Gson().fromJson(json, new TypeToken<Map<String, SummonerDto>>(){}.getType());
		return map.get(name.toLowerCase()).getId();
	}
	
}
