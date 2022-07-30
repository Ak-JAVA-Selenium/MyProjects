package RestAPI_Testing;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class Test1_GetReq {

	@Test
	public void get() {

//		RestAssured.baseURI= "https://reqres.in";

		Response Response = given().body("{\r\n"
				+ "    \"name\":\"aaaaaaaaaaaaaaaaaaaaaaaaaa\",\r\n"
				+ "    \"job\":\"ghvmj,\"\r\n"
				+ "}") // https://reqres.in/api/users?page=2
				.when().post("https://reqres.in/api/users/3");
		Response.then().time(Matchers.lessThan(1000l));
		
	String x=	Response.jsonPath().get("id");
System.out.println(x);
		
	RequestSpecification req=	RestAssured.given();
req.formParam("xyz", "xx");
ResponseSpecification repo=(ResponseSpecification) req.post().then();

Response.then().log().all();



	}
}
