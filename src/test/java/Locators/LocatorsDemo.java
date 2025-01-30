package Locators;

import java.util.List;

//What is the linkText and partial linktext which are you preferd?
//Link text we have to provide the complete link text and when I use partial link text we can pass some(Some portion of the value) partial text of the link .


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get( "https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//name attribute
		
				//driver.findElement(By.name("search")).sendKeys("Mac");
				
				
				//id attribute
				//boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
				//System.out.println(logoDisplaystatus);
				
				
				//linktext & partiallinkText
				
				//driver.findElement(By.linkText("Tablets")).click();	
				
				//driver.findElement(By.partialLinkText("Table")).click();
		

		//Class Name
		
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("Total number of header links:"+headerLinks.size());
		
		
		//Tag Name
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("total number of links:"+links.size());
		
		//List<WebElement> images=driver.findElements(By.tagName("img"));
		//System.out.println("Total number of images:" + images.size());
		
		
		
	}	

}
