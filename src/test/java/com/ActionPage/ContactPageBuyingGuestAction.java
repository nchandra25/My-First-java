package com.ActionPage;

import org.testng.Assert;

import com.LocetorePage.ContactPageBuyingGuestLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;



public class ContactPageBuyingGuestAction extends Base_Class {
	
	ContactPageBuyingGuestLocator contactPageBuyingGuestLocator = new ContactPageBuyingGuestLocator();
	
	public void user_click_in_the_Help_Contact_link() {
		contactPageBuyingGuestLocator.HelpAndContactLinkClick.click();
		
	}
	public void user_click_Buying_as_a_guest() {
		contactPageBuyingGuestLocator.BuyingAsAGuest.click();
	}
	public void verify_Buying_as_a_guest_page_is_display() {
		boolean verifyBuyingAsAGuest = contactPageBuyingGuestLocator.VerifyBuyingAsAGuest.isDisplayed();
		Assert.assertTrue(verifyBuyingAsAGuest);
		Utiliti.takescreenshot(driver, "Buying As A Guest");
	}
}
