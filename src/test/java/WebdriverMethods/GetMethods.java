package WebdriverMethods;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver=new ChromeDriver();
		
     
     //get(url) - opens the url on the browser
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
     Thread.sleep(5000);
	 
     //getTitle() - return title of the page
	 System.out.println(driver.getTitle());
	 
	 //getCurrentUrl() - return URL of the page
	 System.out.println(driver.getCurrentUrl());
     
	 
	 //getPageSource() - return source code of the page
	 //System.out.println(driver.getPageSource());
	 
	 
	 //getWindowHandle() -returns ID of the single Browser window
	// String windowid=driver.getWindowHandle();
	// System.out.println("Window ID:"+windowid);//AC9D426E739AC4DA7B6124F7F7E9F01F
	 
	 
	 //getWindowHandles()- retuns ID's of the multiple broser windows
	 
	 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	 Set<String> windowids=driver.getWindowHandles();
	 System.out.println(windowids);
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
