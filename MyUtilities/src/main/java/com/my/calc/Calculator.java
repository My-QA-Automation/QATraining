package com.my.calc;

public class Calculator implements ICalculator{

	public int add(int intA, int intB) {
		
		// TODO Auto-generated method stub	
		Add addObj = new Add();	
		int intC = addObj.addIntegers(intA, intB);	
		return intC;
		
	}

	public float add(float floatA, float floatB) {
		// TODO Auto-generated method stub	
		Add addObj = new Add();	
		float floatC = addObj.addFloat(floatA, floatB);	
		return floatC;
	}

	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		Subtract sub = new Subtract();
		int c = sub.subInt(a, b);
		return c;
	}

	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		Multiply multiplyObj = new Multiply();
		int c = multiplyObj.multiplyIntegers(a, b);
		return c;
	}

	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
