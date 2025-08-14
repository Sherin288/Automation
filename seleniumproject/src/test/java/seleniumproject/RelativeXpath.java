package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RelativeXpath extends Base {
	
	public void xpath()
	{
		
		WebElement xpath1 =  driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement xpath2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
