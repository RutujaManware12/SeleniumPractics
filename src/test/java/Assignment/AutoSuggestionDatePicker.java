package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDatePicker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dummy-tickets.com/buyticket");
		
		driver.manage().window().maximize();
		
		
		
	//  "form" (Aurangabad)
		
		driver.findElement(By.xpath("(//input[@name='source[]'])[1]")).sendKeys("Aurangabad");
		
		//all autosugesstion dropdown list "from"
	    List<WebElement> list=driver.findElements(By.xpath("//div[@id='onewaymain']//div[@class='route_1 row p-0 pt-3']//div[1]//ul[1]"));
		
	    for(int i=0;i<list.size();i++)
	   {
		   System.out.println(list.get(i).getText());
		   if(list.get(i).getText().equals("Aurangabad"));
		   {
			   list.get(i).click();
			   break;
		   }
	   }
	
  //  "To" (pune)
	    
	    driver.findElement(By.xpath("(//input[@name='destination[]'])[1]")).sendKeys("Pune");
	    
	    //all autosugesstion dropdown list "To"
	    
	    List<WebElement> list2=driver.findElements(By.xpath("(//ul[@class='suggestions-list'])[2]//li/div"));
	    
	    for(int i=0;i<list2.size();i++)
	    {
	    	if(list2.get(i).getText().equals("Pune"));
	    	{
	    		list2.get(i).click();
	    		break;
	    	}
	    }
	    	
	   
	    
	 //Departure
	    
	    
	    String year="2021";
		String month="June";
		String date="15";
		
			
	    driver.findElement(By.xpath("")).click();
	    
	    
	    
	   
	   
		
		
		
		
		
		
		
		
		
		

	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
