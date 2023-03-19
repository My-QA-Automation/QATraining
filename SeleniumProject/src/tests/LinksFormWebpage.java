package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksFormWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php");
		
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the page is"+ links.size());
		
		for (int i=1; i<=links.size();i= i+1) {
			System.out.println("Name of Links#" + i + links.get(i).getText());
		}
		
		driver.close();
		driver.quit();


	}

}
