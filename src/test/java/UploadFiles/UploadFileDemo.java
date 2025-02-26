package UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileDemo {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();	
		
		
		//Single file upload
		
		/*
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\API\\emp.json");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("emp.json"))
		{
			System.out.println("file is successfully uploaded");
		}
		else
		{
			System.out.println("Upload failed");
		}
		*/
		
	//Multiple files uploaded
		
		String file1="D:\\API\\Books.json";
		String file2="D:\\API\\emp.json";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noofFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		
		//validation 1- number of files
		
		/*
		if(noofFilesUploaded==2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded or incorrect files uploaded");
	    }
		*/
		
	//Validate 	file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Books.json")
		  &&  driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("emp.json"))
		
		{
			System.out.println("File names matching...");
		}
		else
		  {
			System.out.println("File names is not matching...");
		  }
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
