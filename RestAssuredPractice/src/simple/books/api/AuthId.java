package simple.books.api;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class AuthId {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reqbody = " {\r\n"
				+ "   \"clientName\": \"Postman\",\r\n"
				+ "   \"clientEmail\": \"Createtyjdfijiyu@example.com\"\r\n"
				+ "}";
		
		given().
		contentType(ContentType.JSON).
		body(reqbody).
		
		when().post("https://simple-books-api.glitch.me/api-clients/").
		
		then().
		log(). all();
		
		
	}


}
