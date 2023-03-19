package employee.dummy.api;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PostMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reqbody = " {\"name\":\"Adithya\",\"salary\":\"5000\",\"age\":\"23\"}";
		
	int eid = given().
		contentType(ContentType.JSON).
		body(reqbody).
		
		when().post("http://dummy.restapiexample.com/api/v1/create").
		
		then().
		extract().path("data.id");
	   System.out.println(eid);
		
	   
	   
	   given().
		contentType(ContentType.JSON).
		body(reqbody).
		
		when().put("http://dummy.restapiexample.com/api/v1/update/"+eid).
		
		then().
		log().all();   
	   
	   
	   
	   given().
		contentType(ContentType.JSON).
		body(reqbody).
		
		when().delete("http://dummy.restapiexample.com/api/v1/delete/"+eid).
		
		then().
		log().all();   
	}

}
