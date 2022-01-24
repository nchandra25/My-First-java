package com.ActionPage;

import org.testng.Assert;

import com.LocetorePage.Upto30PercentOffBurberryLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;

public class Upto30PercentOffBurberryAction extends Base_Class{
	 Upto30PercentOffBurberryLocator  upto30PercentOffBurberryLocator = new  Upto30PercentOffBurberryLocator();
	 
	 
	 public void user_click_in_the_Brand_Outlet_link() {
		 upto30PercentOffBurberryLocator.BrandOutletLink.click();
	 }
	 public void user_click_in_the_Up_to_off_Burberry() {
		 upto30PercentOffBurberryLocator.BurberryUpto30offLink.click(); 
	 }
	 public void verify_Up_to_off_Burberry_page_is_display() {
	boolean Upto30offDisplay = upto30PercentOffBurberryLocator.BurberryUpto30offDisplay.isDisplayed();
	Assert.assertTrue(Upto30offDisplay);
	Utiliti.takescreenshot(driver, "Up to30% Off Burberry");
	 }
}
