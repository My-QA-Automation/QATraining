package JavaProgram;

public class Calculator extends practice {
	
	public static void main (String[] args) {	

		int addResponse = add(2,5);
		System.out.println(addResponse);
	}
	
	 public static int add(int a, int b) {
		 int response;
		 response = a+b;
		 return response;	 
	 }
 
	
}
