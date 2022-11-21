package serializationAndDeserialization;

import java.io.File;
import java.util.Random;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass.AddProjectPOJOTest;

public class AddProjectSerializationTest1 {
	@Test
	public void addProjectTest() throws Throwable {
		Random random = new Random();
		int randomNumber = random.nextInt(500);
		AddProjectPOJOTest addProj = new AddProjectPOJOTest("ShubhamP", "HealthTreasure"+randomNumber, "In-Progress", "20");
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.writeValue(new File("./addProject.json"), addProj);
	}
}
