package pojoClass.Test3;

import java.util.HashMap;

public class Address {
	HashMap<String, String> addressObj1;
	HashMap<String, String> addressObj2;
	
	//Create the Constructor
	public Address(HashMap<String, String> addressObj1, HashMap<String, String> addressObj2) {
		super();
		this.addressObj1 = addressObj1;
		this.addressObj2 = addressObj2;
	}

	//Create the Getter and Setter Methods
	public HashMap<String, String> getAddressObj1() {
		return addressObj1;
	}

	public void setAddressObj1(HashMap<String, String> addressObj1) {
		this.addressObj1 = addressObj1;
	}

	public HashMap<String, String> getAddressObj2() {
		return addressObj2;
	}

	public void setAddressObj2(HashMap<String, String> addressObj2) {
		this.addressObj2 = addressObj2;
	}
	
	
	
}
