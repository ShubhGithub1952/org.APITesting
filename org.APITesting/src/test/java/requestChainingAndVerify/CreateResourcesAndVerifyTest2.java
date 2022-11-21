package requestChainingAndVerify;

import java.util.List;
import java.util.Random;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClass.AddProjectPOJOTest;
/**
 * 
 * @author SHUBH
 *
 */
public class CreateResourcesAndVerifyTest2 {
	@Test
	public void createResourceTest() {
		//Add Project And Validate the Response Header and Response Body
			baseURI="http://localhost:8084";
			Random random = new Random();
			int randomNumber = random.nextInt(500);
			AddProjectPOJOTest addProject = new AddProjectPOJOTest("ShubhamP", "HerbalNutrition"+randomNumber, "In-Progress", "22");
			Response postResponse = given()
			.body(addProject)
			.contentType(ContentType.JSON)
			.when()
			       .post("/addProject");
		//Validate the Response Header
			postResponse.then().assertThat().statusCode(201);
			postResponse.then().assertThat().time(Matchers.lessThan(2000L));
			String actualProjectId = postResponse.jsonPath().get("projectId");
			System.out.println(actualProjectId);
			// Validate the Response Body
			Assert.assertEquals(postResponse.jsonPath().get("createdBy"), "ShubhamP");
			postResponse.then().assertThat().log().all();
		System.out.println("================================================================");
		//Verify With Server Resource is Created or Not 
			Response getAllResponse = given()
			.when().get("/projects");
			List<String> projectIds = getAllResponse.jsonPath().get("projectId");
			boolean flag=false;
			for (String pid : projectIds) {
				if (pid.equals(actualProjectId)) {
					flag=true;
				}
			}
			Assert.assertTrue(flag);
			getAllResponse.then().assertThat().statusCode(200);
			getAllResponse.then().log().all();
		System.out.println("================================================================");
		//Get Perticuler Resource From Server
			Response getResponse = given()
			.pathParam("projectId", actualProjectId)
			.when().get("/projects/{projectId}");
			getResponse.then().assertThat().statusCode(200);
			Assert.assertEquals(getResponse.jsonPath().get("createdBy"), "ShubhamP");
		System.out.println("==================================================================");
		//Modify the Resource Which is Existed in the Server
			AddProjectPOJOTest addProject1 = new AddProjectPOJOTest("ShubhamBP", "HerbalNutrition"+randomNumber, "Completed", "22");
			Response putResponse = given()
			.pathParam("projectId", actualProjectId)
			.body(addProject1)
			.contentType(ContentType.JSON)
			.when().put("/projects/{projectId}");
			putResponse.then().assertThat().statusCode(200);
			Assert.assertEquals(putResponse.jsonPath().get("status"), "Completed");
			putResponse.then().log().all();
		System.out.println("=================================================================");
		//Delete The Resources which is Existed in the Server 
			Response deleteResponse = given()
			.pathParam("projectId", actualProjectId)
			.when().delete("/projects/{projectId}");
			deleteResponse.then().assertThat().statusCode(204);
		System.out.println("Resource is Deleted From Server !");
	}
}
