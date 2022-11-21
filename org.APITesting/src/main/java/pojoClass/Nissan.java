package pojoClass;

public class Nissan {
	Sentra Sentra;
	Maxima Maxima;
	
	//Empty Constructor
	public Nissan() {
		super();
	}
	
	public Nissan(Sentra Sentra,Maxima Maxima) {
		this.Sentra=Sentra;
		this.Maxima=Maxima;
	}
	
	// Getter And Setter Methods
	public Sentra getSentra() {
		return Sentra;
	}

	public void setSentra(Sentra Sentra) {
		this.Sentra = Sentra;
	}

	public Maxima getMaxima() {
		return Maxima;
	}

	public void setMaxima(Maxima Maxima) {
		this.Maxima = Maxima;
	}
	
	 
	
}
