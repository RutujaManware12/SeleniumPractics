package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//option[@value='Philadelphia']")).click();
		
		driver.findElement(By.xpath("//option[@value='Berlin']")).click();
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		
		//1) find total number of row in table
			
			//Approach 1
		    int rows=driver.findElements(By.xpath("//table[@class='table']//tr")).size(); //multiple table
		
		//2) Read all price
		
		for(int r=1;r<=rows;r++)
		{
			String prize=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			
			if(prize.equals("$200.98"))
			{
				String Choosefight=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[1]")).getText();
				System.out.println(Choosefight+"\t"+prize);
				
				
			}
			
		 
		}
		
		
	 driver.findElement(By.xpath("//table[@class='table']//tr[3]//td//input[@type='submit']")).click();
		
		
 
	      
	}

}
