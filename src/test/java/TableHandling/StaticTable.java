package TableHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
	//1) find total number of row in table
		
		//Approach 1
	    int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //multiple table
	    
	    //Approach 2
	  //int rows=driver.findElements(By.tagName("tr")).size(); //Single table
	    
		System.out.println("Number of rows:"+rows);//7
		
	//2) find total number of columns in a table
		
	    int cols=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("Number of columns is:"+cols); //4
		
		
	//3) Read data from specific row and column (ex:5th row and 1st column)
		
		//String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(BookName); //Master In Selenium
		
		
	//4) Read data from all the rows and columns
		
		//capture header name
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			    System.out.println();
			    
		}
		*/
		
		
   //5) Read all authorNames
		
		/*
		for(int r=2;r<=rows;r++)
		{
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			System.out.println(authorName);
			
		}
		
		*/
		
  //6) Print book names whose author is Mukesh
		
		for(int r=2;r<=rows;r++)
		{
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(authorName.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName+"\t"+authorName);
			}
			
		}	
		
  //7) find Total price of all the books
		
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			
			total=total+Integer.parseInt(price);
			
		}	
		
		System.out.println("Total Price of the books:"+total); //7100
		
		
		
		
		
		
		
	}

}
