package simple.books.api;

import static io.restassured.RestAssured.given;

public class GetAllOrders {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			given().
			header("authorization", "1c25ef6645289da9fa25102b6838b735d66f5706ca85436249d86cb057db14c9").
			get("https://simple-books-api.glitch.me/orders").
			then().
			log().
			all();
			

}
	}
