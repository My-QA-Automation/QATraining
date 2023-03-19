package employee.dummy.api;

import static io.restassured.RestAssured.*;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		given().
		get("http://dummy.restapiexample.com/api/v1/employees").
		then().
		log().
		all();
		
	}

}
