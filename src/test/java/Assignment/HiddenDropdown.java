package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {


		
		//Login to orangeHRM --> PIM --> employee status
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		driver.manage().window().maximize();
		
		//Login
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Clicking on PIM
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();  //PIM
		

		// clicked on dropdown
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]")).click();
		
        Thread.sleep(3000);
		
		//select single option
		
		driver.findElement(By.xpath("//span[normalize-space()='Full-Time Permanent']")).click();
		
		
		
		
	}

}
