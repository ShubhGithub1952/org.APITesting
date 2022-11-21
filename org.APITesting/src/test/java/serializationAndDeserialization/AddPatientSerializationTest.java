package serializationAndDeserialization;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.databind.json.JsonMapper;

import pojoClass.Test1.AddPatientTest;

public class AddPatientSerializationTest {
	public static void main(String[] args) throws Throwable {
		LinkedHashMap<String, String> mapObj1 = new LinkedHashMap<String, String>();
		mapObj1.put("street", "abc");
		mapObj1.put("city", "Hyderabad");
		mapObj1.put("state", "TL");
		
		LinkedHashMap<String, String> mapObj2 = new LinkedHashMap<String, String>();
		mapObj2.put("street", "xyz");
		mapObj2.put("city", "Chennai");
		mapObj2.put("state", "TN");
		
		ArrayList<HashMap<String, String>> map = new ArrayList<HashMap<String, String>>();
		map.add(mapObj1);
		map.add(mapObj2);
		
		AddPatientTest obj = new AddPatientTest("John", "Kennedy", map);
		
		JsonMapper jsonMapperObj = new JsonMapper();
		jsonMapperObj.writeValue(new File("./ComplexJsonBody.json"), obj);
	}
}
