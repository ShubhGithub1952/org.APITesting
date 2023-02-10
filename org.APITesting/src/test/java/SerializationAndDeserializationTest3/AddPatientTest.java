package SerializationAndDeserializationTest3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import pojoClass.Test3.Address;
import pojoClass.Test3.AddressPojoClass;

public class AddPatientTest {
	public static void main(String[] args) throws Throwable {
		Address addressObj1 = new Address("CST Terminal", "Mumbai", "Maharashtra");
		Address addressObj2 = new Address("Majestic Terminal", "Bangalore", "Karnataka");
		List<Address> addressObj = new ArrayList<Address>();
		addressObj.add(addressObj1);
		addressObj.add(addressObj2);
		AddressPojoClass addAddressObj = new AddressPojoClass("Shubham", "Pitale", addressObj);
		ObjectMapper jsonObj = new ObjectMapper();
		jsonObj.writeValue(new File("./AddressJson.json"), addAddressObj);
	}
}
