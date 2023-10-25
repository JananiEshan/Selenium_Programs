package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver D1 = new ChromeDriver();
		D1.get("https://grotechminds.com/registration/");
		D1.manage().window().maximize();
		Thread.sleep(2000);
		D1.findElement(By.name("your-name")).sendKeys("Janani"); //USERNAME
	//	D1.findElement(By.xpath("//input[@id='3']")).sendKeys("janani");//PASSWORD
		//D1.findElement(By.xpath("//input[@id='4']")).sendKeys("Eshan");//FIRST NAME
	//	D1.findElement(By.xpath("//input[@id='5']")).sendKeys("Eshan");//FIRST NAME
		//D1.findElement(By.xpath("//input[@value='FeMale']")).click();//GENDER
		//D1.findElement(By.xpath("//input[@id='5']")).sendKeys("Selvam");//LAST NAME
		//D1.findElement(By.name("checkbox-833[]")).click(); // LAST CHECK BOX
 
				
	/* Country Drop down			
				D1.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[4]")).click();
 WebElement dropdown2 = D1.findElement(By.xpath("(//li[@role='treeitem'])[2]"));
 dropdown2.click();
*/ 
//Skills Drop down
		D1.findElement(By.xpath("//span[@id='select2-menu-600-89-container']")).click();
		WebElement dropdown1 = D1.findElement(By.xpath("(//li[@class='select2-results__option'])[2]"));
		dropdown1.click();
			
 
	}

}
