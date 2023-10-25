package GetClassMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Class3 extends Assignment_103 {
	@Test
	public void Rameshwaram() throws IOException {
		WebElement Search1 = D1.findElement(By.id("APjFqb"));
		Search1.sendKeys("Rameshwaram cafe in Bangalore");
		Search1.sendKeys(Keys.ARROW_DOWN);
		Search1.sendKeys(Keys.ENTER);		
}
}
