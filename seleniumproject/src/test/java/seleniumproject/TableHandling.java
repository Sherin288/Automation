package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		
		WebElement table1 = driver.findElement(By.xpath("//table[@id='dataTable']"));// tolocate table
		System.out.println(table1.getText()); // to print entire table text
		
		WebElement row = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));// to locate row value
		System.out.println("\n"+ row.getText());// to print 
		
		WebElement column = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]/td[2]"));
		System.out.println("\n" + column.getText());
		
	}

	public static void main(String[] args) {
	
		TableHandling table = new TableHandling();
		table.browserinitializer();
		table.verifyTable();

	}

}
