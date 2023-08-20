package simple.books.api;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class CreateOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reqbody = " {\r\n"
				+ "  \"bookId\": 5,\r\n"
				+ "  \"customerName\": \"Jim\"\r\n"
				+ "}";
		
		given().header("authorization", "9a28e840b81c9424a020c91bb42bd1e1210825076f45f6a34291d4d3df949578").
		contentType(ContentType.JSON).
		body(reqbody).when().post("https://simple-books-api.glitch.me/orders").
		
		then().log().all();
		
		
	}

}
