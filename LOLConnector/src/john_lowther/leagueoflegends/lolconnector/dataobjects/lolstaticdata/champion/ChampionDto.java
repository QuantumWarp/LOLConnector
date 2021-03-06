package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.champion;

import java.util.ArrayList;
import java.util.List;

import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.ImageDto;

/**
 * Detailed champion data.
 * @author John Lowther
 */
public class ChampionDto {
	private List<String> allytips = new ArrayList<String>();	
	private String blurb;	
	private List<String> enemytips = new ArrayList<String>();
	private String id;	
	private ImageDto image = new ImageDto();	
	private InfoDto	info = new InfoDto();
	private String key;	
	private String lore;	
	private String name;	
	private String partype;	
	private PassiveDto passive = new PassiveDto();	
	private List<RecommendedDto> recommended = new ArrayList<RecommendedDto>();	
	private List<SkinDto> skins = new ArrayList<SkinDto>();
	private List<ChampionSpellDto> spells = new ArrayList<ChampionSpellDto>();	
	private StatsDto stats = new StatsDto();
	private List<String> tags = new ArrayList<String>();
	private String title;
	
	public List<String> getAllytips() {
		return allytips;
	}
	public void setAllytips(List<String> allytips) {
		this.allytips = allytips;
	}
	public String getBlurb() {
		return blurb;
	}
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
	public List<String> getEnemytips() {
		return enemytips;
	}
	public void setEnemytips(List<String> enemytips) {
		this.enemytips = enemytips;
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
	public InfoDto getInfo() {
		return info;
	}
	public void setInfo(InfoDto info) {
		this.info = info;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartype() {
		return partype;
	}
	public void setPartype(String partype) {
		this.partype = partype;
	}
	public PassiveDto getPassive() {
		return passive;
	}
	public void setPassive(PassiveDto passive) {
		this.passive = passive;
	}
	public List<RecommendedDto> getRecommended() {
		return recommended;
	}
	public void setRecommended(List<RecommendedDto> recommended) {
		this.recommended = recommended;
	}
	public List<SkinDto> getSkins() {
		return skins;
	}
	public void setSkins(List<SkinDto> skins) {
		this.skins = skins;
	}
	public List<ChampionSpellDto> getSpells() {
		return spells;
	}
	public void setSpells(List<ChampionSpellDto> spells) {
		this.spells = spells;
	}
	public StatsDto getStats() {
		return stats;
	}
	public void setStats(StatsDto stats) {
		this.stats = stats;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
