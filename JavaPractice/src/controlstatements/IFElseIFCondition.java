package controlstatements;

public class IFElseIFCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
		
		
		
		if (a>b) {
			System.out.println("a value is greated than b");
		}
		
		else if (b>c)	{
			System.out.println("b value is greater than c");
		}
		else if (a>c) {
			System.out.println("a value is greater than c");
		}
		else {
			System.out.println("a value is less than b and c");
		}
		
		if (5>10) {
			System.out.println("No 5 is greater than 10");
		}
		else if (2<1) {
			System.out.println("yes 2 is greater than 1");
		}
		else if (15>5) {
			System.out.println("yes 15 is greater than 5");
		}
		else {
			System.out.println("look out the values and enter again");
		}
	}
	
}
