package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCountryDropDown {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		
	//1) Handle country dropdown with/without using select class:	
		//a)Count total number of options
        //b) Print all the options
		//c) Select one option
		
		
		//1)with select class:
		//a)Count total number of options
	   List<WebElement> options1=driver.findElements(By.xpath("//select[@id='country-list']//option"));
		
		System.out.println("Number of options:"+ options1.size());
		
		//b) Print all the options
		for(WebElement op:options1)
		{
			System.out.println(op.getText());
		}
		
		//c) Select one option
		driver.findElement(By.xpath("//select[@id='country-list']//option[@value='2']")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
