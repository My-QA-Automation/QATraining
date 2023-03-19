package webBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		
		
		 //Below link for News
		//driver.findElement(By.xpath("//*[@id=\"root_2\"]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[2]/nav/ul/li[1]/div[1]/a")).click();
		
		//Weather
		driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div/div[3]/div/div[2]/form/input[1]")).sendKeys("today's weather");
		driver.findElement(By.id("ybar-search")).click();
		
		
		Thread.sleep(1000);
		
		//WebElement cityName=driver.findElement(By.xpath("//*[@id=\"left\"]/div/ol[1]/li/div/div/div[1]/div[2]/div"));
		WebElement cityName=driver.findElement(By.xpath("//*[@id=\"left\"]/div/ol[1]/li/div/div/div[1]/div[2]/div/p[1]"));
		System.out.println("City on the Page: " + cityName.getText());
				
		
		Thread.sleep(5000);
	
		
		driver.close();
		
		driver.quit();
		

	}

}
