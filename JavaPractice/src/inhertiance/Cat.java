package inhertiance;

public class Cat extends Animal {

	
	public static void main(String[] args) {
		
		Cat c1 = new Cat ();
		
		System.out.println(c1.eyes);
		System.out.println(c1.legs);
		
		c1.walk();
		c1.run();
		c1.move();
	}
				
}
