package TableHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagenationTable {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		//close window if it is available
		/*if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		*/
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click(); //customer main menu
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();  //customer sub menu
		
		
		                                               //div[contains(text(),'Pages')])
	//Showing 1 to 10 of 17804 (1781 Pages)           //div[@class='col-sm-6 text-end']
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		
		//repeating pages
		
		for(int p=1;p<=5;p++)
		{
			
			if(p>1)                
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(4000);
			}
			
			//Reading data from the page
			
			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td")).size();
			
			for(int r=1;r<=noOfRows;r++)
			{
			
			String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[2]")).getText();
			
			String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[3]")).getText();
			
			String Customergroup=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[4]")).getText();
			
			System.out.println(customername+"\t"+email+"\t"+Customergroup);
		
		   }
			
		}
			

	}

}
