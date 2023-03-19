package com.selenium.practice;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserTestingPractice {
	
	
	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		//Click on login
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]")).click();
		
		
		Thread.sleep(2000);
		
			
		//login details
		driver.findElement(By.name("email")).sendKeys("tatineni.rajitha@yahoo.com");
		driver.findElement(By.name("data[User][password]")).sendKeys("Rajitha@Testing");
		Thread.sleep(1000);
		
	}
	
	
		
	@AfterTest
	public void afterTest() {
			driver.close();
			driver.quit();
		
		
	}
	
}

