package WaitingMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWatiDemo {

	public static void main(String[] args) {

		 WebDriver driver=new ChromeDriver();
		 
		 /*
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
		 
		 
		 driver.get("https://demo.nopcommerce.com");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Admin");
		 
         driver.close();
		 */
		 
		 //or 
		 
		 //open url
		 driver.get("http://www.ebay.in/");
		
		 
		 
			 
		 
		 //wait of 10 seconds
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Stopwatch watch=null;
		 
		 try {
			 watch = Stopwatch.createStarted();
		 
		 //find webelement "start Selling"
		 driver.findElement(By.linkText("Start Selling")).click();
		 }catch(Exception e)
		 {
			 watch.stop();
			 System.out.println(e);
			 System.out.println(watch.elapsed(TimeUnit.SECONDS)+ "seconds");
		 }
		 
		 

	}

}
