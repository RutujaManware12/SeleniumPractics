package TestAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void xyz()
	{
		System.out.println("This is xyz from c2...");
	}
	
	
	@AfterTest
	void after()
	{
		System.out.println("This is aftertest method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
