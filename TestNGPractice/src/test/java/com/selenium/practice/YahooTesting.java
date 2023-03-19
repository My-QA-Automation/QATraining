package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTesting {

	WebDriver driver = null;
	
	@BeforeTest
	public void startTest() throws InterruptedException {
		
		System.out.println("START: Before Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div/div[3]/div/div[2]/form/input[1]")).sendKeys("today's weather");
		driver.findElement(By.id("ybar-search")).click();
		Thread.sleep(1000);
		
		System.out.println("END: Before Test");
	}
	
	@Test
	public void checkCity() {
		
		WebElement cityName = driver.findElement(By.xpath("//*[@id=\"left\"]/div/ol[1]/li/div/div/div[1]/div[2]/div/p[1]"));
		System.out.println("City on the Page: " + cityName.getText());
		Assert.assertNotNull(cityName.getText());
		
	}
	
	@Test
	public void checkTemperature() {
		
		WebElement temperature = driver.findElement(By.xpath("//*[@id=\"left\"]/div/ol[1]/li/div/div/div[1]/div[3]/div[2]/div/div/span[1]"));
		System.out.println("Temperature on the Page: " + temperature.getText());
		Assert.assertNotNull(temperature.getText());
	}

	
	@AfterTest
	public void endTest() {
		System.out.println("START: After Test");
		driver.close();		
		driver.quit();
		System.out.println("END: After Test");
	}
}
