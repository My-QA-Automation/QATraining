package com.rest.assured.practice;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class SimpleBooks {
	
	String projectPath = System.getProperty("user.dir");
	
	String baseURL = "https://simple-books-api.glitch.me/orders/";
	String authToken = "c29cff2af91063f5ce8df34bd613825c96672ff62ef1e9ff66427e1ffbc3296d";
	String orderId = "";
	String updatedName = "NAME UPDATED";

	@BeforeTest 
	public void beforeTest() {
		
	}

	
	@Test
	public void createOrder() {
	
		String reqbody = " {\r\n"
				+ "  \"bookId\": 5,\r\n"
				+ "  \"customerName\": \"Jim\"\r\n"
				+ "}";
		
		
		JsonPath jsonPath = given().header("authorization", authToken).
		contentType(ContentType.JSON).
		body(reqbody).when().post(baseURL).then().log().all().extract().jsonPath();
		
		System.out.println("createOrder.orderId===>  "+jsonPath.get("orderId"));
		
		orderId = jsonPath.get("orderId");
		
		Assert.assertNotNull(orderId);
	
	}
	
	@Test (dependsOnMethods={"createOrder"})
	public void getOrderById() {
		
		JsonPath jsonPath = given().
		header("authorization", authToken).
		get(baseURL+orderId).
		then().
		log().
		all().extract().jsonPath();
		
		System.out.println("Actual ID:  "+jsonPath.get("id"));
		System.out.println("Expected ID:  "+orderId);

		Assert.assertEquals(jsonPath.get("id"), orderId);
	
	}
	
	@Test (dependsOnMethods={"getOrderById"})
	public void updateOrder() {
		String reqbody = " {\r\n"
				+ "  \"bookId\": 2,\r\n"
				+ "  \"customerName\": \""
				+ updatedName
				+ "\"\r\n"
				+ "}";
		
	    given().
	    header("authorization", authToken).
		contentType(ContentType.JSON).
		body(reqbody).		
		when().patch(baseURL+orderId).
		then().
		log().
		all().extract().jsonPath();
	
	}
	
	@Test (dependsOnMethods={"updateOrder"})
	public void getOrderByIdAfterUpdate() {
		JsonPath jsonPath = given().
		header("authorization", authToken).
		get(baseURL+orderId).
		then().
		log().
		all().extract().jsonPath();
		
		System.out.println("Actual ID:  "+jsonPath.get("id"));
		System.out.println("Expected ID:  "+orderId);
		
		System.out.println("Actual Name:  "+jsonPath.get("customerName"));
		System.out.println("Expected Name:  "+updatedName);

		Assert.assertEquals(jsonPath.get("id"), orderId);
		Assert.assertEquals(jsonPath.get("customerName"), updatedName);
	
	}
	
	@Test (dependsOnMethods={"getOrderByIdAfterUpdate"})
	public void deleteOrder() {
		
		given().
		header("authorization", authToken).
		contentType(ContentType.JSON).
		when().delete(baseURL+orderId).
		then().
		log().
		all();
		
	}
	
	@Test (dependsOnMethods={"deleteOrder"})
	public void getOrderByIdAfterDelete() {
		JsonPath jsonPath = given().
		header("authorization", authToken).
		get(baseURL+orderId).
		then().
		log().
		all().extract().jsonPath();
		
		Assert.assertEquals(jsonPath.get("error"), "No order with id "+orderId+".");
	}
	
	@AfterTest
	public void afterTest() {
		
	}
}
