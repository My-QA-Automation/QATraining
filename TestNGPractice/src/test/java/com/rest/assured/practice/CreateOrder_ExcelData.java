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

public class CreateOrder_ExcelData {
	
	String projectPath = System.getProperty("user.dir");
	String baseURL = "https://simple-books-api.glitch.me/orders/";
	String authToken = "982e2ef28a54ae30fb2b7863a35cdf47137d7d811509206fc75f8a8608f163f5";
	
	@BeforeTest 
	public void beforeTest() {
		
	}

	
	@DataProvider(name = "orderData")
    public Object[][] getOrderData() throws Exception{
		ExcelUtils excelUtils = new ExcelUtils();
        Object[][] testObjArray = excelUtils.getTableArray(projectPath+"\\test-data\\SimpleBooks.xlsx","Orders");
        return testObjArray;
	}

	
	@Test(dataProvider = "orderData")
	public void createOrder(String bookId, String customerName){
		
		System.out.println("######## TEST DATA: bookId  "+bookId+"; customerName: "+customerName+" ########");
		
		String reqbody = " {\r\n"
				+ "  \"bookId\": "
				+ bookId
				+ ",\r\n"
				+ "  \"customerName\": \""
				+ customerName
				+ "\"\r\n"
				+ "}";
		
		
		JsonPath jsonPath = given().header("authorization", authToken).
		contentType(ContentType.JSON).
		body(reqbody).when().post(baseURL).then().log().all().extract().jsonPath();
			
		String orderId = jsonPath.get("orderId");
		
		System.out.println("createOrder.orderId===>  "+orderId);
		
		Assert.assertNotNull(orderId);
		
		getOrderById(orderId);
	}

	public void getOrderById(String orderId){
		
		JsonPath jsonPath = given().
		header("authorization", authToken).
		get(baseURL+orderId).
		then().
		log().
		all().extract().jsonPath();
		
		System.out.println("Actual ID:  "+jsonPath.get("id")+"; Expected ID:  "+orderId);
	
		Assert.assertEquals(jsonPath.get("id"), orderId);		
	}
	
	@AfterTest
	public void afterTest() {
		
	}
}
