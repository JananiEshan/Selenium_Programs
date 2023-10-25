package Automate_Package2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Assignment_104_DTT {

	@Test
	public void User_Credentials() throws EncryptedDocumentException, IOException {
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
				 System.out.println(Uname);
				
			Row row22 = sheet1.getRow(1);
			//Step 5 - to locate column
				Cell column2 = row22.getCell(1);
				String password = column2.getStringCellValue();
			
			System.out.println(password);
	}
	
	
	
}
