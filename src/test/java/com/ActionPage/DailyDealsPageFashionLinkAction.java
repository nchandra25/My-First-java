package com.ActionPage;



import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.LocetorePage.DailyDealsPageFashionLinkLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;

public class DailyDealsPageFashionLinkAction extends Base_Class{
	DailyDealsPageFashionLinkLocator dailyDealsPageFashionLinkLocator = new DailyDealsPageFashionLinkLocator();
	
	public void user_click_Daily_Deals_link() {
		dailyDealsPageFashionLinkLocator.DailyDealsLinkClick.click();
	}
	public void user_Mouse_Over_to_the_Fashion_Link() {
		Actions action = new Actions(driver);
		action.moveToElement(dailyDealsPageFashionLinkLocator.MouseOvertotheFashionLink).build().perform();
		
	}
	public void user_click_in_Men_s_Shoes_link() {
		dailyDealsPageFashionLinkLocator.MenShoesLinkClick.click();
	}
	public void verify_Men_s_Shoes_page_is_display() {
		boolean verifyMensShoes = dailyDealsPageFashionLinkLocator.VerifyMensShoes.isDisplayed();
		Assert.assertTrue(verifyMensShoes);
		Utiliti.takescreenshot(driver, "Men's Shoespage display");
	}
}
