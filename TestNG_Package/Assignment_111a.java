package TestNG_Package;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Assignment_111a {
	ChromeDriver web;
	@BeforeMethod
	public void launch() throws InterruptedException {
		 web = new ChromeDriver();
		web.navigate().to("https://www.facebook.com/");
		 web.manage().window().maximize();
		 Thread.sleep(2000);
		}

	@AfterMethod
	public void quit() throws IOException {
	web.quit();
	}
}
