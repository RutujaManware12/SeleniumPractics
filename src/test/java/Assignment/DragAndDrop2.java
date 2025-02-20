package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);

		
	//DEBIT SIDE 1
		
		// Account
		
		WebElement bank =driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		
		WebElement Account=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		act.dragAndDrop(bank, Account).perform();
		
		//Amount
		
		WebElement value=driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement number=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		act.dragAndDrop(value, number).perform();
		
		
  // CREDIT SIDE 2		
		
		// Account
		
		WebElement sales=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement value1=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		act.dragAndDrop(sales, value1).perform();
		
		//Amount
		
		WebElement demo1=driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		
		WebElement demo2=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		
		act.dragAndDrop(demo1, demo2).perform();
		
		
		
		
		
		
	}

}
