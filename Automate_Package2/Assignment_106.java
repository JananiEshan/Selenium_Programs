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

public class Assignment_106 {

	@Test
	public void Get_Expection() throws EncryptedDocumentException, IOException {
		
		FileInputStream fin = new FileInputStream("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\WB.xlsx");
		
		Workbook wb = WorkbookFactory.create(fin);
		
		Sheet sheet1 = wb.getSheet("Credentials");
		
		Row row1 = sheet1.getRow(2);
		
		Cell cell1 = row1.getCell(0);
		
		String get_value= cell1.getStringCellValue();
		
		
	}
	
	
	
}
