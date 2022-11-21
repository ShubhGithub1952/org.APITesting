package pojoClass;

public class Cars {
	Nissan Nissan;
	Ford Ford;
	
	// Create the Empty Constructor
	public Cars() {
		super();
	}
	
	public Cars(Nissan Nissan,Ford Ford) {
		this.Nissan=Nissan;
		this.Ford=Ford;
	}
	
	// Create the Getter and Setter Method
	public Nissan getNissan() {
		return Nissan;
	}

	public void setNissan(Nissan Nissan) {
		this.Nissan = Nissan;
	}

	public Ford getFord() {
		return Ford;
	}

	public void setFord(Ford Ford) {
		this.Ford = Ford;
	}
	
	
}
