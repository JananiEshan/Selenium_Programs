package Automate_Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment66_67 {

	public static void main(String[] args) {	
	
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.google.com");
System.out.println(D1.getTitle());
System.out.println(D1.getWindowHandle());
D1.close();	
System.out.println("Broswer Closed");
	EdgeDriver D2 = new EdgeDriver();
	D2.get("https://www.google.com");
	System.out.println(D2.getTitle());
	

}

}
