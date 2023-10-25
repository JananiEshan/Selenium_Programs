package Automate_Package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_109 {

	@Test
	public void sample() throws AWTException, InterruptedException {
		
		ChromeDriver web = new ChromeDriver();
		 web.navigate().to("https://www.amazon.in/");
		 web.manage().window().maximize();
		WebElement mobile = web.findElement(By.linkText("Mobiles"));
		
		Actions aa = new Actions(web);
		aa.contextClick(mobile).perform();
		
		Robot rr = new Robot();
		rr.keyPress(KeyEvent.VK_DOWN);
		rr.keyPress(KeyEvent.VK_DOWN);
		rr.keyPress(KeyEvent.VK_DOWN);
	rr.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	}
	}