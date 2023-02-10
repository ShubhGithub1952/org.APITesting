package pojoClass.Test3;

import java.util.List;

public class AddressPojoClass {
	private String firstName;
	private String lastName;
	private List<Address> address;
	
	public AddressPojoClass() {
		super();
	}

	// Parameterised Constructor
	public AddressPojoClass(String firstName, String lastName, List<Address> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
