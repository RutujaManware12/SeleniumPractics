package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		
	   	
			String year="2023";
			String month="June";
			String date="18";
			
		//first name
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Rutuja");
		
		//last name
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Manware");
		
		//date of birth
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		//select year
		
		WebElement yearDropDown=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selectYear=new Select(yearDropDown);
		selectYear.selectByVisibleText(year);
		
		//click month dropdown
		driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
		
	   // select single month option
		driver.findElement(By.xpath("//option[normalize-space()='Jun']")).click();
		
		
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
		
		
		//Gender
				
		driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		
		
		//Add more passengers: (optional)
		
		//click checkbox
		driver.findElement(By.xpath("//input[@id='addmorepax']")).click();
		
		
		//dropdown list select single option
		driver.findElement(By.xpath("//li[@id='select2-addpaxno-result-o7vz-3']")).click();

	}

}
