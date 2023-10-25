package Automate_Package2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting.class)
public class Assignment112_Listener
{	
	ChromeDriver driver;
	@Test
	 void sample() {
		 driver=	new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement wb1 =driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("India");
		wb1.sendKeys(Keys.ENTER);	
	}
	}
