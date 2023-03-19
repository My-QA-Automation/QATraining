package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://app.yesmsystems-healthcare.com/");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.name("loginEmail")).sendKeys("abc@gmail.com");
				
				//driver.findElement(By.id("loginEmail")).sendKeys("abc@gmail.com");
				
				//driver.findElement(By.cssSelector("#loginEmail")).sendKeys("abc@gmail.com");
				
				//driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("abc@gmail.com");
				
				//driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("abc@gmail.com");
				
				//driver.findElement(By.name("loginPassword")).sendKeys("abc");
				
				//driver.findElement(By.id("loginPassword")).sendKeys("abc");
				
				driver.findElement(By.cssSelector("#loginPassword")).sendKeys("abc");
				
				//driver.findElement(By.name("loginUserName")).sendKeys("abc@gmail.com");
				
				driver.findElement(By.name("loginUserName")).click();
				
				//driver.findElement(By.linkText("Current Appointment")).click();
										
				driver.findElement(By.partialLinkText("Notifications")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.partialLinkText("Current")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.partialLinkText("Take")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.partialLinkText("Bills")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.partialLinkText("Treatment")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/nav/div/ul[1]/li/a")).click();
				
					
				Thread.sleep(4000);
				
				driver.close();
				
				driver.quit();
	}

}
