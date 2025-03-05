package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AllAnnotations {

	@AfterSuite
	void as()
	{
		System.out.println("This is AfterSuite method");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite method");
	}
	
	@BeforeTest
	void before()
	{
		System.out.println("This is is beforeTest method");
	}
	
	@AfterTest
	void after()
	{
		System.out.println("This is aftertest method");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is Before class");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is after class");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is before method");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is after method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
