package complexBodyRequest;

import org.json.simple.JSONObject;

public class CreateComplexBodyRequestTest {
	public static void main(String[] args) {
		
		//Elements from Sentra Object
		JSONObject obj1 = new JSONObject();
		obj1.put("doors",4);
		obj1.put("transmission","automatic");
		
		// Elements from Maxima Object
		JSONObject obj2 = new JSONObject();
		obj2.put("doors",4);
		obj2.put("transmission","manual");
		
		//Elements from Taurus Object
		JSONObject obj3 = new JSONObject();
		obj3.put("doors",4);
		obj3.put("transmission","automatic");
		
		//Elements from Escort Object
		JSONObject obj4 = new JSONObject();
		obj4.put("doors",4);
		obj4.put("transmission","manual");
		
		// Elements from Nissan Object
		JSONObject nissanObject = new JSONObject();
		nissanObject.put("Sentra", obj1);
		nissanObject.put("Maxima", obj2);
		
		// Elements from Ford Object
		JSONObject fordObject = new JSONObject();
		fordObject.put("Taurus",obj3);
		fordObject.put("Escort",obj4);
		
		// Elements from Cars Object
		JSONObject carsObject = new JSONObject();
		carsObject.put("Ford", fordObject);
		carsObject.put("Nissan", nissanObject);
		
		JSONObject jobj = new JSONObject();
		jobj.put("cars", carsObject);
		
		System.out.println(jobj);
		
	}
}
