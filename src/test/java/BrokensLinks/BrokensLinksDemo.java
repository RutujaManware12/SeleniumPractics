package BrokensLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokensLinksDemo {
	
	/*Broken link - Broken link is a link which doesn't have any resource in the server
	if it is doesn't have any resource in the server that it will return status code that
	should be greater then or equal to 400 .
	*/
	
	public static void main(String[] args) throws IOException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		
		//Capture all the links from website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		int noOfBrokenLinks=0;
		
		for(WebElement linkElement:links)
		{
			String hrefattValue=linkElement.getAttribute("href");
			
			if(hrefattValue==null || hrefattValue.isEmpty())
			{
				System.out.println("href attribute value is null or empty. so Not possible to  check");
				continue;
			}
			
			//hit url to the server
			try
			{
			URL linkURL=new URL(hrefattValue); //Converted href value from string to URL format
			
			HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); //open connection to the sever
			
			conn.connect(); //connect to server and send requrest to the server
			
			if(conn.getResponseCode()>400)
			{
				System.out.println(hrefattValue+" ======> Broken link");
				noOfBrokenLinks++;
			}
			else
			{
				System.out.println(hrefattValue+" ======> Not a broken link");
			}
			
		}
		catch(Exception e)
		{
		}
		
	}
		
		System.out.println("Number of broken links:"+noOfBrokenLinks); //41
  }

}
