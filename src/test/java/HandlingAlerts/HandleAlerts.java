package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//1) Normal alert with OK button
		/*
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();
		
		//or if multiple operation perform then store that alert window in variable
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		//2) Confirmation alert-Ok & Cancel
		/*
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); //close alert using OK button
		
		driver.switchTo().alert().dismiss(); //close alert using Cancel button
		*/
		
		
		//3) Prompt alert - Input box
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		
		Alert myalert=driver.switchTo().alert();
		
		myalert.sendKeys("Welcome");
		myalert.accept();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
