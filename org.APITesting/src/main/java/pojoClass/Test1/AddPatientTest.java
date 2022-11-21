package pojoClass.Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddPatientTest {
	String firstName;
	String lastName;
	ArrayList<HashMap<String, String>> Address;
	
	// Create The Empty ConStructor
	public AddPatientTest(String firstName, String lastName, ArrayList<HashMap<String, String>> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.Address = address;
	}

	// Create The Getter and Setter Method
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<HashMap<String, String>> getAddress() {
		return Address;
	}

	public void setAddress(ArrayList<HashMap<String, String>> address) {
		this.Address = address;
	}
	
	
	
	
}
