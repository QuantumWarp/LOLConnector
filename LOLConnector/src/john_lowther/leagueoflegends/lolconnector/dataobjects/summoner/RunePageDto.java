package john_lowther.leagueoflegends.lolconnector.dataobjects.summoner;

/**
 * Rune page by summoner data.
 * @author John Lowther
 */
public class RunePageDto {
	private boolean current;
	private long id;
	private String name;
	private RuneSlotDto slots = new RuneSlotDto();
	
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RuneSlotDto getSlots() {
		return slots;
	}
	public void setSlots(RuneSlotDto slots) {
		this.slots = slots;
	}
}
