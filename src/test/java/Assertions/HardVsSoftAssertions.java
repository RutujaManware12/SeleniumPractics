package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


/*
 * 1)hard assertion - hard assertion methods we can directly access
 * from assert class.
 
 
 * 2) soft assertion - soft assertion methods we can access
 *    from the object of soft assert class. 
 */


public class HardVsSoftAssertions {

	
	
	//@Test
	void test_hardassertions()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		
		Assert.assertEquals(1, 2);  //hard assertion
		
		System.out.println("testing...");
		System.out.println("testing...");
	}

	
	@Test
	void test_softassertions()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		
		 SoftAssert sa=new SoftAssert(); //soft assertion
		 sa.assertEquals(1, 2);
		
		System.out.println("testing...");
		System.out.println("testing...");
		
		sa.assertAll(); //mandatory
	}

	
	
	
}
