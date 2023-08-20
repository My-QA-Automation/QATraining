package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class ApisSteps {

    private Response createResponse;
    int bookId;
    String customerName;

    @Given("^the base API endpoint is \"(.*)\"$")
    public void setBaseEndpoint(String baseEndpoint) {
        RestAssured.baseURI = baseEndpoint;
    }

    @When("^I make a POST request with bookid \"(\\d+)\" and name \"(.*)\"$")
    public void makePostRequest(int bookId, String name) {
    	this.bookId = bookId;
    	this.customerName = name;
    	
    	createResponse = RestAssured.given()
        	.header("authorization", "9a28e840b81c9424a020c91bb42bd1e1210825076f45f6a34291d4d3df949578")
            .contentType(ContentType.JSON)
            .body("{\"bookId\": " + bookId + ", \"customerName\": \"" + name + "\"}")
            .post("/orders");
            
        System.out.println(createResponse.asPrettyString());
    }

    @Then("^the response status code should be (\\d+)$")
    public void verifyStatusCode(int statusCode) {
        int actualStatusCode = createResponse.getStatusCode();
        Assert.assertEquals(statusCode, actualStatusCode);
    }

    @And("^the response body contains \"(.*)\"$")
    public void verifyResponseBody(String createdValue) {
        String responseBody = createResponse.getBody().asString();
        Assert.assertTrue(responseBody.contains("\"created\": " + createdValue));
    }
    
    @And("^I make a GET request with orderId from previous call \"(.*)\"$")
    public void makeGetRequest(String createdValue) {
        
    	String orderId = createResponse.jsonPath().getString("orderId");
    	
    	Response getResponse = RestAssured.given()
            	.header("authorization", "9a28e840b81c9424a020c91bb42bd1e1210825076f45f6a34291d4d3df949578")
                .contentType(ContentType.JSON)
                .get("/orders/"+orderId);
        
    	System.out.println(getResponse.asPrettyString());
    	
    	int resBookId = Integer.parseInt(getResponse.jsonPath().getString("bookId"));
    	String resCustomerName = getResponse.jsonPath().getString("customerName");
    	
    	Assert.assertEquals(bookId, resBookId);
    	Assert.assertEquals(customerName, resCustomerName);
        
    }
}
