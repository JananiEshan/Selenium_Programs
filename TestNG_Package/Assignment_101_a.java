package TestNG_Package;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Assignment_101_a extends Assignment_101_b{

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod	
	public void Suite()
	{		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
	}

	@AfterMethod
	public void close() throws InterruptedException {
		//driver.quit();
		//Thread.sleep(2000);
	}	
}

 