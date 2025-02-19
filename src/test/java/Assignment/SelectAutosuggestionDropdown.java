package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAutosuggestionDropdown {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("http://www.bjs.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='StyledCategorySearchSuggestionstyle__StyledCategorySearchSuggestion-sc-10i2nc1-0 cVSmGZ']"));
		

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("bottled water"))
			{
				list.get(i).click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
