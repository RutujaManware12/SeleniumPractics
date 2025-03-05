package TestAnnotation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@Test
	void abc()
	{
		System.out.println("This is abc from c1...");
	}
	
	@BeforeTest
	void before()
	{
		System.out.println("This is is beforeTest method");
	}
	
	
	
}
