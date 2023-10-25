package Automate_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  Assignment_97{
//1 Parent Class (LaunchandQuit) which not having @Test annotation and  3 Child class with @Test annotations and with 3 scenario's
	ChromeDriver driver = new ChromeDriver();
	@BeforeMethod
		public  void launch() {		
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			}
@AfterMethod
public void close() {
	driver.close();  }

}
class one extends Assignment_97 {
	@Test
	public void Country1() throws InterruptedException {
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("UK");
		wb1.sendKeys(Keys.ENTER);
				Thread.sleep(5000); 	}}

class two extends one {
	@Test
	public void Country1() throws InterruptedException {
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("USA");
		wb1.sendKeys(Keys.ENTER);
				Thread.sleep(5000); 	}}
class three extends two {
	@Test
	public void Country1() throws InterruptedException {
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("Bharat");
		wb1.sendKeys(Keys.ENTER);
				Thread.sleep(5000); 	}}
