package simple.books.api;


import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class UpdateBookOrder {

	public static void main(String[] args) {
		
		String reqbody = " {\r\n"
				+ "  \"bookId\": 2,\r\n"
				+ "  \"customerName\": \"Lima\"\r\n"
				+ "}";
     given().
	
	header("authorization", "c29cff2af91063f5ce8df34bd613825c96672ff62ef1e9ff66427e1ffbc3296d").
	
	contentType(ContentType.JSON).
	body(reqbody).
	
	when().patch("https://simple-books-api.glitch.me/orders/zT8hLWqdTqtxGzQp-lntl").
	then().
	log().
	all();
	
}
}