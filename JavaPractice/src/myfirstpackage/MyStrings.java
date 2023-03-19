package myfirstpackage;

public class MyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "MERCEDES";
		String name2 = "benz";
		
		System.out.println(name1.toLowerCase());
		System.out.println(name2.toUpperCase());
		
		System.out.println(name1+name2);
		System.out.println(name1.concat(name2));
		
		System.out.println(name1+ "  " +name2);
		System.out.println(name1.concat(" " +name2));
		
		System.out.println(name1.length());
		
		System.out.println(name1.charAt(4));
		
		System.out.println(name1.compareTo(name1));
	}

}
