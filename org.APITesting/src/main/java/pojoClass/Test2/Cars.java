package pojoClass.Test2;

import java.util.List;

public class Cars {
	private List<Nissan> nissan;
	private List<Ford> ford;
	//Create the Empty Constructor
	public Cars() {
		super();
	}
	
	public static class Nissan{
		private Sentra sentra;
		private Maxima maxima;
		//Create the Empty Constructor
		public Nissan() {
			super();
		}
		// Provide Getter and Setter Method
		public Sentra getSentra() {
			return sentra;
		}
		
		public void setSentra(Sentra sentra) {
			this.sentra = sentra;
		}
		public Maxima getMaxima() {
			return maxima;
		}
		public void setMaxima(Maxima maxima) {
			this.maxima = maxima;
		}
		
		
	}
	
	
    public static class Ford{
    	private Escort escort;
		private Taurus taurus;
		
		//Create Constructor
		public Ford() {
			super();
		}
		// Provide Getter and Setter Method

		public Escort getEscort() {
			return escort;
		}

		public void setEscort(Escort escort) {
			this.escort = escort;
		}

		public Taurus getTaurus() {
			return taurus;
		}

		public void setTaurus(Taurus taurus) {
			this.taurus = taurus;
		}
		
	}
	
	//Provide Getter and Setter Method
	public List<Nissan> getNissan() {
		return nissan;
	}
	public void setNissan(List<Nissan> nissan) {
		this.nissan = nissan;
	}
	public List<Ford> getFord() {
		return ford;
	}
	public void setFord(List<Ford> ford) {
		this.ford = ford;
	}
	
}
