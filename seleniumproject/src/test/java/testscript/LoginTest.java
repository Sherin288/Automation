package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase {
	
	@Test //Test case1
	public void verifyWhetherUserisLoggedInWithValidCredentials() throws IOException
	{
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");//Data driven approach is preferred
		
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");// here login page is the excel sheet name
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(usernameValue);// here the value from excel is passed to the field available
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
	}
	
	@Test
	public void verifyWhetherUserisLoggedInWithInvalidCredentials() throws IOException
	{
        String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");//Data driven approach is preferred
		
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(usernameValue);// here the value from excel is passed to the field available
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		
	}
	
	

}
