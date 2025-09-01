package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	
	public WebDriver driver;   //driver is the object of the interface "WebDriver"
	
	@BeforeMethod  // to invoke before each test case is executed
	public void browserinitializer()
	{  
		
		driver = new ChromeDriver(); //chrome and edge is class , and assign it to the driver variable
		
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();
		
		
		driver.get("https://www.saucedemo.com/v1/");// code to  open the given link
		//driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();// to get maximize the screen
	}
	
	@AfterMethod //after executing each test case the browser is closed
	
	public void quitandclose() { // for automatically close and quit the browser, quitandclose is inbuilt method
		
		driver.close();// to close chrome browser 
	}
	

}
