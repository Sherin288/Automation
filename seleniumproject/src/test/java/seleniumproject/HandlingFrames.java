package seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void handleFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));// to hold multiple elements list is used
		System.out.println(totalframe);//to get the iframe details in the webpage
		System.out.println(totalframe.size());// to print the total number of values in list
		
		driver.switchTo().frame(1);//frame(1) means  if the 
		//driver.switchTo().frame("frame1");//just for eg cuurently this will not give Output
		driver.switchTo().parentFrame(); // to chnage the focus to immediate iframe above the tag
		
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe1);
		
		WebElement iframe2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(iframe2.getText());
		
		driver.switchTo().defaultContent();//to redirect or release the driver focus to prviously focused point
		
	}
	
	//Switch To : to chnage the focus of mouse pointer from one frame in the same page to another frame in the same webpage
	
	

	public static void main(String[] args) {
		
		HandlingFrames frames = new HandlingFrames();
		frames.browserinitializer();
		frames.handleFrames();

	}

}
