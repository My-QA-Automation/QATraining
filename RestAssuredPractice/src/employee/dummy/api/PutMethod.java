package employee.dummy.api;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   String reqbody =  "{\"name\":\"Adithya\",\"salary\":\"6000\",\"age\":\"23\"}" ;
			   
			  
		   
	    given().
	    contentType(ContentType.JSON).
		body(reqbody).
		
		when().put("http://dummy.restapiexample.com/api/v1/update/8001").
	    
	    then().
	    log().
	    all();
	    
	}

}
