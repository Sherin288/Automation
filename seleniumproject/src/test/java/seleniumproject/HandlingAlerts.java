package seleniumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void verifySimpleAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealertbutton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealertbutton.click();
		Alert simplealert = driver.switchTo().alert();
		System.out.println(simplealert.getText());
		simplealert.accept();//to click ok button
		
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlertButton.click();
		Alert confirmAlert = driver.switchTo().alert();
	//	confirmAlert.accept();//to click ok button
		confirmAlert.dismiss();//to click on cancel button
		
	}
	
	public void verifyPromptalert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlertButton.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Testing");
		promptAlert.accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingAlerts alerts = new HandlingAlerts();
		alerts.browserinitializer();
		//alerts.verifySimpleAlerts();
		//alerts.verifyConfirmAlert();
		
		alerts.verifyPromptalert();

	}

}
