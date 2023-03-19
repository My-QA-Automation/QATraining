package inhertaince1;

public class Book extends Product {

	
	public static void main(String[] args) {
		
		Book B1 = new Book();
		System.out.println(B1.Book);
		System.out.println(B1.Price);
		System.out.println(B1.Review);
		
		B1.author();
		B1.date();
	}
	
	
}
