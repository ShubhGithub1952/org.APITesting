package SerializationAndDeserializationTest3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.databind.json.JsonMapper;

import pojoClass.Test3.AddPatient1PojoClass;

public class AddPatientTest {
	public static void main(String[] args) throws Throwable {
		HashMap<String, String> mapObj1 =new HashMap<String, String>();
		mapObj1.put("street","abc");
		mapObj1.put("city","Hyderabad");
		mapObj1.put("state","TL");
		HashMap<String, String> mapObj2 =new HashMap<String, String>();
		mapObj2.put("street","xyz");
		mapObj2.put("city","Chennai");
		mapObj2.put("state","TN");
		
		ArrayList<HashMap<String, String>> addressMapObj = new ArrayList<HashMap<String, String>>();
		addressMapObj.add(mapObj1);
		addressMapObj.add(mapObj2);
		
		AddPatient1PojoClass addPatientObj = new AddPatient1PojoClass("JayDeva", "Shukla", addressMapObj);
		
		//Serialization 
		JsonMapper jsonMapperObj = new JsonMapper();
		jsonMapperObj.writeValue(new File("./ComplexJSONBody2.json"), addPatientObj);
	}
}
