package Data_Driven_Testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		//Create new file in test data
				FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_Dynamic.xlsx");

				//Create workbook
				
				XSSFWorkbook workbook=new XSSFWorkbook();
				
				
				//Create sheet
				
			   XSSFSheet sheet=workbook.createSheet("DynamicData");
				
		       Scanner sc=new Scanner(System.in);
		       
		       System.out.println("Enter how many rows?");
		       int noOfRows=sc.nextInt();
		
		       System.out.println("Enter how many cells?");
		       int noOfcells=sc.nextInt();
		       
		       
		      for(int r=0;r<=noOfRows;r++)
		      { 
		    	  XSSFRow currentRow=sheet.createRow(r);
		    	  
		    	  for(int c=0;c<noOfcells;c++)
		    	  {
		    		  XSSFCell cell=currentRow.createCell(c);
		    		  cell.setCellValue(sc.next());
		    	  }
		    	    
		      }
		      
		    //Attached workbook into the file
			   
			   workbook.write(file);
			   workbook.close();
			   file.close();
			
			
			   System.out.println("File is created...");
	
	}

}
