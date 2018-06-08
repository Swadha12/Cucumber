package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver;
      System.setProperty("webdriver.chrome.driver","C:\\Users\\stripathi\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver = new ChromeDriver();
	 // driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("tripathi.swadha12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xyz");
		driver.findElement(By.id("loginbutton")).click();
		
    }
}
