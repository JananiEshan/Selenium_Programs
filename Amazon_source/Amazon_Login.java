package Amazon_source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login {
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement username;

	@FindBy(id="continue")
	WebElement Continue_button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement Signin_button;
//STEP2:
	public void username() {
		username.sendKeys("9894089677");
	}
	public void username_continue_button() {
		Continue_button.click();
	}
	public void password() {
		password.sendKeys("Janani@96");
	}
	public void password_Signin_button() {
		Signin_button.click();
	}
//STEP3: initializing the elements inside constructor	
public Amazon_Login(WebDriver janu)//constructor should be public to use in other class
	{
	PageFactory.initElements(janu, this);
	
	}

}


