package com.ActionPage;

import com.LocetorePage.SearchPageLocator;
import com.Uitility.Base_Class;
import com.Uitility.Utiliti;

import junit.framework.Assert;

public class SearchPageAction extends Base_Class{
	SearchPageLocator searchPageLocator = new SearchPageLocator();
	
	
	 public void verify_Watch_Product_is_disply() {
		 boolean Watch = searchPageLocator.WatchProductisdisply.isDisplayed();
		 Assert.assertTrue(Watch);
		 Utiliti.takescreenshot(driver, "Watch Item Display");
	 }

}
