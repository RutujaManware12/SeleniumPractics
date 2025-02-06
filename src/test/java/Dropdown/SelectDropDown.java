package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
	    WebElement dropCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropCountry=new Select(dropCountryEle);
		
	//Select option from the drop down
		
		//dropCountry.selectByVisibleText("Brazil");
		//dropCountry.selectByValue("japan");
		// dropCountry.selectByIndex(9);
		
		
	//Capture the options from the dropdown
		
		List<WebElement>options=dropCountry.getOptions();
		System.out.println("Number of options in a drop down:"+options.size()); //10
		
   //printing the options
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		*/
		
		
		//Enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
