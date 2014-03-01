package john_lowther.leagueoflegends.lolconnector.dataobjects.summoner;

/**
 * Rune slot data.
 * @author John Lowther
 */
public class RuneSlotDto {
	private RuneDto rune = new RuneDto();
	private int runeSlotId;
	
	public RuneDto getRune() {
		return rune;
	}
	public void setRune(RuneDto rune) {
		this.rune = rune;
	}
	public int getRuneSlotId() {
		return runeSlotId;
	}
	public void setRuneSlotId(int runeSlotId) {
		this.runeSlotId = runeSlotId;
	} 
}
