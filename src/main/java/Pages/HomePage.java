package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class HomePage extends BasePage {

	@FindBy(xpath="(//a[@class='nav-a  '])[1]")
	private WebElement MobileTab;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[3]")
	private WebElement PantryTab;

	@FindBy(xpath="(//a[@class='nav-a  '])[5]")
	private WebElement AmazonPayTab;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPantryTab() {
		return PantryTab;
	}
	
	public void ClickPantryTab() {
		PantryTab.click();
	}

	public WebElement getAmazonPayTab() {
		return AmazonPayTab;
	}
	
	public void ClickAmazonPayTab() {
		AmazonPayTab.click();
	}

	public WebElement getMobileTab() {
		return MobileTab;
	}
	
	public void ClickMobileTab() {
		MobileTab.click();
	}
	
}
