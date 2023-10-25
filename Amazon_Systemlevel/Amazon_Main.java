package Amazon_Systemlevel;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon_Main extends Amazon1{
		@Test (groups ={"smoke"})	
	public void method1() throws InterruptedException, IOException {
//Enter nothing/ click on the search button; it should show the same page without refreshing
			WebElement search = D1.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys(" ");
			search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);	
			TakesScreenshot shot1 = D1;
			File F1 = shot1.getScreenshotAs(OutputType.FILE);
			File F2 = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\Amazon_1"+".png");
			FileUtils.copyFile(F1, F2);
			
			Thread.sleep(3000);
	}
		@Test (groups ={"regression"})
	public void method2() throws InterruptedException {
//Typing any single character in the search box should show a list of product suggestions starting with the entered character.	
		WebElement search = D1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("A");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
	}
	@Test (groups ={"regression"})
	public void method3() throws InterruptedException, IOException {
//Type any two-character, and the user should be able to see an updated list with the product starting from given two-character
		WebElement search = D1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Bi");
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		TakesScreenshot shot1 = D1;
		File F1 = shot1.getScreenshotAs(OutputType.FILE);
		File F2 = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\Amazon_2"+".png");
		FileUtils.copyFile(F1, F2);
		
		Thread.sleep(3000);
	}
	@Test (groups ={"regression"})
	public void method4() throws InterruptedException, IOException {
//Enter a long string under 650 characters, which should load the result page
		WebElement search = D1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		TakesScreenshot shot1 = D1;
		File F1 = shot1.getScreenshotAs(OutputType.FILE);
		File F2 = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\Amazon_3"+".png");
		FileUtils.copyFile(F1, F2);
		
		Thread.sleep(3000);
	}
	@Test (groups ={"smoke"})
	public void method5() throws InterruptedException, IOException {
//A combination of string, character, and number should load the result page (as per requirement)
		WebElement search = D1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("1234qwexzsvdgdfd");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
		TakesScreenshot shot1 = D1;
		File F1 = shot1.getScreenshotAs(OutputType.FILE);
		File F2 = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\Amazon_4"+".png");
		FileUtils.copyFile(F1, F2);
		
		Thread.sleep(3000);
	}
	

}
