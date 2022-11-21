package SerializationAndDeserializationTest3;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DeSerializationTest1 {
	public static void main(String[] args) throws Throwable {
		JSONParser jsonParserObj = new JSONParser();
		Object parse = jsonParserObj.parse(new FileReader("./ComplexJSONBody2.json"));
		JSONObject simpleObj = (JSONObject)parse;
		String firstName = (String)simpleObj.get("firsName");
		System.out.println(firstName);
		String lastName = (String)simpleObj.get("lastName");
		System.out.println(lastName);
		String addressArray = (String)simpleObj.get("address").toString();
		System.out.println(addressArray);
	}
}
