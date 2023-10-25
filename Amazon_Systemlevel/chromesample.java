package Amazon_Systemlevel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromesample {

	@Test
	public void sample() {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32.zip\\chromedriver_win32\\chromedriver_win32.exe");
		ChromeDriver D1 = new ChromeDriver();
	}
}
