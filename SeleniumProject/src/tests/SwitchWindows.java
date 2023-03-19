package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("newWindowBtn")).click();
			
		String ParentsWindow = driver.getWindowHandle();
		System.out.println(ParentsWindow);
				
		Set<String> ChildWindows = driver.getWindowHandles();
		System.out.println(ChildWindows);
		
	   Iterator<String> windowID = ChildWindows.iterator();
		
		while(windowID.hasNext())
		{
			String Childwindow = windowID.next();
			
			if (!ParentsWindow.equals(Childwindow)) {
				System.out.println(Childwindow);
				driver.switchTo().window(Childwindow);
				driver.close();
			}
		}
		
		driver.switchTo().window(ParentsWindow);
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		

	}

}
