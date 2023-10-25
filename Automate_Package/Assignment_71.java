package Automate_Package;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_71 {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.facebook.com/");
 D1.findElement(By.name("email")).sendKeys("9894089677");
D1.findElement(By.id("pass")).sendKeys("janani");
D1.findElement(By.name("login")).click();
		

	}

}
