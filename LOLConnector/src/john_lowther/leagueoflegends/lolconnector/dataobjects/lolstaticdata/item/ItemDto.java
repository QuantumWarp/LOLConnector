package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.ImageDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.runeanditem.BasicDataStatsDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.runeanditem.GoldDto;
import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.runeanditem.MetaDataDto;

public class ItemDto {
	private String colloq;	
	private boolean consumeOnFull;	
	private boolean consumed;	
	private int depth;	
	private String description;	
	private List<String> from = new ArrayList<String>();
	private GoldDto gold =  new GoldDto();	
	private String group;	
	private boolean hideFromAll;	
	private ImageDto image = new ImageDto();	
	private boolean inStore;	
	private List<String> into = new ArrayList<String>();
	private Map<String, Boolean> maps =  new HashMap<String, Boolean>();	
	private String name;
	private String plaintext;
	private String requiredChampion;
	private MetaDataDto rune = new MetaDataDto();
	private int specialRecipe;
	private int stacks;
	private BasicDataStatsDto stats = new BasicDataStatsDto();
	private List<String> tags = new ArrayList<String>();
	
	public String getColloq() {
		return colloq;
	}
	public void setColloq(String colloq) {
		this.colloq = colloq;
	}
	public boolean isConsumeOnFull() {
		return consumeOnFull;
	}
	public void setConsumeOnFull(boolean consumeOnFull) {
		this.consumeOnFull = consumeOnFull;
	}
	public boolean isConsumed() {
		return consumed;
	}
	public void setConsumed(boolean consumed) {
		this.consumed = consumed;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getFrom() {
		return from;
	}
	public void setFrom(List<String> from) {
		this.from = from;
	}
	public GoldDto getGold() {
		return gold;
	}
	public void setGold(GoldDto gold) {
		this.gold = gold;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public boolean isHideFromAll() {
		return hideFromAll;
	}
	public void setHideFromAll(boolean hideFromAll) {
		this.hideFromAll = hideFromAll;
	}
	public ImageDto getImage() {
		return image;
	}
	public void setImage(ImageDto image) {
		this.image = image;
	}
	public boolean isInStore() {
		return inStore;
	}
	public void setInStore(boolean inStore) {
		this.inStore = inStore;
	}
	public List<String> getInto() {
		return into;
	}
	public void setInto(List<String> into) {
		this.into = into;
	}
	public Map<String, Boolean> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Boolean> maps) {
		this.maps = maps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlaintext() {
		return plaintext;
	}
	public void setPlaintext(String plaintext) {
		this.plaintext = plaintext;
	}
	public String getRequiredChampion() {
		return requiredChampion;
	}
	public void setRequiredChampion(String requiredChampion) {
		this.requiredChampion = requiredChampion;
	}
	public MetaDataDto getRune() {
		return rune;
	}
	public void setRune(MetaDataDto rune) {
		this.rune = rune;
	}
	public int getSpecialRecipe() {
		return specialRecipe;
	}
	public void setSpecialRecipe(int specialRecipe) {
		this.specialRecipe = specialRecipe;
	}
	public int getStacks() {
		return stacks;
	}
	public void setStacks(int stacks) {
		this.stacks = stacks;
	}
	public BasicDataStatsDto getStats() {
		return stats;
	}
	public void setStats(BasicDataStatsDto stats) {
		this.stats = stats;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
