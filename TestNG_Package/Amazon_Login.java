package TestNG_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Amazon_Login  {
	ChromeDriver web;
	@BeforeMethod
	public void launch() throws InterruptedException {
		 web = new ChromeDriver();
		web.navigate().to("https://www.amazon.in/");
		 web.manage().window().maximize();
		 Thread.sleep(2000);
		 // Sign in
		 WebElement Account_Signin = web.findElement(By.id("nav-link-accountList-nav-line-1"));
		Account_Signin.click();
		 Thread.sleep(2000);
		 //Enter Email
		 web.findElement(By.id("ap_email")).sendKeys("9894089677");
		 web.findElement(By.id("continue")).click();
		 Thread.sleep(2000);
		 // Enter Password
		 web.findElement(By.id("ap_password")).sendKeys("Janani@96");
		 web.findElement(By.id("signInSubmit")).click(); 
		}
	}
