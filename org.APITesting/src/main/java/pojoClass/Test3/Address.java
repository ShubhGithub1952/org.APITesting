package pojoClass.Test3;

public class Address {
	private String street;
	private String city;
	private String state;
	
	//Create the Empty constructor
	public Address() {
		super();
	}
	
	//Create the Parameterized Constructor

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	//Provide getter and setter Method
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
