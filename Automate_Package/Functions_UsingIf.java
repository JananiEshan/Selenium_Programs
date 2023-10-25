package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions_UsingIf {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("file:///C:/Users/DELL/Documents/Selenium_MKT/JSAM.html");
		D1.manage().window().maximize();
		D1.findElement(By.xpath("//input[@id='1']")).sendKeys("Janani"); //NAME
		D1.findElement(By.xpath("//input[@id='2']")).sendKeys("NAME"); //HINT
		D1.findElement(By.xpath("//input[@id='3']")).sendKeys("Janani"); //PASSWORD
		
		WebElement Fname = 	D1.findElement(By.name("fname"));
	Boolean First = Fname.isDisplayed();
		if(First==true) {
		 Fname.sendKeys("Pallavi");
		
		}
		else
		System.out.println("This Field is nto avilable");

WebElement dd=	D1.findElement(By.xpath("(//input[@type='radio'])[2]"));
dd.click();
	Boolean Gender = dd.isEnabled();
	if(Gender == true) {	
		System.out.println("This Field is enabled");
	}
	else
	System.out.println("This Field is not enabled ");
	}

}
