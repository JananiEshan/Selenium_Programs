package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_78 {

	public static void main(String args[]) {
		ChromeDriver D1 = new ChromeDriver();		
		D1.get("https://www.amazon.in/");
		D1.manage().window().maximize();	
	WebElement search_Element = D1.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	
	//Performing Hover over using action class
	
	 Actions a1 = new Actions(D1);
	 a1.moveToElement(search_Element).perform();
	 
	
	}
}

