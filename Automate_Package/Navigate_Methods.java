package Automate_Package;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver D1 = new ChromeDriver();
		D1.navigate().to("https://www.google.com");
		D1.manage().window().maximize();
		Thread.sleep(2000);
		D1.navigate().back();
		Thread.sleep(2000);

		D1.navigate().forward();
		Thread.sleep(2000);
	
		D1.navigate().refresh();
		
	}

}
