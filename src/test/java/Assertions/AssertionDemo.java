package Assertions;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Test;


public class AssertionDemo {

	
	@Test
	 void testTitle()
	 {
		 String exp_title="Opencart";
		 String act_title="Opencart";
		 
		//1) 
		 
		 //Assert.assertEquals(exp_title, act_title);
		 
		 //or
		 
		//2)
		 
		/* if(exp_title.equals(act_title))
		 {
			 System.out.println("test passed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 System.out.println("test passed");
			 Assert.assertTrue(false);
		 } 
		 */	 
	 }

}
