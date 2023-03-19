package simple.books.api;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class SubmitOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reqbody = " {\r\n"
				+ "  \"bookId\": 3,\r\n"
				+ "  \"customerName\": \"Kate\"\r\n"
				+ "}";
		
		     given().
			
			header("authorization", "1c25ef6645289da9fa25102b6838b735d66f5706ca85436249d86cb057db14c9").
			
			contentType(ContentType.JSON).
			body(reqbody).
			
			when().post("https://simple-books-api.glitch.me/orders").
			then().
			log().
			all();
	
	}
	 	

}
