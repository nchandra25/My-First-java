package com.ActionPage;

import com.LocetorePage.HomePageLocator;
import com.Uitility.Base_Class;

public class HomePageAction extends Base_Class {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
        public void EnterWatchForMenIntheSearchfield() {
        	homePageLocator.WatchForMenIntheSearchfield.sendKeys("Watch for men");
        	
        }
        public void user_click_in_the_Search_button() {
        	homePageLocator.clickintheSearchbutton.click();
        }
        public void user_Do_not_Enter_anyting_in_the_search_field() {
        	homePageLocator.DonotEnteranytinginthesearchfield.sendKeys("  ");
        	
        }
        public void click_in_the_Search_button() {
        	homePageLocator.userclickintheSearchbutton.click();
        }
}