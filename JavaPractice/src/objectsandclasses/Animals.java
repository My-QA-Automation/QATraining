package objectsandclasses;

public class Animals {

	
	int tail =1;
	int eyes =2;
	int legs =4;
	
	
	public void walk () {
		System.out.println("I can walk");
	}
	
	public void run() {
		System.out.println("I can run");
	}
	
	public static void main(String[] args) {
		
		Animals cat =new Animals();
		
		System.out.println(cat.tail);
		System.out.println(cat.eyes);
		System.out.println(cat.legs);
		
		cat.run();
		cat.walk();
		
		Animals dog=new Animals();
		System.out.println(dog.tail);
		System.out.println(dog.eyes);
		System.out.println(dog.legs);
		
		dog.run();
		dog.walk();
		
	}
}
