package webBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		
		driver.close();
		
		driver.quit();
		
	}
}
