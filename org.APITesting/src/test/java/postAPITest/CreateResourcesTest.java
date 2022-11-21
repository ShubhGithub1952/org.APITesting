package postAPITest;

import static io.restassured.RestAssured.DEFAULT_BODY_ROOT_PATH;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Random;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.AddProjectPOJOTest;

public class CreateResourcesTest {
	@Test
	public void addProjectTest() {
		baseURI="http://localhost:8084";
		Random random = new Random();
		int randomNumber = random.nextInt(500);

		AddProjectPOJOTest addProj = new AddProjectPOJOTest("TYSS@Satish", "SecuredLife"+randomNumber, "InProgress", "28");
		Response response = given()
				.body(addProj)
				.contentType(ContentType.JSON)
				.when().post("/addProject");
		 String projId = response.jsonPath().get("projectId");
		//Header Validation
		response.then().assertThat().statusCode(201);
		//response.then().assertThat().time(Matchers.lessThan(2000l));
		//Response Body Validation
		Assert.assertEquals(response.jsonPath().get("createdBy"),"TYSS@Satish");
		System.out.println(projId);
		System.out.println("=====================================");
		given()
		.pathParam("projectId", projId)
		.when().get("/projects/{projectId}")
	    .then().assertThat().statusCode(200).log().all();
		Assert.assertEquals(response.jsonPath().get("createdBy"), "TYSS@Satish");
	}
}
