package Automate_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_99 {

@Test
public void google_search() throws IOException
{
	ChromeDriver D1 = new ChromeDriver();		
		D1.get("https://www.google.com");
		D1.manage().window().maximize();	
	WebElement search = D1.findElement(By.id("APjFqb"));
	search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		
//Step 1:
	 TakesScreenshot shot1 = D1;
	 
//Step 2 :
	 File Source = shot1.getScreenshotAs(OutputType.FILE);

//Step 3 :
	 File Destination = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\1.png");

//Step 4 :
	 FileUtils.copyFile(Source, Destination);
}

}







	

