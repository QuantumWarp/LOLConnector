package john_lowther.leagueoflegends.lolconnector.dataobjects.team;

/**
 * Message of day data.
 * @author John Lowther
 */
public class MessageOfDayDto {
	private long createDate;	
	private String message;	
	private int version;
	
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
