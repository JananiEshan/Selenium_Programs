package TestNG_Package;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoDropdown_Amazon {
	@Test
	public void add() throws InterruptedException, AWTException {
		ChromeDriver D1 = new ChromeDriver();
		D1.navigate().to("https://www.amazon.in/");
		D1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		D1.manage().window().maximize();
		WebElement drop =D1.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
		drop.click();
	
	List<WebElement> lists = D1.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
	int count = lists.size();
	for(int i =0;i<count;i++) {
		WebElement qq = lists.get(i);
		String value=qq.getText();
		System.out.println(value);
	}

	
	}}

