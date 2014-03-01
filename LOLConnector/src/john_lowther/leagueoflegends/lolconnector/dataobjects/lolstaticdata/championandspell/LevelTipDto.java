package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.championandspell;

import java.util.ArrayList;
import java.util.List;

/**
 * Level tip data.
 * @author John Lowther
 */
public class LevelTipDto {
	private List<String> effect = new ArrayList<String>();
	private List<String> label = new ArrayList<String>();
	
	public List<String> getEffect() {
		return effect;
	}
	public void setEffect(List<String> effect) {
		this.effect = effect;
	}
	public List<String> getLabel() {
		return label;
	}
	public void setLabel(List<String> label) {
		this.label = label;
	}
}
