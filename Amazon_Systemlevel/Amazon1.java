package Amazon_Systemlevel;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Amazon1 {
	ChromeDriver D1;
	@BeforeMethod
	public void launch() throws InterruptedException {
		D1 = new ChromeDriver();
		D1.navigate().to("https://www.amazon.in/");
		D1.manage().window().maximize();
		 Thread.sleep(2000);
		
	/*	 WebElement Account_Signin = D1.findElement(By.id("nav-link-accountList-nav-line-1"));  // Sign in
		Account_Signin.click();
		 Thread.sleep(2000);
		//Enter Email
		 D1.findElement(By.id("ap_email")).sendKeys("9894089677");
		 D1.findElement(By.id("continue")).click();
		 Thread.sleep(2000);
		 // Enter Password
		 D1.findElement(By.id("ap_password")).sendKeys("Janani@96");
		 D1.findElement(By.id("signInSubmit")).click(); */
		 }
@AfterMethod
public void screenshot() throws IOException, InterruptedException {
	
	D1.quit();
}


}
