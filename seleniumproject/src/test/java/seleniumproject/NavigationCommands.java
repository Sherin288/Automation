package seleniumproject;

public class NavigationCommands extends Base{
	
	public  void navigatecommand()
	{
		driver.navigate().to("https://www.amazon.in/"); // navigate from obsucre to amazon link 
		driver.navigate().back(); // navigate back from amazon to obscure link
		driver.navigate().forward();//Moves forward to the next page here back to amazon
		driver.navigate().refresh();//Refreshes the current page
	}

	public static void main(String[] args) {
		

		NavigationCommands nav = new NavigationCommands();
		nav.browserinitializer();
		nav.navigatecommand();
	}

}
