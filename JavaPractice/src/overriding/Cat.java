package overriding;

public class Cat extends Animal {
	
	public void sound() {
		System.out.println("Meow Meow");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cat c1 = new Cat();
		
	c1.walk();
	c1.run();
	c1.sound();
		
	}

}
