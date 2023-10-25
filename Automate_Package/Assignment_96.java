package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_96 {
// TestNG - Timeout Parameter (ThreadTimeOutOfException)
	
	
	@Test(timeOut=4000)
	public void launch1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("India");
		wb1.sendKeys(Keys.ENTER);
		
	}
	
	@Test(timeOut=4000)
	public void launch2()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("UK");
		wb1.sendKeys(Keys.ENTER);
		
	}
	
}
