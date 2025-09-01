package seleniumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void fileUploadUsingSendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadbutton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		uploadbutton.sendKeys("C:\\Users\\sheri\\git\\Automation\\seleniumproject\\src\\test\\resources\\Java Notes.pdf");// here path of file is given 
		//before doing this the file should be copied to src/main/resources
		WebElement clickchecbox = driver.findElement(By.xpath("//input[@id='terms']"));
		clickchecbox.click();
		WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitbutton.click();
		
	}
	
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection =  new StringSelection("C:\\Users\\sheri\\git\\Automation\\seleniumproject\\src\\test\\resources\\Java Notes.pdf");
		////string selection is a class used to retrieve the file from given path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//using set contents method the file in selection object is set to the clipboard
		Robot robot= new Robot();//robot class is used for keyboard actions
		//For handling the operating time and no error occur
		robot.delay(2500);//time to open the window is handled using delay method
        robot.keyPress (KeyEvent.VK_ENTER);
        robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);//to upload file using keyboard action
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);	
	
	}

	public static void main(String[] args) {
		
		FileUpload fileupload = new FileUpload();
		fileupload.browserinitializer();
		fileupload.fileUploadUsingSendkeys();
		try {
			fileupload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
