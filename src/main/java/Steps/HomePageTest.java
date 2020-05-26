package Steps;

import static org.junit.Assume.assumeTrue;

import org.junit.Assert;

import Pages.HomePage;
import Utility.BasePage;
import cucumber.api.java.en.*;

public class HomePageTest {

	BasePage bp;
	HomePage hp;
	
	public HomePageTest() {
		bp=new BasePage();
		hp=new HomePage();
	}
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable{
		hp=new HomePage();
	}

	@When("^User Click on the tab \"(.*?)\"$")
	public void user_Click_on_the_tab(String tab) throws Throwable {
	    if(tab.equals("Mobile")) {
	    	System.out.println(hp.getMobileTab().getText());
	    	hp.ClickMobileTab();
	    }
	    else if(tab.equals("Pantry")) {
	    	System.out.println(hp.getPantryTab().getText());
	    	hp.ClickPantryTab();
	    }
	    else {
	    	System.out.println(hp.getAmazonPayTab().getText());
	    	hp.ClickAmazonPayTab();
	    }
	}

	/*@Then("^User should see the respective details page$")
	public void user_should_see_the_respective_details_page() throws Throwable {
	   if(hp.getMobileTab().getText().equals("Mobile")) {
		  System.out.println(hp.getURL());
		   Assert.assertTrue("Passed", hp.getURL().contains("nav_cs_mobiles"));
	   }
	   else if(hp.getPantryTab().getText().equals("Pantry")) {
		   System.out.println(hp.getURL());
		   Assert.assertTrue("Passed", hp.getURL().contains("pantry"));
	}
	   else {
		  System.out.println(hp.getURL());
		 Assert.assertTrue("Passed", hp.getURL().contains("apay"));
	   }*/
	
	
	
	@Then("^User should see the respective details page$")
	public void user_should_see_the_respective_details_page() throws Throwable {
	    if(hp.getMobileTab().getText().equals("Mobile")) {
	    	System.out.println(hp.getURL());
	    	Assert.assertTrue("Passed", hp.getURL().contains("nav_cs_mobiles"));
	    }
	    else if(hp.getPantryTab().getText().equals("Pantry")) {
	    	System.out.println(hp.getURL());
	    	Assert.assertTrue("Passed", hp.getURL().contains("nav_cs_pantry"));
	    }
	    else if(hp.getAmazonPayTab().getText().equals("Amazon Pay")){
	    	System.out.println(hp.getURL());
	    	Assert.assertTrue("Passed", hp.getURL().contains("nav_cs_apay"));
	    }
	}
	}
