package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoadowDomElement {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
			
		 driver.get("https://dev.automationtesting.in/shadow-dom");
		 
		 driver.manage().window().maximize();
		
		//This Element is inside single shadow DOM.
		
		 SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		 Thread.sleep(1000);
		 shadow.findElement(By.cssSelector("#shadow-element")).getText();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
