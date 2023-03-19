package abstarctclass;

public class Dog extends Animal {
	
	public void sound () {
		System.out.println("I can woff");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog d1 = new Dog ();
		d1.walk();
		d1.run();
		d1.sound();
			
		
	}

}
