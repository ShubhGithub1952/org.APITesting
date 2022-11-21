package pojoClass;

public class ComplexPojoClassTest {
	Cars Cars;

	// Empty Constructor
	public ComplexPojoClassTest() {
		super();
	}
	
	public ComplexPojoClassTest(Cars Cars) {
		this.Cars=Cars;
	}
	
	// Getter and Setters Method for Element of cars
	public Cars getCars() {
		return Cars;
	}

	public void setCars(Cars Cars) {
		this.Cars = Cars;
	}
		
}
