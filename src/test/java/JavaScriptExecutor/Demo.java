
package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		/*Intercepted exception - When you call any method from the web driver internally execute the 
		JavaScript statements will actually talk to the browser or talk to the 
		Elements but sometimes what happens when you call this click method this click method is not able 
		to execute this JavaScript statement internally so this will throw an exception called element
		intercepted exeception.*/
		

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		
	// Perform same taks using javascript executor
	
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//passing the text into inputbox-alernate of sendkeys()
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Sagar')",inputbox);
		
		//clicking on element  - alternate of click()
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()",radioButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
