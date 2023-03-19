package webBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
		
		driver.manage().window().maximize();
				
		List cols = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr/th"));
		int nocols = cols.size();
		System.out.println(nocols);
		
		List rows = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		int norows = rows.size();
		System.out.println(norows);
		
		
		driver.close();
		driver.quit();
		}

	}


	