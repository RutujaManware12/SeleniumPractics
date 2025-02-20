package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);
		
		WebElement demo1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement demo2=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(demo1, demo2).perform();
		
		
	 //verify text is "Dropped!"
		
		//first step
		WebElement text=driver.findElement(By.xpath("//p[normalize-space()='Dropped!']"));
		
		//To store the text of a webelement in a string
		String text1=text.getText();
		
		//For printng the text in console output
		System.out.println("Text obtained is"+  text1);
		
		//For verification use if else condtions
		if(text1.contains("Dropped!"))
		{
			System.out.println("Expected text is obtained");
		}
		else
		{
			System.out.println("Expected text is not obtained");
		}
		
		
		
		
		
		

	}

}
