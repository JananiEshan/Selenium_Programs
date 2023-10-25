package Automate_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_75 {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://grotechminds.com/registration/");
		D1.manage().window().maximize();
		D1.findElement(By.name("your-name")).sendKeys("Janani"); //USERNAME
		D1.findElement(By.xpath("//input[@id='2']")).sendKeys("Name"); //HINT
		D1.findElement(By.xpath("//input[@id='3']")).sendKeys("janani");//PASSWORD
		D1.findElement(By.xpath("//input[@id='4']")).sendKeys("Eshan");//FIRST NAME
		D1.findElement(By.xpath("//input[@value='FeMale']")).click();//GENDER
				D1.findElement(By.xpath("//input[@id='5']")).sendKeys("Selvam");//LAST NAME
 D1.findElement(By.name("checkbox-833[]")).click();
 
	}

}
