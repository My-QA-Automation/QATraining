package webBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		List cols = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/thead/tr/th"));
		
		int noCols = cols.size();
		System.out.println(noCols);
		
		
         List rows = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr"));
		
		int noRows = rows.size();
		System.out.println(noRows);
		
		driver.close();
		driver.quit();
		
	}

}


