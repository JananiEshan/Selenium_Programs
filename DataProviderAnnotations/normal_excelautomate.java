package DataProviderAnnotations;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class normal_excelautomate {
	ChromeDriver D1 ;
	@Test(dataProvider ="Sample")
	public void Login(String a, String b) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://grotechminds.com/registration/");
		D1.manage().window().maximize();	
		D1.findElement(By.name("your-name")).sendKeys(a); //USERNAME
		D1.findElement(By.xpath("//input[@id='3']")).sendKeys(b);//PASSWORD
	}	
	@DataProvider(name = "Sample")
	public Object[][] login_details() throws EncryptedDocumentException, IOException 
		{	
		FileInputStream file1 =  new FileInputStream("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\GroTech_Registration.xlsx");	
		Workbook open = WorkbookFactory.create(file1);
		Object aa[][] = new Object[1][2];
		aa[0][0]= open.getSheet("Credentials").getRow(1).getCell(0).getStringCellValue();
		aa[0][1]= open.getSheet("Credentials").getRow(1).getCell(1).getStringCellValue();
	//	aa[0][2]= open.getSheet("Credentials").getRow(2).getCell(0).getStringCellValue();
		//aa[0][3]= open.getSheet("Credentials").getRow(2).getCell(1).getStringCellValue();
		return aa;
		}
}




