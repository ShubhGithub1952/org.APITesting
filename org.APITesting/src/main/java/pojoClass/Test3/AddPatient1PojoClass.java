package pojoClass.Test3;

import java.util.ArrayList;
import java.util.HashMap;

public class AddPatient1PojoClass {
	String firsName;
	String lastName;
	ArrayList< HashMap<String, String>> Address;
	
	//create Constructor
	public AddPatient1PojoClass(String firsName, String lastName, ArrayList<HashMap<String, String>> address) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		Address = address;
	}
	
	//Provide Getter and Setter Method
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
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
		Address = address;
	}
}
