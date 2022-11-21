package pojoClass;

public class Taurus {
	String  doors;
	String transmission;
	
	// Create Empty Constructor 
	public Taurus() {
		super();
	}
	
	public Taurus(String  doors, String transmission ) {
		this.doors=doors;
		this.transmission=transmission;
	}
	
	// Create Getter and Setter Method
	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
}
