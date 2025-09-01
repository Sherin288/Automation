package seleniumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions; 

public class HandlingActions extends Base{
	
	public void verifyRightclick()
	{
		WebElement rightclick = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action = new Actions(driver);//Actions is a built in class an object iss created for this action class
		action.contextClick(rightclick).build().perform();//right click is performed and executed
		
		
	}
	
	public void verifyMousehover()
	{
		WebElement mousehover = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).build().perform();//to mouse hover over the given webelement specified using xpath ,here mousehover is passed as element
	}
	
	public void verifydraganddrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifyKeyboardAction() throws AWTException//code for new keyboard actions like CTRL+C
	{
		Robot robot = new Robot();//Robot is an inbuilt java class in java AWT package like list class
		robot.keyPress(KeyEvent.VK_CONTROL);//key event is a class , VK_Control - virtual key for control key
		robot.keyPress(KeyEvent.VK_T);//VK_T for adding new tab in browser - ctrl+T
		robot.keyRelease(KeyEvent.VK_CONTROL);// to release control key
		robot.keyRelease(KeyEvent.VK_T);//to release  T key 
		
	}
	
	
	public static void main(String[] args) {
		
		HandlingActions actions = new HandlingActions();
		actions.browserinitializer();
		//actions.verifyRightclick();
		//actions.verifyMousehover();
		//actions.verifydraganddrop();
		
		try {   // try catch is a part of syntax when robot class which is part of java AWT package
			actions.verifyKeyboardAction(); 
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
