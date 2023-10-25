package Automate_Package;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_68 {

	public static void main(String[] args) {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.google.com");
		D1.manage().window().maximize();
		D1.close();
	
	}

}
