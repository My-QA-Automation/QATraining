package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Country Name Drop down
		Select drpCountryName = new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
		
		//Drop CountryName by Index
		drpCountryName.selectByIndex(1);
		List<WebElement> countries = drpCountryName.getOptions();	
		
		System.out.println("SIZE====> "+countries.size());
		for(int i=0; i<countries.size(); i++) {
			System.out.println(i+": "+countries.get(i).getText());
		}
		
		
		//Drop CountryName by Visible Text
		//drpCountryName.selectByVisibleText("CANADA");
	
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
		//login for other website
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//drpEmpStatus.selectByIndex("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i");
		//Paul Colling
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		//Logout
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	
	}

}
