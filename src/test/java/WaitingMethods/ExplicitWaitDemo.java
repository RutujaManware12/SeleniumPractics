package WaitingMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //declaration
		
		 driver.get("https://demo.nopcommerce.com");
		 driver.manage().window().maximize();
		 
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='small-searchterms']")));
		 txtusername.sendKeys("Admin");
		 
		// driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Admin");
		 
        driver.close();

	}

}
