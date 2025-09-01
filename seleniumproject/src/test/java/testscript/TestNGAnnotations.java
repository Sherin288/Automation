package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeMethod // before executing each test case 
	public void beforeMethod() // eg :browser initialization
	{
		System.out.println("Before Method");
	}

	@BeforeTest  // initialization to execute a set of code within  test tag
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass // intialization before entire class
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@BeforeSuite // combination of test classes eg : login and home page
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@Test
	public void testCase()
	{
		System.out.println("Perform test case");
	}
	
	//After Method/Test/Class/Suite is to destroy everything initialized in Before Method/Test/Class/Suite to save the space in web driver
	
	@AfterMethod   // destroys or nullifies the methids initialized using beforemethod
	public void afterMethod()   
	{
		System.out.println("After Method");
	}
	
	@AfterTest   // destroys or nullifies the methids initialized using before test
	public void afterTest()   
	{
		System.out.println("After Method");
	}
	
	@AfterClass  // destroys or nullifies the methids initialized using before test
	public void afterClass()   
	{
		System.out.println("After Method");
	}
	
	@AfterSuite   // destroys or nullifies the methids initialized using before test
	public void afterSuite()   
	{
		System.out.println("After Method");
	}
	
	
	
	
	
}
