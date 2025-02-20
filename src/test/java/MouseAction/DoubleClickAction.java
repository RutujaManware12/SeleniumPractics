package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		

		
		
	WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
	WebElement box2=driver.findElement(By.xpath("	//input[@id='field2']"));
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
	box1.clear();  //clear box1
	box1.sendKeys("Rutuja");
	
	//Double click action on the button
	
	Actions act=new Actions(driver);
	
	act.doubleClick(button).perform();
		
	//validation : box2 should contain "Rutuja"
	
	String text=box2.getAttribute("value");
	System.out.println("captured value is:"+ text);
	
	if(text.equals("Rutuja"))
	{
		System.out.println("Test copied");
	}
	else
	{
		System.out.println("Test Not copied Properly..");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
