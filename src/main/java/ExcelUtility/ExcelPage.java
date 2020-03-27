package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPage {
	// To read and return the username from excel

	public String excel_username(int i) throws IOException,IncompatibleClassChangeError {

		FileInputStream fil = new FileInputStream(
				new File("TestData\\excel.xlsx"));
		  @SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell=row.getCell(0);
			  String em=cell.getStringCellValue();
			        
		return em;
	}

	// To read and return the password from excel

	public String excel_password(int i) throws IOException,IncompatibleClassChangeError {

		FileInputStream fil = new FileInputStream(
				new File("TestData\\excel.xlsx"));
		  @SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1"); 
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell1=row.getCell(1);
			  String pwd=cell1.getStringCellValue();
    
		return pwd;
	}
}