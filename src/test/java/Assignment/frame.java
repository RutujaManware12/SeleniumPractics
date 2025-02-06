package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
		 
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//1) switch to 5th frame
		 WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		 driver.switchTo().frame(frame5);
		 
		//2)click on link- open new iframe
		
		 driver.findElement(By.linkText("https://a9t9.com")).click();
	
		//3) switch to inner frame

			driver.switchTo().frame(0); 
			
		//4) check logo presenece in the inner frame
			
		boolean	logoDisplayStatus=driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']")).isDisplayed();
		System.out.println(logoDisplayStatus);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
