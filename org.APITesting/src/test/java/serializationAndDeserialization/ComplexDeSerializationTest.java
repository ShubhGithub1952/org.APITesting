package serializationAndDeserialization;

import java.io.File;

import com.fasterxml.jackson.databind.json.JsonMapper;

import pojoClass.ComplexPojoClassTest;
import pojoClass.Escort;

public class ComplexDeSerializationTest {
	public static void main(String[] args) throws Throwable {
		JsonMapper jSONMapperObj = new JsonMapper();
		ComplexPojoClassTest readArrayObj = jSONMapperObj.readValue(new File("./ComplexJSON.json"), ComplexPojoClassTest.class);
		System.out.println(readArrayObj.getCars());
	}
}
