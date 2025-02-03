package XPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 //why relative xpath is not prefered?    
//because developer keep doing some changes on the web page they can add a new elements or they can remove
//existing element they can do a reposition element because of these changes the hierarchy will keep impacted and our xpath will be broken then we cannot locate our element.


//(or which xpath will be prefered?-Relative xpath)

// Difference bet Absolute and Relative xpath?



public class TypesofXpath {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	
// Relative Xpaths-
	
//Xpath with single attribute
	//driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Tshirt");
	//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Tshirt");
	
//Xpath with multiple attribute
	//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirt");
	

//Xpath with 'and'  'or' operator
	
	//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirt");
		
	//driver.findElement(By.xpath("//input[@name='search' or @placeholder='abc']")).sendKeys("Tshirt");

	
	
// Xpath with text() - inner text
	
	//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		
    boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
    System.out.println(displaystatus);
		
    String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
    System.out.println(value);	
		
		

	}

}
