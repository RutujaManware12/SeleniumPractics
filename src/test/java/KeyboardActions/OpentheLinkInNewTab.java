package KeyboardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
	    WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		
	    Actions act=new Actions(driver);
	    
	    
	    //Control+RegLink
	    act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
	    
		//Switching to registration page
	    List<String> ids=new ArrayList(driver.getWindowHandles());
	    		
	    	
	    //Registration
	    driver.switchTo().window(ids.get(1)); //switch to registration page
	    driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rutuja");
	    Thread.sleep(2000);
	    
	    
	   //Home page
	    driver.switchTo().window(ids.get(0)); //switch to home page
	    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
	    Thread.sleep(2000);		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
