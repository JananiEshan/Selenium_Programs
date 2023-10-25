package iRetry_Analyser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_1 {
	
	@Test(retryAnalyzer=iRetry_Analyser.Retry_Logic.class)
	public void sample() {
ChromeDriver  driver=	new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement wb1 =driver.findElement(By.id("manish"));
	wb1.sendKeys("India");
	wb1.sendKeys(Keys.ENTER);
}
}