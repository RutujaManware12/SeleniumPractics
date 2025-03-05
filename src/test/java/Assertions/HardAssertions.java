package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

//Q) What is the hard assertions and cold assertions and when to use
//   to use hard assertions and when to use soft assertions?




public class HardAssertions {

	
	@Test
     void test()
     {
    	 //Assert.assertEquals("xyz","xyz"); //pass
    	 //Assert.assertEquals(123,345);
    	 
    	 //Assert.assertEquals("abc",123);
    	 //Assert.assertEquals("123",123);
		
    	 //Assert.assertEquals(123,123); //failed
		//Assert.assertEquals(123,423); //passed
		
		Assert.assertTrue(true); //pass
		Assert.assertTrue(false); //failed
		
		Assert.assertTrue(1==2); //fail
		Assert.assertTrue(1==1); //pass
		
		Assert.assertFalse(1==2); //pass
		Assert.assertFalse(1==1); //failed
		
		
		
     }
	
	
	
	
}
