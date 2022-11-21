package serializationAndDeserialization;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddPatientDeserializationTest {
	public static void main(String[] args) throws Throwable {
//		JsonMapper jsonMapperObj =new JsonMapper();
//		AddPatientTest jsonRead = jsonMapperObj.readValue(new File("./ComplexJsonBody.json"), AddPatientTest.class);
//		String firstName = (String)jsonRead.getFirstName();
//		System.out.println(firstName);
		
		JSONParser jsonParcerObj = new JSONParser();
		Object obj = jsonParcerObj.parse(new FileReader("./ComplexJsonBody.json"));
		JSONObject addPatientObj = (JSONObject)obj;
		String firstName = (String)addPatientObj.get("firstName");
		System.out.println(firstName);
		String lastName = (String)addPatientObj.get("lastName");
		System.out.println(lastName);
		JSONArray array = (JSONArray)addPatientObj.get("address");
//		for (int i = 0; i < array.size(); i++) {
//			for (int j = 0; j < array.size(); j++) {
//				JSONObject array1Obj = (JSONObject)array.get(j);
//				String street = (String)array1Obj.get("street");
//				System.out.println(street);
//				break;
//			}
//			break;
//		}
		System.out.println(array.toString());
	}
}
