package com.ActionPage;

import org.testng.Assert;

import com.LocetorePage.HelpAndContactLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;

public class HelpAndContactAction extends Base_Class{
	HelpAndContactLocator helpAndContactLocator = new HelpAndContactLocator();
	
	public void user_User_click_in_the_Help_Contact_link() {
		helpAndContactLocator.HelpAndContactLink.click();
	}
	public void verify_Help_Contact_page_is_display() {
	boolean helpAndContact = helpAndContactLocator.HelpAndContactPage.isDisplayed();
	
	Assert.assertTrue(helpAndContact);
	Utiliti.takescreenshot(driver, "Help & Contact Page");
	}
}
