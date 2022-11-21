package pojoClass;

public class Ford {
	Taurus Taurus;
	Escort Escort;
	
	// Create empty Constructor
	public Ford() {
		super();
	}
	
	public Ford(Taurus Taurus, Escort Escort) {
		this.Taurus=Taurus;
		this.Escort=Escort;
	}

	// Create Getter and Setter Method
	public Taurus getTaurus() {
		return Taurus;
	}

	public void setTaurus(Taurus Taurus) {
		this.Taurus = Taurus;
	}

	public Escort getEscort() {
		return Escort;
	}

	public void setEscort(Escort Escort) {
		this.Escort = Escort;
	}
	
}
