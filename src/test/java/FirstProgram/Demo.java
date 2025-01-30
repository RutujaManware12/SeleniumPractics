package FirstProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
Test Case
1) Launch browse(chrome)
2) Open URL https://demo.opencart.com/
3) Validate title should be "Your Store"
4) Close browser
 */

public class Demo {
	
	public static void main(String[] args) {
	
     // 1) Launch browse(chrome)
				
				//ChromeDriver driver=new ChromeDriver(); //not prefered
				
				WebDriver driver=new ChromeDriver(); 
				           //or
				//WebDriver driver=new EdgeDriver(); 
		
				
	 //2) Open URL https://demo.opencart.com/
				
				//driver.get( "https://demo.opencart.com/");
				           //or new assignment
				driver.get("https://demo.nopcommerce.com/");
				
				
	//3) Validate title should be "Your Store"
				
				/*String act_title=driver.getTitle();
				
				if(act_title.equals("Your Store"))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");
				}
				*/
				
				//or assignment
				
				String act_title=driver.getTitle();
					
					if(act_title.equals("nopCommerce demo store"))
					{
						System.out.println("Test Passed");
					}
					else
					{
						System.out.println("Test Failed");
					}
				
		
	// 4) Close browser
					
					driver.close();
					//driver.quit();
	}
}
