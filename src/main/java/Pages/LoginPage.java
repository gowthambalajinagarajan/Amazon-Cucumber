package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(id="nav-link-accountList")
	private WebElement AccountList;
	
	@FindBy(id="ap_email")
	private WebElement LoginName;
	
	@FindBy(id="continue")
	private WebElement LoginContinue;
	
	@FindBy(id="ap_password")
	private WebElement Password;
	
	@FindBy(id="signInSubmit")
	private WebElement Submit;
	
	@FindBy(xpath="//*[@class='nav-line-1']")
	private WebElement Name;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAccountList() {
		return AccountList;
	}
	
	public void ClickAccountList() {
		AccountList.click();
	}
	
	public WebElement getLoginName() {
		return LoginName;
	}

	public void SetLoginName(String Name) {
		setText(LoginName, Name);
	}
	
	public void ClickContinue() {
		LoginContinue.click();
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	public WebElement getName() {
		return Name;
	}
	
}
