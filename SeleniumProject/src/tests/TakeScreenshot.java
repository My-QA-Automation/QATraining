package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://yahoo.com/");
		
		driver.manage().window().maximize();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(src,new File("C:\\Users\\Production\\Desktop\\Screenshots\\error.png"));
		
		driver.close();
		driver.quit();
	
	}

}
