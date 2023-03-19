package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://app.yesmsystems-healthcare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sName")).sendKeys("Nancy");
		driver.findElement(By.id("sBirthDate")).sendKeys("22-09-2000");
		driver.findElement(By.id("sEmail")).sendKeys("nancy@gmail.com");
		driver.findElement(By.name("sPassword")).sendKeys("Health");
		driver.findElement(By.cssSelector("#scPassword")).sendKeys("Health");
		driver.findElement(By.name("Phone")).sendKeys("12345645817");
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("Address")).sendKeys("14 Street,City,State,58742");
		
			
		driver.findElement(By.xpath("//*[@id=\"SignUpPage\"]/div[3]/div/div/div/div[2]/div[4]/div/div[2]/input")).click();
				
		
	}

}
