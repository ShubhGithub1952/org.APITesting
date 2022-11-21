package requestChainingAndVerify;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.util.List;
import java.util.Random;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.AddProjectPOJOTest;

public class CreateResourcesAndVerifyTest {
	@Test
	public void createResources() {
		// Create The Resources inside Server
		baseURI="http://localhost:8084";
		Random random = new Random();
		int randomNumber = random.nextInt();
		AddProjectPOJOTest addProj = new AddProjectPOJOTest("SanketS", "PicasaArt"+randomNumber, "In-Progress", "28");
		Response response = given()
		.body(addProj)
		.contentType(ContentType.JSON)
		.when().post("/addProject");
		response.then().assertThat().statusCode(201);
		//Capture the Attribute and Store in one Container
		String actualProjectId = response.jsonPath().get("projectId");
		System.out.println(actualProjectId);
		response.then().assertThat().time(Matchers.lessThan(2000L));
		Assert.assertEquals(response.jsonPath().get("createdBy"), "SanketS");
		
		response.then().log().all();
		System.out.println("=============================================================");
		Response getResponse = when().get("/projects");
		getResponse.then().assertThat().statusCode(200);
		//Dynamic Validation of Project Created
		List<String> allProjectId = getResponse.jsonPath().get("projectId");
		boolean flag=false;
		for (String str : allProjectId) {
			if (str.equals(actualProjectId)) {
				flag=true;
				break;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Data is Verified !");
		getResponse.then().log().all();
		System.out.println("============================================================");
		//Get the  Resources of Project Created from Server
		Response getAllResponse = given()
		.pathParam("projectId", actualProjectId)
		.when().get("/projects/{projectId}");
		getAllResponse.then().statusCode(200);
		getAllResponse.then().assertThat().log().all();
		System.out.println("=========================================================");
		//Do the Modification inside the Project Resources created
		AddProjectPOJOTest addProj1 = new AddProjectPOJOTest("Sanket", "PicasaArt"+randomNumber, "Completed", "28");
		
		Response putResponse = given()
				.pathParam("projectId", actualProjectId)
				.body(addProj1)
				.contentType(ContentType.JSON)
		.when().put("/projects/{projectId}");
		putResponse.then().assertThat().statusCode(200);
		Assert.assertEquals(putResponse.jsonPath().get("createdBy"), "Sanket");
		putResponse.then().contentType(ContentType.XML);
		putResponse.then().log().all();
		System.out.println("=========================================================");
		// Delete the resources Which is Created 
		Response deleteResponse = given()
		.pathParam("projectId", actualProjectId)
		.when().delete("/projects/{projectId}");
		deleteResponse.then().assertThat().statusCode(204);
		//deleteResponse.then().contentType(ContentType.XML);
	}
}
