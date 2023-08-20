package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class LoginSteps {	
	
	private WebDriver driver;
	WebDriverWait wait;
   
    @Given("^I am able to access \"([^\"]*)\"$")
    public void i_am_able_to_access(String url) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Production\\Desktop\\QA Analyst\\chromedriver_win32\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	
    	driver = new ChromeDriver(options);    	
        driver.get(url);
    }

    @When("^I update the \"([^\"]*)\" username as \"([^\"]*)\"$")
    public void i_update_the_username_as(String app, String username) {
    	        
        driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(username);  
        
    }

    @And("^I click on the \"([^\"]*)\" next button$")
    public void i_click_on_the_next_button(String app) {
    	   	
    	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nextbtn\"]"))).click();
        
    }

    @Then("^I should get the \"([^\"]*)\" error message as \"([^\"]*)\"$")
    public void i_should_get_the_error_message(String app, String expectedErrorMessage) {
    	 
    	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    	String actualErrorMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"getusername\"]/span/div[2]"))).getText();       
        assertEquals(expectedErrorMessage, actualErrorMessage);
        
        driver.quit();
    }
}
