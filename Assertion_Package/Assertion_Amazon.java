package Assertion_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion_Amazon {
	
@Test(priority=-1)
public void credentials() throws InterruptedException {
	ChromeDriver driver=	new ChromeDriver(); ////span[@class='nav-line-2 ']
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
Actions aa = new Actions(driver);
WebElement signin = driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
aa.moveToElement(signin).perform();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();

//Enter Email
driver.findElement(By.id("ap_email")).sendKeys("9894089677");
driver.findElement(By.id("continue")).click();
 Thread.sleep(2000);
 // Enter Password
 driver.findElement(By.id("ap_password")).sendKeys("Janani@96");
 driver.findElement(By.id("signInSubmit")).click(); 

 String title = driver.getTitle();
 System.out.println(title);
 Assertion a1 = new Assertion();
 a1.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", driver.getTitle());


}
	@Test(priority=1)
	public void sample() throws InterruptedException {
		ChromeDriver driver=	new ChromeDriver(); ////span[@class='nav-line-2 ']
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	Actions aa = new Actions(driver);
	WebElement signin = driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
	aa.moveToElement(signin).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();

	//Enter Email
	driver.findElement(By.id("ap_email")).sendKeys("9894089677");
	driver.findElement(By.id("continue")).click();
	 Thread.sleep(2000);
	 // Enter Password
	 driver.findElement(By.id("ap_password")).sendKeys("abcd");
	 driver.findElement(By.id("signInSubmit")).click(); 

	 String title = driver.getTitle();
	 System.out.println(title);

Assertion a1 = new Assertion();
a1.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", driver.getTitle());
			
		
	
}
}