package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_76 {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("file:///C:/Users/DELL/Documents/Selenium_MKT/JSAM.html");
		D1.manage().window().maximize();
	D1.findElement(By.xpath("//input[@id='1']")).sendKeys("Janani"); //NAME
	D1.findElement(By.xpath("./html/body/input[2]")).sendKeys("NAME"); //HINT
	D1.findElement(By.xpath("./html/body/input[3]")).sendKeys("Janani"); //PASSWORD
	D1.findElement(By.xpath("./html/body/input[4]")).sendKeys("Janani"); //FIRST NAME
	D1.findElement(By.xpath("./html/body/input[5]")).sendKeys("Selvam"); //LAST NAME
	D1.findElement(By.id("321")).click(); // CHECK BOX (GIRL)
D1.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	
	}

}
