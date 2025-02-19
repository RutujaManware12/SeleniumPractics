package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorsMultiSelectBox {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
       //Capture all the options and find out size
		
		List<WebElement> options=driver.findElements(By.xpath("//select[@id='colors']//option"));
		System.out.println("Number of options:"+options.size());
		
	//Printing options from dropdown
		
		for(WebElement op:options)
		
		{
			System.out.println(op.getText());
		}
		
	//select multiple options	
		for(WebElement op:options)
		{
			String option=op.getText();
			if(option.equals("Red")||option.equals("Green")||option.equals("Yellow"))
				{
				  op.click();
				}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
