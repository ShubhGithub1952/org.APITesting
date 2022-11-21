package org.APITesting.PracticeAPITest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;
import pojoClass.AddProjectPOJOTest;

public class CreateResourceTest {
	@Test
	public void createResource() {
		baseURI="http://localhost:8084";
		Random random = new Random();
		int randomNumber = random.nextInt(200);
		AddProjectPOJOTest addObj = new AddProjectPOJOTest("TYSS@Shubham", "In-Secured"+randomNumber, "InProgress", "18");
		Response response = given()
		.body(addObj)
		.contentType(ContentType.JSON)
		.when().post("/addProject");
		response.then().assertThat().statusCode(201);
		String actualProjectId = response.jsonPath().get("projectId");
	    response.then().assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS);
		System.out.println(actualProjectId);
		Assert.assertEquals(response.jsonPath().get("createdBy"), "TYSS@Shubham");
		 
		System.out.println("===============================");
		given()
		.pathParam("projId", actualProjectId)
		.when().get("/projects/{projId}")
		.then().assertThat().statusCode(200).log().all();
	}
}
