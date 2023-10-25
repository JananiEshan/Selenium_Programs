package Assertion_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion_1 {
	@Test
	public void sample() {
ChromeDriver  driver=	new ChromeDriver();
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	Assertion a1=new Assertion();
	a1.assertEquals("Google", driver.getTitle());// 1st is actual 2nd is expected
	WebElement wb1 =driver.findElement(By.name("q"));
	wb1.sendKeys("India");
	wb1.sendKeys(Keys.ENTER);
	
}
}