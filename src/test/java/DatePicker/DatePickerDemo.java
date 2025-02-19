package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method1: using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); //mm//yy//yyyy
		
		
		//Method 2 :using date picker
		//expected data
		String year="2025";
		String month="May";
		String date="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		//select month & year
		
		while(true)
		{
			
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month data
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	//next 
			Thread.sleep(3000);
		}
		
		
		//select the date
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
			
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
