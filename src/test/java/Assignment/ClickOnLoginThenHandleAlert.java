package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLoginThenHandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://mypage.rediff.com/login/dologin");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
	}

}
