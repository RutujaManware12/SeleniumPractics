package CaptureScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//1) full page screenshot
		
		/*
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		//Two way capture screenshot folder
		//A) File targetfile=new File("C:\\Users\\91937\\Automation_Workspace\\Selenium1\\ScreenShots\\fullpage.png");
		//B)
		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\fullpage.png");
		Thread.sleep(40000);
		sourcefile.renameTo(targetfile); //copy sourcefile to target file
		Thread.sleep(40000);
		*/
		
		
	//2) Capture the screenshot of specific section
		
		/*
		WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\featureproducts.png");
		Thread.sleep(4000);
		sourcefile.renameTo(targetfile); //copy sourcefile to target file
		Thread.sleep(1000);
		driver.quit();
		*/
		
		
   //3) capture the screenshot of webelement
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\logo.png");
		Thread.sleep(4000);
		sourcefile.renameTo(targetfile); //copy sourcefile to target file
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
