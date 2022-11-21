package serializationAndDeserializationTest2;

import java.util.ArrayList;
import java.util.List;

import pojoClass.Test2.Cars;
import pojoClass.Test2.Escort;
import pojoClass.Test2.Maxima;
import pojoClass.Test2.Sentra;
import pojoClass.Test2.Taurus;
import pojoClass.Test2.Cars.Nissan;

public class AddAppointmentSerializationTest {
	public static void main(String[] args) {
		// Provide JSON arguments to the Sentra Class
		Sentra sentraSubObj = new Sentra();
		sentraSubObj.setDoors("4");
		sentraSubObj.setTransmission("manual");
		
		// Provide JSON arguments to the Maxima Class
		Maxima maximaSubObj = new Maxima();
		maximaSubObj.setDoors("4");
		maximaSubObj.setTransmission("automation");
		
		// Provide JSON arguments to the Escort Class
		Escort escortSubObj = new Escort();
		escortSubObj.setDoors("8");
		escortSubObj.setTransmission("manual");
		
		// Provide JSON arguments to the Taurus Class
		Taurus taurusSubObj = new Taurus();
		taurusSubObj.setDoors("8");
		taurusSubObj.setTransmission("automation");
		
		//Store the JSON object inside the Sentra class
		List<Nissan> nissanObj= new ArrayList<Nissan>();
		Cars.Nissan nissanAddObj= new Cars.Nissan(); 
		nissanAddObj.setMaxima(maximaSubObj);
		nissanAddObj.setSentra(sentraSubObj);
		
		
//		Cars carsObj = new Cars();
//		carsObj.setFord(ford);
//		carsObj.setNissan(nissan);
		
		
		
		
	}
}
