package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
	

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.opencart.com/");
		
		//driver.manage().window().maximize();
		
		//selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://orangehrm.com");
		
		
		
		
		
		
		
		

	}

}
