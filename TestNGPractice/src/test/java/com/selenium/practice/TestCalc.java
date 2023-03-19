package com.selenium.practice;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.my.calc.Calculator;

public class TestCalc {
	Calculator calc = null;
	
	@BeforeTest
	public void beforeTest() {
		calc = new Calculator();
	}

	@Test
	public void testAddInt() {
		int result = calc.add(2, 5);
		Assert.assertEquals(result, 7);
	}
	
	@Test
	public void testAddFloat() {
		float result = calc.add(2.5f, 5.7f);
		Assert.assertEquals(result, 8.2f);
	}
	
	@Test
	public void testSubtract() {
		int c = calc.subtract(5, 2);
		System.out.println("Value from Calculator: "+c);
		Assert.assertEquals(c, 3);
	}
	
	@Test
	public void testMultiply() {
		int c = calc.multiply(5, 2);
		System.out.println("Value from Calculator: "+c);
		Assert.assertEquals(c, 10);
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("End Test");
	}
	
	
}
