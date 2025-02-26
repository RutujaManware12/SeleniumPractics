package Data_Driven_Testing;

import java.io.FileOutputStream;
import java.io.IOException;


/*
 * 1) how to read data from excel can you write few statement?

 */

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrintingDatainSpecifRowAndCell {

	public static void main(String[] args) throws IOException {
		
		
		//Create new file in test data
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_Random.xlsx");

		//Create workbook
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		
		//Create sheet
		
	   XSSFSheet sheet=workbook.createSheet("Data");	
		
	   
	   XSSFRow row=sheet.createRow(3);
	   XSSFCell cell=row.createCell(4);
		
	   cell.setCellValue("Welcome");
	   
	   
	   //Attached workbook into the file
				   
		workbook.write(file);
		workbook.close();
	    file.close();
				
				
	    System.out.println("File is created...");
	}

}
