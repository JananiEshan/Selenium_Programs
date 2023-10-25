package GetClassMethod;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Assignment_103 {
	ChromeDriver D1;
	@BeforeMethod
	public void launch() {
		D1 = new ChromeDriver();
		D1.get("https://www.google.com/");
		D1.manage().window().maximize();	
	}

	@AfterMethod
	public void quit() throws IOException {
		TakesScreenshot shot1 = D1;
File F1 = shot1.getScreenshotAs(OutputType.FILE);
File F2 = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\103_"+ getClass()+".png");
FileUtils.copyFile(F1, F2);   
	}}

