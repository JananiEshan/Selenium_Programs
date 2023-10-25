package TestNG_Package;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggest_Shoe{

@Test
public void add() throws InterruptedException {
	ChromeDriver D1 = new ChromeDriver();
	D1.navigate().to("https://www.amazon.in/");
	D1.manage().window().maximize();
	WebElement search = D1.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoe");
	List<WebElement> options = D1.findElements(By.xpath("//div[@class='left-pane-results-container']//div//div"));
	int count = options.size();
	for (int i =0;i<count;i++) {
		WebElement num = options.get(i);
		String details = num.getText();
		System.out.println(details);
	}	
}}