package tests;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php");
		
		driver.manage().window().maximize();
		
		//Number of columns
		List cols = driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/thead/tr/th"));
		int nocols = cols.size();
		System.out.println(nocols);
		
		//Number of Rows
		List rows = driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/tbody/tr"));
		int noRows = rows.size();
		System.out.println(noRows);

		
		for(int i=1; i<-noRows; i++) {
			
			String cellData = driver.findElement(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/tbody/tr["+i+"]td[1]")).getText();
			System.out.println(cellData);
		
		}
		driver.close();
		driver.quit();

	}

}
