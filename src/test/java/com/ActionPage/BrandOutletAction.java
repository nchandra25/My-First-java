package com.ActionPage;

import org.testng.Assert;

import com.LocetorePage.BrandOutletLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;

public class BrandOutletAction extends Base_Class {
	BrandOutletLocator brandOutletLocator = new BrandOutletLocator();
	
	public void user_click_in_the_Brand_Outlet_link() {
		brandOutletLocator.BrandOutletLink.click();
	}
	public void verify_Brand_Outlet_page_is_display() {
	boolean brandOutletpage =	brandOutletLocator.BrandOutletpage.isDisplayed();
	Assert.assertTrue(brandOutletpage);
	
	Utiliti.takescreenshot(driver, "Brand Outlet page");
	}
}
