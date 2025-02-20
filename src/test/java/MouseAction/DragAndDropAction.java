package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);
		
		//Drag and drop 1
		WebElement rome=driver.findElement(By.xpath("//div[@id='box7']")); //Source element
		WebElement italy=driver.findElement(By.xpath("//div[@id='box107']")); //target element
		
		act.dragAndDrop(rome, italy).perform();
		
		//Drag and drop 2
		
		WebElement Copenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement Sweden=driver.findElement(By.xpath("//div[@id='box102']"));
		
		act.dragAndDrop(Copenhagen, Sweden).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static Actions Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
