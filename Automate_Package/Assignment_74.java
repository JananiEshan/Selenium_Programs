package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_74 {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.amazon.in/");
		D1.manage().window().maximize();
		WebElement search = D1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Laptop");
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
	}

}
