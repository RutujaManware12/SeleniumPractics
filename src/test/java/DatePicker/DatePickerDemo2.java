package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
        	
		String year="2021";
		String month="June";
		String date="15";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();	
		
		//select year
		
		WebElement yearDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear=new Select(yearDropDown);
		selectYear.selectByVisibleText(year);
		
		//click month dropdown
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		
	    // select single month option
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[@value='4']")).click();
		
		
		//date selection
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
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
