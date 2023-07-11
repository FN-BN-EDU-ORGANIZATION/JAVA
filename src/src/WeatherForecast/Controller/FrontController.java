package WeatherForecast.Controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class FrontController {

	private static FrontController Instance;
	SubController SC ;
	public static FrontController getInstance() {
		if(Instance==null)
		Instance = new FrontController();
		return Instance;
	}
	private Map<String, Object> map = new HashMap();
	public Map<String,Object> ncst=null;
	private void init() {
		map.put("/Sub", new SubController());

	}

	public FrontController() {
		init();
	}

	public Map<String, Object> execute(String request, String ServiceStr, Map<String, Object> Rp) throws SQLException {
		Object controller = map.get(request);
		Map<String, Object> result = new HashMap();
		if (controller instanceof SubController) {
			SubController down = (SubController) controller;
			result = down.execute(ServiceStr, Rp);
			System.out.println("SubController!");

		} else {
			System.out.println("Request ERROR");
		}

		return result;
	}

}
