package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutoSuggestionDropDown {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");  //Search box
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
	
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("selenium"))
			{
				list.get(i).click();
				break;
			}
		}
		
	
		
		
		
		
		

	}

}
