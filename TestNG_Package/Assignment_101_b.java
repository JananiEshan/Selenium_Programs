package TestNG_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment_101_b  {
//Grand Parent
	
	public void Excel_Assignment1() throws EncryptedDocumentException, IOException
	{
	//Step1 - give file location
		FileInputStream file1 =  new FileInputStream("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\WB.xlsx");	
	//Step2 - to open the sheet
		Workbook open = WorkbookFactory.create(file1);
	// Step3 - to locate sheet
		Sheet sheet1 = open.getSheet("Credentials");
	//Step 4 - to locate row
		Row row1 = sheet1.getRow(1);
	//Step 5 - to locate column
		Cell column1 = row1.getCell(0);
	//Step 6 - to get values
		String Uname = column1.getStringCellValue();	
		 
		//System.out.println(Uname);
	// gettig password
		Row row2 = sheet1.getRow(1);
		Cell column2 = row1.getCell(0);
		
	String password = column1.getStringCellValue();

	//System.out.println(password);
	}
	}