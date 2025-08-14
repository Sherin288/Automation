package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLearn {
	
	public WebDriver driver;
	
	
	public void browserIntitaizer()
	{
		driver = new ChromeDriver();
		
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='Message']"));
		WebElement element2 = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement element3 = driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement element4= driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement element5 = driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		driver.close();
		
	}

	public static void main(String[] args) {
		
		BaseLearn commands = new BaseLearn();
		
		commands.browserIntitaizer();

	}

}
