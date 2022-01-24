package com.ActionPage;

import org.testng.Assert;

import com.LocetorePage.VerifyPageLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;

public class VerifyPageAction extends Base_Class{
	VerifyPageLocator verifyPageLocator =new VerifyPageLocator();
	
	
	
	public void verify_user_item_is_not_display_and_warning_message_pop_up() {
		boolean WarningMessage =  verifyPageLocator.WarningMessagePopUp.isDisplayed();
		Assert.assertTrue(WarningMessage);
		Utiliti.takescreenshot(driver, "warning message pop up");
	}

}
