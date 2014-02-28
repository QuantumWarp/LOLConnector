package john_lowther.leagueoflegends.lolconnector.exceptions;

import john_lowther.leagueoflegends.lolconnector.dataenums.ConnectionResponse;

@SuppressWarnings("serial")
public class RequestException extends RuntimeException {
	private ConnectionResponse response;
	
	public RequestException(ConnectionResponse response) {
		this.response = response;
	}

	public ConnectionResponse getResponse() {
		return response;
	}
}
