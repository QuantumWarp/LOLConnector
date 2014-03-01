package john_lowther.leagueoflegends.lolconnector.exceptions;

import john_lowther.leagueoflegends.lolconnector.dataenums.ConnectionResponse;

@SuppressWarnings("serial")
public class RequestException extends RuntimeException {
	private ConnectionResponse response;
	private String url;
	
	public RequestException(ConnectionResponse response, String url) {
		this.response = response;
		this.url = url;
	}

	public ConnectionResponse getResponse() {
		return response;
	}


	public String getUrl() {
		return url;
	}
	

	public void setUrl(String url) {
		this.url = url;
	}
}
