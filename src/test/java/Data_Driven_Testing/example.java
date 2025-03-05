package Data_Driven_Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example {

	// Reading data program
	public static void main(String[] args) throws IOException {
		
	XSSFWorkbook ExcelBook =null;
	XSSFSheet ExcelSheet;
	XSSFRow Row;
	XSSFCell Cell;
	
	//Create an object of File class to open file
	File excelFile=new File("C:\\Users\\91937\\Automation_Workspace\\Selenium1\\testdata\\Book1.xlsx");
		
	//Create an object of FileInputStream to read data from file
	
	FileInputStream inputStream= new FileInputStream(excelFile);
		
	//Create object of XSSFWorkbook to handle xlsx file
	ExcelBook =new XSSFWorkbook(inputStream);
		
	//to access workbook sheet
	ExcelSheet = ExcelBook.getSheetAt(0);
		
	//get total row count
	int ttlRows = ExcelSheet.getLastRowNum()+1;
	
	//get total no.of cells in row
	int ttlCells = ExcelSheet.getRow(0).getLastCellNum();
	
	for(int currentRow=0;currentRow<ttlRows;currentRow++) //read row
	{
		for(int currentCell=0;currentCell<ttlCells;currentCell++) //read cell
		{
			
			System.out.print(ExcelSheet.getRow(currentRow).getCell(currentCell).toString());
			System.out.print("\t");
		}
	    System.out.println();
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
