package john_lowther.leagueoflegends.lolconnector.dataenums;

/**
 * Status codes returned.
 * @author John Lowther
 */
public enum ConnectionResponse {
	ERROR_503 (503, false, "Service unavailable"),
	ERROR_400 (400, false, "Bad request"),
	ERROR_401 (401, false, "Unauthorized"),
	ERROR_500 (500, false, "Internal server error"),
	ERROR_404 (404, false, "Data not found"),
	ERROR_429 (429, false, "Request rate limit reached"),
	SUCCESS_200 (200, true, "Successful request");
	
	private int responseCode;
	private boolean success;
	private String description;
	
	private ConnectionResponse(int responseCode, boolean success, String description) {
		this.responseCode = responseCode;
		this.success = success;
		this.description = description;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getDescription() {
		return description;
	}
	
	public static ConnectionResponse getFromCode(int code) {
		for (ConnectionResponse cr : ConnectionResponse.values())
			if (cr.getResponseCode() == code)
				return cr;
		return null;
	}
	
	public static String getErrorStringFromCode(int code) {
		for (ConnectionResponse cr : ConnectionResponse.values())
			if (cr.getResponseCode() == code)
				return cr.getErrorString();
		return null;
	}
	
	public String getErrorString() {
		return (!success ? "ERROR - " : "") + "Code " + responseCode + " - " + 
				(success ? "Request successful " : "Request fail: " + description);
	}
}
