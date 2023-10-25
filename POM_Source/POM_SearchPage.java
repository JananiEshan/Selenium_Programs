package POM_Source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Excel_data.POM_DataClass;

public class POM_SearchPage extends POM_DataClass{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;

	@FindBy(id="nav-search-submit-button")
	WebElement item_click;
	
	public void search_item() {
		search.sendKeys(item);	
	}	
	public void search_click() {
		item_click.click();
		}
	
	public POM_SearchPage(WebDriver janu)//constructor should be public to use in other class
	{
	PageFactory.initElements(janu, this);
	
	}
	}

