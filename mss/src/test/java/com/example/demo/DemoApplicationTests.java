package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



@SpringBootTest
class DemoApplicationTests {

	@org.testng.annotations.Test
	void getAllEmployee() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/selectall").then().statusCode(200).log().body();
		System.out.println("ok");
		}
	@org.testng.annotations.Test
	public void addEmployee() {
		try {
		RestAssured.baseURI = "http://localhost:8080";
		JSONObject req = new JSONObject();

		req.put("id", 47);
		req.put("name", "satya");
		req.put("age",22);
		req.put("phno",2447);
		req.put("email", "satya@gmail.com");
		req.put("desig", " dev");
		req.put("salary",13000);
		System.out.println("req" + req);
		Response res = RestAssured.given().contentType(ContentType.JSON)
				.header("Content-Type", "application/json")
				.body(req.toJSONString()).when().post("/insert").then().extract().response();
		System.out.println("res==>" + res.asString());
		String result = res.jsonPath().getString("success");

		String samplepost = "Record  successfully";
		System.out.println("result==>" + result);

		Assert.assertEquals(result, samplepost);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
	}
	@Test
	public void delete()
	{
		RequestSpecification req=RestAssured.given();
	    req.header("Content-Type","application/json");
	    JSONObject json=new JSONObject();
	    json.put("id", 33);
		json.put("name", "gayle");
		json.put("age",30);
		json.put("phno",2447);
		json.put("email", "chris@gmail.com");
		json.put("desig", " dev");
		json.put("salary",13000);
		req.body(json.toJSONString());
		Response res=req.post("/insert");
		int code=res.getStatusCode();
	    Assert.assertEquals(code,200);	
	}
	@org.testng.annotations.Test
	public static void getResponseTime(){
	RestAssured.baseURI = "http://localhost:8080";
	 System.out.println("time to finish"+RestAssured.given().get("/selectall").
	        timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
	}
}
