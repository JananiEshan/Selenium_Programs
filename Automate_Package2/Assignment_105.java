package Automate_Package2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Assignment_105 {

	@Test
	public void get_Exception() throws EncryptedDocumentException, IOException {
		
		FileInputStream File2 = new  FileInputStream("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\WB.xlsx");
		
		Workbook open22 = WorkbookFactory.create(File2);
		
		Sheet Sheet22 = open22.getSheet("Credentials");
		
		Row row22 = Sheet22.getRow(1);
		
		Cell cell22 = row22.getCell(3);
		
		String value22 = cell22.getStringCellValue();
		
		System.out.println(value22);
		
		
		
	}
	
	
}
