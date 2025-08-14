package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void locate()
	{
		//WebElement is an interface in Selenium that represents an HTML element on a web page.it is used to interact with elements after they are located
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement id = driver.findElement(By.id("single-input-field"));// here id is the variable of type webelement 
		WebElement element1 = driver.findElement(By.className("form-control"));//located using class name
		WebElement element2 = driver.findElement(By.name("viewport"));// webelement located using name
		WebElement element3 = driver.findElement(By.linkText("Ajax Form Submit"));// Webelement located using text of the link
		WebElement element4 = driver.findElement(By.partialLinkText("Ajax Form"));// If the link text is long we opt for partial link text
		WebElement element5 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));//this is absolute xpath
		
		//Commonly we don't use absolute xpath , we use relative xpath
		WebElement element6 = driver.findElement(By.xpath("//input[@id='single-input-field']"));// this is relative xpath by attribute
		WebElement element7 = driver.findElement(By.xpath("//button[text()='Show Message']"));//this is relative xpath by text method mostly used for buttons
		
		//Locators by css selectors combination
		
		WebElement element8 = driver.findElement(By.cssSelector("input#value-a"));//css selector by id and tag , tagname#valueofid
		WebElement element9 = driver.findElement(By.cssSelector("input.form-control"));//css selector by tag name and class , tagname.classname , here the value given is not unique used just for eg when ever using use only unique value
		WebElement element10 = driver.findElement(By.cssSelector("meta[name=viewport]"));// by tag and name , just given for example , tagname[name=namevalue] 		
	
	
	    WebElement element11 = driver.findElement(By.xpath("//button[@type='button' and @id = 'button-one']"));// and 
	    WebElement element12 = driver.findElement(By.xpath("//button[@type='button' or @id = 'button-one']"));// or
	    
	    ////xpath of the element that can be identified uniquely //parent::xpath of the element to identify
	    WebElement element13 = driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
	    WebElement element14 = driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));

	    //xpath access methods , following ,preceding, ancestor ,descendant
	    WebElement element15 = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//following
	    WebElement element16 = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));//preceding
	    WebElement element17 = driver.findElement(By.xpath("//div/ancestor::div[@class='card']"));//ancestor
	    WebElement element18 = driver.findElement(By.xpath("//div[@class='card']//descendant::div"));//descendant
	    
	
	}
	

	public static void main(String[] args) {
		
		Locators locate = new Locators();
		locate.browserinitializer();
		locate.locate();
		

	}

}
