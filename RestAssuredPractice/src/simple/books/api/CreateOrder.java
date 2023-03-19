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
		
		given().header("authorization", "c29cff2af91063f5ce8df34bd613825c96672ff62ef1e9ff66427e1ffbc3296d").
		contentType(ContentType.JSON).
		body(reqbody).when().post("https://simple-books-api.glitch.me/orders").
		
		then().log().all();
		
		
	}

}
