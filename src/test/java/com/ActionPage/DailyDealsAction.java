package com.ActionPage;

import org.testng.Assert;

import com.LocetorePage.DailyDealsPageLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;

public class DailyDealsAction extends Base_Class {
	DailyDealsPageLocator dailyDealsPageLocator = new DailyDealsPageLocator();
	
	public void user_click_in_the_Daily_Deals_link() {
		dailyDealsPageLocator.DailyDealsLink.click();
	}
	public void verify_Daily_Deals_page_is_display() {
		boolean DailyDeal = dailyDealsPageLocator.DailyDealpage.isDisplayed();
		Assert.assertTrue(DailyDeal);
		Utiliti.takescreenshot(driver, "Daily Dealpage Page");
	}
	

}
