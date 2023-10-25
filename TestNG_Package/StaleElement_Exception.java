package TestNG_Package;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class StaleElement_Exception {
@Test
public void sample() throws AWTException, InterruptedException {
	
	ChromeDriver web = new ChromeDriver();
	 web.navigate().to("https://www.google.com/");
	 web.manage().window().maximize();
	 
	 WebElement navigate = web.findElement(By.id("APjFqb"));
	 navigate.sendKeys("Facebook");
	 navigate.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	WebElement select = web.findElement(By.linkText("Facebook - log in or sign up"));
	
	Actions aa = new Actions(web);
	aa.doubleClick(select).perform();
	 
}
}
