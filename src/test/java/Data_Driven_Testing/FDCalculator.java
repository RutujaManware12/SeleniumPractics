package Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
    
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		driver.manage().window().maximize();

		//Capture location of the Excel file
		String filePath=System.getProperty("user.dir")+"\\testdata\\FD_Data.xlsx";
		
		//Row count
		int rows=ExcelUtils.getRowCount(filePath, "Sheet1");
		
		
		for(int i=1;i<rows;i++)
		{
		    //1) Read data from excel
			String priciple=ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateofinterest=ExcelUtils.getCellData(filePath, "Sheet1",i, 1);
			String period1=ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String period2=ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String frequency=ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_mvalue=ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
		
		   //2) pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(priciple);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			Select periodDrop=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			periodDrop.selectByVisibleText(period2);
			
			Select freq=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freq.selectByVisibleText(frequency);
			
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//3) Validation
			
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test passed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Passed");
				ExcelUtils.fillGreenColor(filePath,"Sheet1",i,7);
			}
			else 
			{
				
				System.out.println("Test failed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Failed");
				ExcelUtils.fillRedColor(filePath,"Sheet1",i,7);
				
			}
			
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
      	}//ending of for loop

		
    }
}
