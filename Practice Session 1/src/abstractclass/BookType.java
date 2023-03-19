package abstractclass;

public class BookType extends Product1 {
	
	
	public void Booktype() {
	System.out.println("Action Type");
	}
 
	public static void main(String[] args) {
		BookType b1 = new BookType ();
		b1.review();
		b1.book();
		b1.Booktype();
	}

	
}
