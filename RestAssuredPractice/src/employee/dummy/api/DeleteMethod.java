package employee.dummy.api;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class DeleteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "8001";
		
		given(). 
		contentType(ContentType.JSON).	
	
		when().delete("http://dummy.restapiexample.com/api/v1/delete/" + id).
		then().
		log().
		all();
	}

}
 