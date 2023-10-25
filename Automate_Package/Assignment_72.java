package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_72 {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.amazon.in/");
		D1.manage().window().maximize();
		D1.findElement(By.linkText("Mobiles")).click();
		D1.findElement(By.id("twotabsearchtextbox")).sendKeys("Pixel7");
		D1.findElement(By.id("nav-search-submit-button")).click();
	}

}
