package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_73 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.google.com/");
		D1.manage().window().maximize();
	//Link Text	
		WebElement Gmail = D1.findElement(By.linkText("Gmail"));
		Gmail.click();
	//Partial link text
		D1.get("https://www.google.com/gmail/about/");
		D1.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(2000);
Gmail.findElement(By.className("whsOnd zHQkBf")).sendKeys("janani.eshan");
Gmail.findElement(By.linkText("Next")).click();
	}

}
