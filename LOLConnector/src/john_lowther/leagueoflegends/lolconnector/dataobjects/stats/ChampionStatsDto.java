package john_lowther.leagueoflegends.lolconnector.dataobjects.stats;

/**
 * Champion stats data.
 * @author John Lowther
 */
public class ChampionStatsDto {
	private int id;
	private String name;
	private AggregatedStatsDto stats;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AggregatedStatsDto getStats() {
		return stats;
	}
	public void setStats(AggregatedStatsDto stats) {
		this.stats = stats;
	}
}
