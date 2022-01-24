package stepDef;

import com.ActionPage.HelpAndContactAction;
import com.Uitility.Base_Class;

import cucumber.api.java.en.*;

public class HelpAndContact extends Base_Class {
	HelpAndContactAction helpAndContactAction = new HelpAndContactAction();
	
	
	@And("^User User click in the Help & Contact  link$")
	public void user_User_click_in_the_Help_Contact_link() throws Throwable {
		helpAndContactAction.user_User_click_in_the_Help_Contact_link();
	}

	@Then("^Verify Help & Contact page is display$")
	public void verify_Help_Contact_page_is_display() throws Throwable {
		helpAndContactAction.verify_Help_Contact_page_is_display();
	}

}
