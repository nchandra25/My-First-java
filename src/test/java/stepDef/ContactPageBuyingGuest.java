package stepDef;

import com.ActionPage.ContactPageBuyingGuestAction;
import com.Uitility.Base_Class;

import cucumber.api.java.en.*;

public class ContactPageBuyingGuest extends Base_Class {
	ContactPageBuyingGuestAction contactPageBuyingGuestAction = new ContactPageBuyingGuestAction();
	
	@And("^User click in the Help & Contact  link$")
	public void user_click_in_the_Help_Contact_link() throws Throwable {
		contactPageBuyingGuestAction.user_click_in_the_Help_Contact_link();
	}

	@Then("^User  click Buying as a guest$")
	public void user_click_Buying_as_a_guest() throws Throwable {
		contactPageBuyingGuestAction.user_click_Buying_as_a_guest();
	}

	@Then("^Verify Buying as a guest  page is display$")
	public void verify_Buying_as_a_guest_page_is_display() throws Throwable {
		contactPageBuyingGuestAction.verify_Buying_as_a_guest_page_is_display();
	}
}
