package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoolgeTesting {

	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Today's Weather");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}

	@Test
	public void goolgeCity() {
		WebElement city = driver.findElement(By.xpath("//*[@id=\"wob_loc\"]"));
		System.out.println("cityname "  +  city.getText());
		Assert.assertNotNull(city);
	}
	
	@Test
	public void goolgeTemperature() {
		WebElement temperature = driver.findElement(By.xpath("//*[@id=\"wob_tm\"]"));
		System.out.println("Temperature "  +  temperature.getText());
		Assert.assertNotNull(temperature);
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
		
	}
}