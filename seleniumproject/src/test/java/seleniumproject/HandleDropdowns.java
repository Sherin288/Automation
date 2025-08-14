package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdowns extends Base {
	
	public void verifyDropdowns()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");//navigate to respective url
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));//select the first dropdown element
		
		//Webelement commands cannot be used directly as the options to be selected would be within the opening and closing select tag.
		
		Select select = new Select(drop);//Select is predefined class , drop value is passed to select the element of object  
		//select.selectByIndex(1); // default index value is zero
		
		//select.selectByValue("python");//selectbyvalue is an inbuilt function to select by value in a dropdown
		
		select.selectByVisibleText("SQL");//selectbyvisible text to select dropdown based on the visible text displayed on each dropdown option
		
		
		}
	
	public void verifyCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");//navigate to respective url
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-1']")); // locate the first checkbox value
		
		//incase of check box we can directly use web element commands like click  .
		checkbox.click(); // to select first dropdown value
		
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='option-3']")); // locate the third checkbox value
		
		if (checkbox3.isSelected())//to check the any element is selected or not for radio button & checkbox
		{
			checkbox3.click();
		}
		
		System.out.println(checkbox3.isDisplayed());//to verify if an element is displayed eg if a button is present or not
		System.out.println(checkbox3.isEnabled());//to verify if the an element is displayed but the it disabled . eg if a button is disabled by default
		
		
		}
	
	public void verifyRadiobutton()
	{
		
        driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");//navigate to respective url
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='blue']"));
		radiobutton.click();
		
		System.out.println(radiobutton.isSelected());
		
		System.out.println(radiobutton.isDisplayed());//to verify if an element is displayed eg if a button is present or not
		System.out.println(radiobutton.isEnabled());//to verify if the an element is displayed but the it disabled . eg if a button is disabled by default
		
		//to count iframes in webpage  (eg youtube ads) , a list of elements needs to be used. findelements is used to retrive this list of elements.
		//an empty list is retrieved in findElement if no elements matching the condition is present. This will not stop the execution and an empty list will be passed
		
	}
	

	public static void main(String[] args) {
		
		HandleDropdowns dropdown = new HandleDropdowns();
		
		dropdown.browserinitializer();
		//dropdown.verifyDropdowns();
		
		//dropdown.verifyCheckbox();
		dropdown.verifyRadiobutton();

	}

}
