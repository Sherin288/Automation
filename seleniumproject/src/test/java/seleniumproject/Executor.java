package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Executor extends Base{
	
	public void verifyJavascriptExecutor() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,100)", "");// to scroll from zero to 200 pixel
//js.executeScript("window.scrollBy(0,0)", "");		
		//js.executeScript("window.scrollBy(100,200)", "");//relative scrolling
		//js.executeScript("window.scrollTo(0,0)", "");
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");// to pass the control  to the  end of the webapplication
		js.executeScript("window.scrollTo(200,300)", "");//absolute scrolling 
		System.out.println(js.executeScript("return window.pageYOffset"));//current cursor position
			}

	public static void main(String[] args) {
		
		Executor executor = new Executor();
		executor.browserinitializer();
		executor.verifyJavascriptExecutor();

	}

}
