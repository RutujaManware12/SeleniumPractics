package DependencyMethods;

import org.testng.annotations.Test;

public class PaymentsTests {

	@Test(priority=1,groups= {"sanity,regression"})
	void paymentinRupees()
	{
		System.out.println("payment in ruppes...");
	}
	
	@Test(priority=2,groups= {"sanity,regression"})
	void paymentinDollars()
	{
		System.out.println("payment in dollars...");
	}
}
