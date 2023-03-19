package com.selenium.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGProgram1 {
	
@Test
public void test1() {
	System.out.println("Test1 is running");
	Assert.assertEquals(4, 4);
	System.out.println("after assert: assert statement returns true");
}


@Test
public void test2() {
	System.out.println("Test2 is running");
	SoftAssert assertion = new SoftAssert();
	assertion.assertEquals(4, 2);
	System.out.println("after softassert: Soft assert statement executes");
	assertion.assertAll();
}


}
