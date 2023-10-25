package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_95 {
// For 5 countries use @Test annotation
	@Test
	public void launch1() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("India");
		wb1.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
	
	@Test
	public void launch2() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("UK");
		wb1.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
	
	@Test
	public void launch3() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("USA");
		wb1.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
}
