package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest {
	WebDriver driver;
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		//with 2.36 for  chrome driver version 66
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\stripathi\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		  driver = new ChromeDriver();
		 // driver.manage().window().maximize();
		    driver.get("https://www.facebook.com");
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("tripathi.swadha12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xyz");
	   
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	   
	}


}
