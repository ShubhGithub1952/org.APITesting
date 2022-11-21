package serializationAndDeserialization;

import java.io.File;


import com.fasterxml.jackson.databind.json.JsonMapper;

import pojoClass.Cars;
import pojoClass.ComplexPojoClassTest;
import pojoClass.Escort;
import pojoClass.Ford;
import pojoClass.Maxima;
import pojoClass.Nissan;
import pojoClass.Sentra;
import pojoClass.Taurus;

public class ComplexSerializationTest {
	public static void main(String[] args) throws Throwable {
		Escort escortObj = new Escort("4","automatic");
		Taurus taurusObj = new Taurus("4","automatic");
		Maxima maximaObj = new Maxima("4","automatic");
		Sentra sentraObj = new Sentra("4","automatic");
		Ford fordObj = new Ford(taurusObj, escortObj);
		Nissan nissanObj = new Nissan(sentraObj, maximaObj);
		Cars carsObj = new Cars(nissanObj, fordObj);
		ComplexPojoClassTest complexPojoObj = new ComplexPojoClassTest(carsObj);
		
		JsonMapper jsonMapperObj = new JsonMapper();
		jsonMapperObj.writeValue(new File("./ComplexJSON.json"), complexPojoObj);
		
		
	}
}
