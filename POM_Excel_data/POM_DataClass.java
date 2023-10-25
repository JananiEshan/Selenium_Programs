package POM_Excel_data;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class POM_DataClass {
	public String un;
	public String pw;
	public String item;
public String GetName() throws EncryptedDocumentException, IOException 
{
	FileInputStream file1 =  new FileInputStream("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\POM_Excel.xlsx");	
	Workbook open = WorkbookFactory.create(file1);
	un =NumberToTextConverter.toText(open.getSheet("Credentials").getRow(1).getCell(0).getNumericCellValue());
	return	un;
}

public String Getpassword() throws EncryptedDocumentException, IOException 
{
	FileInputStream file1 =  new FileInputStream("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\POM_Excel.xlsx");	
	Workbook open = WorkbookFactory.create(file1);
	pw = open.getSheet("Credentials").getRow(1).getCell(1).getStringCellValue();
	return pw;
}
}