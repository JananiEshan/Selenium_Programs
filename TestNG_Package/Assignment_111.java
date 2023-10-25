package TestNG_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_111 extends Assignment_111a {
@Test
public void excel() throws EncryptedDocumentException, IOException {
	
	// Taking the data from excel
	FileInputStream fin = new FileInputStream("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\FB_Credentials.xlsx");
	Workbook open = WorkbookFactory.create(fin);
	Sheet sheet1 = open.getSheet("credentials");
	Row row1 = sheet1.getRow(2); //user name row
	Cell cell1 = row1.getCell(1); // user name column
	
	//String name = open.getSheet("credentials").getRow(2).getCell(1).getStringCellValue();
	String uname = NumberToTextConverter.toText(cell1.getNumericCellValue());
	Row row2 = sheet1.getRow(2); //password row)
	Cell cell2 = row2.getCell(2);
	String pass = cell2.getStringCellValue();	

	
	WebElement user_field = web.findElement(By.id("email"));
	user_field.sendKeys(uname);
	WebElement pass_field = web.findElement(By.id("pass"));
	pass_field.sendKeys(pass);
}
}
