package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_TestAnnotation {

	ChromeDriver D1 = new ChromeDriver();	
@BeforeMethod	
public void Suite()
{
	D1.get("https://www.google.com");
	D1.manage().window().maximize();	
}
	@Test
	public void Item() throws InterruptedException
	{
	WebElement search = D1.findElement(By.className("gLFyf"));
	search.sendKeys("amazon india");
	search.sendKeys(Keys.ENTER);	
	
	Thread.sleep(2000);
	D1.findElement(By.xpath("//span[.='Shop online at Amazon India - Great deals on Amazon']")).click();
	Thread.sleep(2000);
	WebElement AmazonSearch = D1.findElement(By.id("twotabsearchtextbox"));
	AmazonSearch.sendKeys("Baby car");
	AmazonSearch.sendKeys(Keys.ENTER);
	}
	
@AfterMethod
	public void Payment() throws InterruptedException {
	Thread.sleep(2000);
 D1.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
 WebElement BabyCar =D1.findElement(By.xpath("//input[@id='buy-now-button']"));
BabyCar.click();

}
}