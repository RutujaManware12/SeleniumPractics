package WaitingMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com");
		 driver.manage().window().maximize();
		 
	     Thread.sleep(5000);
          
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Admin");
	}

}
