package john_lowther.leagueoflegends.lolconnector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.parselayer.SummonerParser;

public class LOLRetriever {
	private Region defaultRegion;
	private SummonerParser summonerRequest = new SummonerParser();

	public LOLRetriever() {
		
	}
	
	public LOLRetriever(Region defaultRegion) {
		this.defaultRegion = defaultRegion;
	}
	
	public long getSummonerId(String name) {
		return summonerRequest.getSummonerId(defaultRegion, name);
	}
	
	public SummonerParser summonerRequest() {
		return summonerRequest;
	}
}
