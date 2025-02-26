package Data_Driven_Testing;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		//Create new file in test data
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");

		//Create workbook
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		
		//Create sheet
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		//Create row 
		
		XSSFRow row1=sheet.createRow(0);
		   row1.createCell(0).setCellValue("Java");
		   row1.createCell(1).setCellValue("19");
		   row1.createCell(2).setCellValue("Automation");
			
		
	    XSSFRow row2=sheet.createRow(1);
		   row2.createCell(0).setCellValue("Python");
		   row2.createCell(1).setCellValue("3");
		   row2.createCell(2).setCellValue("Automation");
			   
		
		XSSFRow row3=sheet.createRow(2);
		   row3.createCell(0).setCellValue("C#");
		   row3.createCell(1).setCellValue("5");
		   row3.createCell(2).setCellValue("Automation");
			
		
		
		//Attached workbook into the file
		   
		   workbook.write(file);
		   workbook.close();
		   file.close();
		
		
		   System.out.println("File is created...");

	}

}
