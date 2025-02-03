package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConditionalMethods {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/register");
	driver.manage().window().maximize();
		
	//isDiplaced()
	//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	//System.out.println("Display status of logo:"+logo.isDisplayed());
		
		//or
	//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	//System.out.println("Display status:"+ status);
		
	
	//isEnabled() - is use button radio button and inputboxes
	//boolean status=driver.findElement(By.xpath("//*[@id='FirstName']")).isEnabled();
	//System.out.println("Enable status:"+status);  //true
	
		
    //isSelected()
	//WebElement male_rd=driver.findElement(By.xpath("//*[@type='radio']"));
	//WebElement female_rd=driver.findElement(By.xpath("//*[@id='gender-female']"));	
		
	//System.out.println("Before selection .......");
	//System.out.println(male_rd.isSelected());     //false
	//System.out.println(female_rd.isSelected());   //false
	
	//System.out.println("After selection male");
	//male_rd.click(); //select male radio button
	
	//System.out.println(male_rd.isSelected());  //true    
	//System.out.println(female_rd.isSelected()); //false 

	boolean newsletterstatus=driver.findElement(By.xpath("//*[@type='checkbox']")).isSelected();
	System.out.println("News letter checkbox status:"+newsletterstatus);
	

	}

}
