package Automate_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("file:///C:/Users/DELL/Documents/Selenium_MKT/JSAM.html");
		WebElement dd = D1.findElement(By.id("Relegion"));	
		Select S1 = new Select(dd);
		S1.selectByVisibleText("Christian");
		List<WebElement> count = S1.getOptions();
		System.out.println(count.size());
	}

}
