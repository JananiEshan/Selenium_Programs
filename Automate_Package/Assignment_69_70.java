package Automate_Package;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_69_70 {


		public static void main(String[] args) throws InterruptedException {
			ChromeDriver D1 = new ChromeDriver();
			D1.get("https://www.google.com");
			D1.manage().window().maximize();
			D1.quit();
	}

}
