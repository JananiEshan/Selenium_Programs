package Automate_Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_80 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.amazon.in");
		D1.manage().window().maximize();
			D1.findElement(By.id("twotabsearchtextbox")).sendKeys("Pixel Charger");
			D1.findElement(By.id("nav-search-submit-button")).click();
			D1.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
			Thread.sleep(2000);
			Set <String> Browser_Id = D1.getWindowHandles();
			
			Iterator <String> Count = Browser_Id.iterator();
			String a = Count.next();
	//	String b =	Count.next();
			D1.switchTo().window(a);
			
			D1.close();
			Thread.sleep(2000);
	D1.findElement(By.id("buy-now-button")).click();
			//D1.findElement(By.name("proceedToRetailCheckout")).click();
//enter User name and password			
			WebElement Username = D1.findElement(By.id("ap_email"));
			Username.sendKeys("9894089677");
			Username.sendKeys(Keys.ENTER);
			
			WebElement Password = D1.findElement(By.id("ap_password"));
			Password.sendKeys("9894089677");
			Password.sendKeys(Keys.ENTER);
	}

}
