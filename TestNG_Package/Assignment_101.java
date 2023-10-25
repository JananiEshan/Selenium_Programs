package TestNG_Package;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment_101 extends Assignment_101_a{

		
		@Test
		public void case1(String Uname, String Pass) throws InterruptedException, EncryptedDocumentException, IOException {
		WebElement search=	driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("Facebook.com");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[.='Facebook - log in or sign up']")).click();
		Thread.sleep(2000);
				
		Assignment_101_a t1 = new Assignment_101_a();
		t1.Excel_Assignment1();
		
	driver.findElement(By.name("email")).sendKeys(" ");
		driver.findElement(By.name("pass")).sendKeys(" "); 
		
		
		}
		
		
		
		
	}
