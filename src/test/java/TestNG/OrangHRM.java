package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 1) open application 
 2) test logo presence 
 3) login
 4) close
 
 */

public class OrangHRM {
 
	WebDriver driver; 
	
	 //1) open application 
	@Test(priority=1)
	void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
	}
	
	//2) test logo presence 
	@Test(priority=2)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo displayed..."+status);
	}
	
	
	 //3) login app
	@Test(priority=3)
	void testLogin()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	
	
	//4) close app
	@Test(priority=4)
	void closeApp()
	{
		driver.quit();
	}
	
}
