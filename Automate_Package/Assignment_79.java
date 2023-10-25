package Automate_Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_79 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		D1.manage().window().maximize();
		D1.findElement(By.xpath("//span[.='Google']")).click();
			Set<String> Child = D1.getWindowHandles(); // storing to string in order to use for iterator
	
		Iterator<String> List = Child.iterator(); 
		//since this is in string , we are using iterator because we cannot iterate using for loop
		String Parent_Id=List.next();
		String Child_Id = List.next();	
D1.switchTo().window(Child_Id)	;
Thread.sleep(2000);
D1.close();
//normally using close(); we can close the parent browser, we switched to child, so child getting closed.
	}

}
