package POM_TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import POM_Source.POM_LoginPage;

public class Login_TestCase1  {
		@Test
	public void login_application() throws InterruptedException, EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		POM_LoginPage aa= new POM_LoginPage(driver);
		aa.un();
		aa.username_continue_button();
		aa.password();
		aa.password_Signin_button();
		Thread.sleep(3500);	
	}
	}