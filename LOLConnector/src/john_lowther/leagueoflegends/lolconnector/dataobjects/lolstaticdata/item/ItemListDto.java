package john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import john_lowther.leagueoflegends.lolconnector.dataobjects.lolstaticdata.runeanditem.BasicDataDto;

/**
 * Item list dto.
 * @author John Lowther
 */
public class ItemListDto {
	private BasicDataDto basic = new BasicDataDto();
	private Map<String, ItemDto> data = new HashMap<String, ItemDto>();
	private List<GroupDto> groups = new ArrayList<GroupDto>();
	private List<ItemTreeDto> tree = new ArrayList<ItemTreeDto>();
	private String type;
	private String version;
	
	public BasicDataDto getBasic() {
		return basic;
	}
	public void setBasic(BasicDataDto basic) {
		this.basic = basic;
	}
	public Map<String, ItemDto> getData() {
		return data;
	}
	public void setData(Map<String, ItemDto> data) {
		this.data = data;
	}
	public List<GroupDto> getGroups() {
		return groups;
	}
	public void setGroups(List<GroupDto> groups) {
		this.groups = groups;
	}
	public List<ItemTreeDto> getTree() {
		return tree;
	}
	public void setTree(List<ItemTreeDto> tree) {
		this.tree = tree;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
