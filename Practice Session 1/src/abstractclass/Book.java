package abstractclass;

public class Book extends Product {

	
	public void date() {
		System.out.println("Sep 2020");
	}
	
	public static void main(String[] args) {
		
		Book b2 = new Book ();
		b2.Price();
		b2.review();
		b2.date();
		

	}

}
