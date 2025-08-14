package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifycommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");// navigate to url
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));// locate message text box
		textBox.sendKeys("Hello World");// to Enter data to a web element
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));// locate show message button
		button.click();//to click on show message button
		WebElement textMessage = driver.findElement(By.xpath("//div[@id='message-one']"));//locate the text message printed on webpage
		System.out.println(textMessage.getText());//to print the message displayed in console
		System.out.println(textMessage.getTagName());//to print the tag name corresponding to the web element selected
		System.out.println(textMessage.getAttribute("id"));// we don't use this generally , to get value of attribute.
		System.out.println(textMessage.getCssValue("color"));// to get css value of web element 
		textBox.clear();// clears the message entered in message text box
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElementCommands commands = new WebElementCommands();
		commands.browserinitializer();
		commands.verifycommands();
		
		

	}

}
