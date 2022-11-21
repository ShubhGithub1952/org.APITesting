package pojoClass.Test1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Address {
	HashMap<String, String> mapObj1;
	HashMap<String, String> mapObj2;
	
	// Create the Constructor 
	public Address(LinkedHashMap<String, String> mapObj1, HashMap<String, String> mapObj2) {
		super();
		this.mapObj1 = mapObj1;
		this.mapObj2 = mapObj2;
	}
	
	// Create the Getter and Setter Method 
	public HashMap<String, String> getMapObj1() {
		return mapObj1;
	}

	public void setMapObj1(HashMap<String, String> mapObj1) {
		this.mapObj1 = mapObj1;
	}

	public HashMap<String, String> getMapObj2() {
		return mapObj2;
	}

	public void setMapObj2(HashMap<String, String> mapObj2) {
		this.mapObj2 = mapObj2;
	}
	
}
