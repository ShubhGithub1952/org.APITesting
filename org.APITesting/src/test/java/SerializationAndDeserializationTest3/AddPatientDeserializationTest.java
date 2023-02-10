package SerializationAndDeserializationTest3;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.Test3.Address;
import pojoClass.Test3.AddressPojoClass;

public class AddPatientDeserializationTest {
	public static void main(String[] args) throws Throwable {
		ObjectMapper jsonObj = new ObjectMapper();
		AddressPojoClass jsonReader = jsonObj.readValue(new File(".\\AddressJson.json"), AddressPojoClass.class);
		Address addressReader1 = jsonReader.getAddress().get(0);
		String cityName1 = addressReader1.getCity();
		String stateName1 = addressReader1.getState();
		String streetName1 = addressReader1.getStreet();
		System.out.println(cityName1);
		System.out.println(stateName1);
		System.out.println(streetName1);
		System.out.println("======================================");
		
		Address addressReader2 = jsonReader.getAddress().get(1);
		String cityName2 = addressReader2.getCity();
		String stateName2 = addressReader2.getState();
		String streetName2 = addressReader2.getStreet();
		System.out.println(cityName2);
		System.out.println(stateName2);
		System.out.println(streetName2);
		}
}
