package Automate_Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_94 {
//launching the browser using Test annotation
	
		@Test
		public void launch()
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
		}
		
	
}
