package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public WebDriver driver;
	
	
	public void browserInitialiser()
	{
		driver = new ChromeDriver(); 
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize(); // to maximise the window
		
		
	}
	
	public void browserCommand()
	{
		String title = driver.getTitle(); //to get the title of webpage
		System.out.println(title);// to print the page title of webpage
		
		String url = driver.getCurrentUrl(); // to get the url of current webpage
		System.out.println(url); // to print url of current webpage.
		
		String page_source = driver.getPageSource();//to get the page source
		System.out.println(page_source);// to print page source
		
		String handleid = driver.getWindowHandle();
		System.out.println(handleid);//returns a uniques string value which is the ID value of current window
	}

	public static void main(String[] args) {
		
		BrowserCommands browser = new BrowserCommands(); //object of class browserInitialiser class is created
		browser.browserInitialiser(); // call the methods using class objects.
		browser.browserCommand();

	}

}
