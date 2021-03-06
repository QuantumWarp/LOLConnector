package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

import java.util.ArrayList;
import java.util.List;

import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.ImageDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.championandspell.LevelTipDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.championandspell.SpellVarsDto;

/**
 * Champion spell data.
 * @author John Lowther
 */
public class ChampionSpellDto {
	private List<Integer> cooldown = new ArrayList<Integer>();	
	private String cooldownBurn;	
	private List<Integer> cost = new ArrayList<Integer>();
	private String costBurn;
	private String costType;
	private String description;
	private List<Object> effect = new ArrayList<Object>();	
	private List<String> effectBurn = new ArrayList<String>();	
	private String id;
	private ImageDto image = new ImageDto();	
	private LevelTipDto	leveltip = new LevelTipDto();
	private int	maxrank;
	private String name;
	private Object range;
	private String rangeBurn;
	private String resource;
	private String tooltip;
	private List<SpellVarsDto> vars = new ArrayList<SpellVarsDto>();
	
	public List<Integer> getCooldown() {
		return cooldown;
	}
	public void setCooldown(List<Integer> cooldown) {
		this.cooldown = cooldown;
	}
	public String getCooldownBurn() {
		return cooldownBurn;
	}
	public void setCooldownBurn(String cooldownBurn) {
		this.cooldownBurn = cooldownBurn;
	}
	public List<Integer> getCost() {
		return cost;
	}
	public void setCost(List<Integer> cost) {
		this.cost = cost;
	}
	public String getCostBurn() {
		return costBurn;
	}
	public void setCostBurn(String costBurn) {
		this.costBurn = costBurn;
	}
	public String getCostType() {
		return costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Object> getEffect() {
		return effect;
	}
	public void setEffect(List<Object> effect) {
		this.effect = effect;
	}
	public List<String> getEffectBurn() {
		return effectBurn;
	}
	public void setEffectBurn(List<String> effectBurn) {
		this.effectBurn = effectBurn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ImageDto getImage() {
		return image;
	}
	public void setImage(ImageDto image) {
		this.image = image;
	}
	public LevelTipDto getLeveltip() {
		return leveltip;
	}
	public void setLeveltip(LevelTipDto leveltip) {
		this.leveltip = leveltip;
	}
	public int getMaxrank() {
		return maxrank;
	}
	public void setMaxrank(int maxrank) {
		this.maxrank = maxrank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getRange() {
		return range;
	}
	public void setRange(Object range) {
		this.range = range;
	}
	public String getRangeBurn() {
		return rangeBurn;
	}
	public void setRangeBurn(String rangeBurn) {
		this.rangeBurn = rangeBurn;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getTooltip() {
		return tooltip;
	}
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	public List<SpellVarsDto> getVars() {
		return vars;
	}
	public void setVars(List<SpellVarsDto> vars) {
		this.vars = vars;
	}
}
