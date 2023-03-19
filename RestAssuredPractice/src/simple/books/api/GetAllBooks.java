package simple.books.api;

import static io.restassured.RestAssured.given;

public class GetAllBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		given().
		get("https://simple-books-api.glitch.me/books").
		then().
		log().
		all();
		
	}

}
