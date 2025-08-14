package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;   //driver is the object of the interface "WebDriver"
	
	public void browserinitializer()
	{  
		
		
		driver = new ChromeDriver(); //chrome and edge is class , and assign it to the driver variable
		
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();
		
		
		driver.get("https://selenium.qabible.in/index.php");// code to  open the given link
		driver.manage().window().maximize();// to get maximize the screen
	}
	
	public void quitandclose() { // for automatically close and quit the browser, quitandclose is inbuilt method
		
		driver.close();// to close chrome browser
		driver.quit();// 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base = new Base();// object base is created for Base class
		base.browserinitializer();//method browserInitializer is called
		base.quitandclose(); //method quitAndClose is called

	}

}
