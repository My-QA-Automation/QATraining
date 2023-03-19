package com.rest.assured.practice;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utils.ExcelUtils;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class CreateOrder_ExcelData_1004 {

	String baseURL = "https://simple-books-api.glitch.me/orders/";
	String authToken = "982e2ef28a54ae30fb2b7863a35cdf47137d7d811509206fc75f8a8608f163f5";


	@BeforeTest()
	public void beforeTest() {
	
	}
	
	@DataProvider(name = "orderData")
	public Object[][]getOrderData() throws Exception{
	ExcelUtils excelUtils = new ExcelUtils();
	 Object[][] testObjArray = excelUtils.getTableArray("C:\\Users\\Production\\eclipse-workspace\\TestNGPractice\\test-data\\SimpleBooks.xlsx","Orders");
     return testObjArray;
	}
	
	@Test(dataProvider = "orderData")
	public void createOrder(String bookId, String customerName) {
		System.out.println("Id for book"    + bookId +    "Name of the customer"+ customerName);
		String reqbody = " {\r\n"
				+ bookId
				+ ",\r\n"
				+ customerName
				+ "\"\r\n"
				+ "}";
		
		JsonPath jsonPath = given().header("authorization", authToken).
		contentType(ContentType.JSON).
		body(reqbody).when().post(baseURL).
		then().log().all().extract().jsonPath();
		
		String orderId = jsonPath.get("orderId");
		
		System.out.println("createOrder.orderId===>  "+orderId);
		
		Assert.assertNotNull(orderId);
			
	}

	@AfterTest()
	public void afterTest() {
		 
	}

}
