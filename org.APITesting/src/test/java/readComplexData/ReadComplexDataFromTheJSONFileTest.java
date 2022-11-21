package readComplexData;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadComplexDataFromTheJSONFileTest {
	public static void main(String[] args) throws Throwable {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("./RestAPI.json");
		Object obj = parser.parse(reader);
		  JSONObject jsonObj = (JSONObject)obj;
		String firstName = (String)jsonObj.get("firstName");
		System.out.println(firstName);
		String lastName = (String)jsonObj.get("lastName");
		System.out.println(lastName);
		 JSONArray array = (JSONArray)jsonObj.get("address");
		 System.out.println(array.size());
		 for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				 JSONObject jobj = (JSONObject)array.get(i);
					String street = (String)jobj.get("city");
					System.out.println(street);
					break;
			}
			break;
		}
	}
}
