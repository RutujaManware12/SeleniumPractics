package Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\Book1.xlsx";
		
		//Row count
		int rows=ExcelUtils.getRowCount(filePath, "Sheet1");
		for(int i=1;i<rows;i++)
		{
			  //1) Read data from excel
			String username=ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String password=ExcelUtils.getCellData(filePath, "Sheet1",i, 1);
		
			
			 //2) pass above data into application
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys( password);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			//3) Validation
			
			if(username==password)
			{
				System.out.println("Test passed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,2,"Passed");
				ExcelUtils.fillGreenColor(filePath,"Sheet1",i,2);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,2,"Failed");
				ExcelUtils.fillRedColor(filePath,"Sheet1",i,2);
			}
			Thread.sleep(3000);
			
		}
		
		
		
		
		
		

	}

}
