package TestNG_Package;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Amazon_Shopping extends Amazon_Login{
@Test
public void shopping () throws AWTException, InterruptedException {
	WebElement search = web.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("1 year baby electric bike");
	search.sendKeys(Keys.ARROW_DOWN);
	search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);	
web.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();

Set<String> parent_Child = web.getWindowHandles();// give both parent and child 
Iterator<String> count=  parent_Child.iterator(); // storing parent and multiple child ID.
String a1 = count.next(); 
String a2 = count.next();
web.switchTo().window(a2);

web.findElement(By.id("add-to-cart-button")).click();
web.findElement(By.name("proceedToRetailCheckout")).click();
web.findElement(By.xpath("(//span[@class=\"a-label a-radio-label\"])[1]")).click();
}
}
