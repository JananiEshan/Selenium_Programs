package GetClassMethod;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class2 extends Assignment_103  {
	@Test
	public void Subway() throws IOException {
		
		WebElement Search1 = D1.findElement(By.id("APjFqb"));
		Search1.sendKeys("SubWay cafe in Bangalore near me ");
		Search1.sendKeys(Keys.ARROW_DOWN);
		Search1.sendKeys(Keys.ENTER);

	/*	TakesScreenshot shot1 = D1;
File F1 = shot1.getScreenshotAs(OutputType.FILE);
File F2 = new File("C:\\Users\\DELL\\Jan-eclipse-workspace\\Automate_Project\\Screenshot_Folder\\subway"+ getClass()+".png");
FileUtils.copyFile(F1, F2);     */
	}
}
