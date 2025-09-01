package seleniumproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows extends Base{
	
	public void handleMultipleWindows()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		
		String firstHandleid = driver.getWindowHandle(); // to get the current window Hanlde ID which is a unique value
		WebElement handle1 = driver.findElement(By.xpath("//a[text()='Click Here']"));
		handle1.click();//to click on specified webelement stored in handle1
		
		Set<String> handleids = driver.getWindowHandles();
		System.out.println(handleids);// print the two window handle id's
		
		Iterator<String>values=handleids.iterator();
		
		while(values.hasNext())
		{
			String current_id=values.next();
			if(!current_id.equals(firstHandleid)) // if the handleid is not first handle id then only the if code will execute
			{
				driver.switchTo().window(current_id); // here the control will chnage to second tab
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fld.sendKeys("abc@gmail.com");
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();// control goes to first tab
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		HandlingMultipleWindows windows = new HandlingMultipleWindows();
		windows.browserinitializer();
		windows.handleMultipleWindows();
		
		

	}

}
