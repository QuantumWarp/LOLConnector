package john_lowther.leagueoflegends.lolconnector;

import john_lowther.leagueoflegends.lolconnector.dataenums.Region;
import john_lowther.leagueoflegends.lolconnector.exceptions.NotSupportedException;
import john_lowther.leagueoflegends.lolconnector.exceptions.RequestException;
import john_lowther.leagueoflegends.lolconnector.fileio.KeyReader;
import john_lowther.leagueoflegends.lolconnector.parselayer.ChampionParser;
import john_lowther.leagueoflegends.lolconnector.parselayer.GameParser;
import john_lowther.leagueoflegends.lolconnector.parselayer.LOLStaticDataParser;
import john_lowther.leagueoflegends.lolconnector.parselayer.LeagueParser;
import john_lowther.leagueoflegends.lolconnector.parselayer.StatsParser;
import john_lowther.leagueoflegends.lolconnector.parselayer.SummonerParser;
import john_lowther.leagueoflegends.lolconnector.parselayer.TeamParser;

public class LOLRetriever {
	private Region defaultRegion;
	private ChampionParser championRequest = new ChampionParser();
	private GameParser gameRequest = new GameParser();
	private LeagueParser leagueRequest = new LeagueParser();
	private LOLStaticDataParser lolStaticDataRequest = new LOLStaticDataParser();
	private StatsParser statsRequest = new StatsParser();
	private SummonerParser summonerRequest = new SummonerParser();
	private TeamParser teamRequest = new TeamParser();
	
	public LOLRetriever(Region defaultRegion) {
		setDefaultRegion(defaultRegion);
	}
	
	public long getSummonerId(String name) throws NotSupportedException, RequestException {
		return summonerRequest.getSummonerId(defaultRegion, name);
	}
	
	public void setApiKey(String apikey) {
		KeyReader.setApiKey(apikey);
	}
	
	public String getApiKey() {
		return KeyReader.getApiKey();
	}
	
	public ChampionParser championRequest() {
		return championRequest;
	}
	
	public GameParser gameRequest() {
		return gameRequest;
	}
	
	public LeagueParser leagueRequest() {
		return leagueRequest;
	}
	
	public LOLStaticDataParser lolStaticDataRequest() {
		return lolStaticDataRequest;
	}
	
	public StatsParser statsRequest() {
		return statsRequest;
	}
	
	public SummonerParser summonerRequest() {
		return summonerRequest;
	}
	
	public TeamParser teamRequest() {
		return teamRequest;
	}
	
	public void setDefaultRegion(Region region) {
		this.defaultRegion = region;
		championRequest.setDefaultRegion(region);
		gameRequest.setDefaultRegion(region);
		leagueRequest.setDefaultRegion(region);
		lolStaticDataRequest.setDefaultRegion(region);
		statsRequest.setDefaultRegion(region);
		summonerRequest.setDefaultRegion(region);
		teamRequest.setDefaultRegion(region);
	}
}
