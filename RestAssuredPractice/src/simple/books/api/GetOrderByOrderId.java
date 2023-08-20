package simple.books.api;

import static io.restassured.RestAssured.given;

public class GetOrderByOrderId {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		given().
		header("authorization", "9a28e840b81c9424a020c91bb42bd1e1210825076f45f6a34291d4d3df949578").
		get("https://simple-books-api.glitch.me/orders/MlFkiobSvVPFD4ca98ngb").
		then().
		log().
		all();
		
	}

}
