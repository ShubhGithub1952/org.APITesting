package complexBodyRequest;

import org.json.simple.JSONObject;

public class PrintOnConsoleTest {
	public static void main(String[] args) {
		//		HashMap<String, String> print = new HashMap<String, String>();
		//		print.put("name", "Arun");
		//		print.put("Country" ,"INDIA");
		//		print.put("State" ,"MP");
		//		System.out.println(print);
				
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Arun");
		jsonObj.put("Country" ,"INDIA");
		jsonObj.put("State" ,"MP");

		System.out.println(jsonObj.toString()); // pretty print json
	}
}
