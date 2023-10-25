package Automate_Package2;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_108 {
	
	@Test
	public void sample() throws AWTException, InterruptedException {
		
		ChromeDriver web = new ChromeDriver();
		 web.navigate().to("https://www.amazon.in/");
		 web.manage().window().maximize();
		WebElement mobile = web.findElement(By.linkText("Mobiles"));
		
		Actions aa = new Actions(web);
		aa.contextClick(mobile).perform();
		
	}
	}