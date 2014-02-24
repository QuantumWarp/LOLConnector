package john_lowther.leagueoflegends.lolconnector.connector;

/**
 * Has methods to help all connection classes. Also acts as a label.
 * @author John Lowther
 */
public abstract class LOLConnector {

	/**
	 * Adds a parameter to the request.
	 * @param request
	 * @param paramName
	 * @param param
	 */
	protected String addParamToRequest(String request, String paramName, Object param) {
		return request + (request.contains("?") ? "&" : "?") + paramName + "=" + param.toString();
	}
}
