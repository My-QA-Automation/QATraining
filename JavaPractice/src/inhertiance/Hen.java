package inhertiance;

public class Hen extends Animal {

	
	public static void main(String[] args) {
		
		Hen h1 = new Hen ();
		
		System.out.println(h1.eyes);
		System.out.println(h1.legs);
		
		h1.walk();
		h1.run();
		h1.move();
	}
}
