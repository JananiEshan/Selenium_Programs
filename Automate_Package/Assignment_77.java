package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_77 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.flipkart.com/");
		D1.manage().window().maximize();
		Thread.sleep(4000);
	D1.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("9894089677");
	D1.findElement(By.className("_1wGnMD rX1XT4 _2nD2xJ")).click();
	}
}

