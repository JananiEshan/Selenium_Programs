package Automate_Package2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_102 {

	@Test
	public void launch() throws IOException {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.google.com/");
		D1.manage().window().maximize();
		
		WebElement Search1 = D1.findElement(By.id("APjFqb"));
		Search1.sendKeys("Rameshwaram cafe in Bangalore");
		Search1.sendKeys(Keys.ARROW_DOWN);
		Search1.sendKeys(Keys.ENTER);

		TakesScreenshot shot1 = D1;
		
File F1 = shot1.getScreenshotAs(OutputType.FILE);

File F2 = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\Rameshwaram"+ Math.random()+".png");

FileUtils.copyFile(F1, F2);   
	}

}

	

