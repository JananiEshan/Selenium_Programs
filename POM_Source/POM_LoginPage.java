package POM_Source;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import POM_Excel_data.POM_DataClass;

public class POM_LoginPage extends POM_DataClass 
{
WebDriver driver;
	
	@FindBy(name="email")
	WebElement username;

	@FindBy(id="continue")
	WebElement Continue_button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement Signin_button;
	POM_DataClass d1=new POM_DataClass();
//STEP2:
	public void un() throws EncryptedDocumentException, IOException 
	{
		
		String uname=d1.GetName();
		username.sendKeys(uname);
	}
	public void username_continue_button() {
		Continue_button.click();
	}
	public void password() throws EncryptedDocumentException, IOException {
		String pass =d1.Getpassword();
		password.sendKeys(pass);
	}
	public void password_Signin_button() {
		Signin_button.click();
	}
//STEP3: initializing the elements inside constructor	
public POM_LoginPage(WebDriver janu)//constructor should be public to use in other class
	{
	PageFactory.initElements(janu, this);
	}
}


