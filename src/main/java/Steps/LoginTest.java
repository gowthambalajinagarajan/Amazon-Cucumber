package Steps;

import org.junit.Assert;

import Pages.LoginPage;
import Utility.BasePage;
import cucumber.api.java.en.*;

public class LoginTest {
	
	BasePage bp;
	LoginPage lp;
	
	public LoginTest() {
		bp=new BasePage();
		lp=new LoginPage();
	}

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		lp=new LoginPage();
	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() throws Throwable {
	  lp.getAccountList().click();
	  lp.getLoginName().sendKeys("9043178410");
	  lp.ClickContinue();
	  lp.getPassword().sendKeys("balaji18");
	}

	@When("^click on login button\\$\"\\)$")
	public void click_on_login_button$() throws Throwable {
		lp.getSubmit().click();
	}

	/*@Then("^user should login into application page\\.$")
	public void user_should_login_into_application_page() throws Throwable {
	    System.out.println(lp.getName().getText());
	    Assert.assertTrue("Pass", lp.getURL().contains("amazon"));
	}*/
}
