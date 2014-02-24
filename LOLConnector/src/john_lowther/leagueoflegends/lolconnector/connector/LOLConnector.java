package john_lowther.leagueoflegends.lolconnector.connector;

public abstract class LOLConnector {

	/**
	 * Adds a parameter to the request.
	 * @param request
	 * @param paramName
	 * @param param
	 */
	protected void addParamToRequest(String request, String paramName, Object param) {
		if (!request.contains("?"))
			request += "?";
		else
			request += "&";
		
		request += paramName + "=" + param.toString();
	}
}
