package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://demo.nopcommerce.com/");
		
		//Find total number of links using tagname
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+Links.size());

		
		//Total number of images
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:" + images.size());
				
		
		// Click on Any Product link using linkText/PartialLink Text
		driver.findElement(By.linkText("Books")).click();	
		//driver.findElement(By.partialLinkText("Book")).click();
		
}
}