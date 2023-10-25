package TestNG_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver D1 = new EdgeDriver();
		D1.get("https://www.google.com/");
		D1.manage().window().maximize();
		
		WebElement Search1 = D1.findElement(By.id("APjFqb"));
		Search1.sendKeys("Rameshwaram cafe in Bangalore");
		Thread.sleep(2000);
		
		List <WebElement> Autosuggest = D1.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);
		Autosuggest.get(3).click();
	}

}
