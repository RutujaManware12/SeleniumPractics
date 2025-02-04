package Assignment;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();

		
		
		
	//1) provide some string search for it
		
		driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@class='wikipedia-search-button']")).click();
		
		driver.findElement(By.linkText("Selenium")).click();
		
   //2) Count number of links
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+Links.size());
		
		
   //3) Click on each link using for loop
		
		
		for(WebElement link:Links)
		{
		
			System.out.println(link.getAccessibleName());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
