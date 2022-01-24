package stepDef;

import com.ActionPage.HomePageAction;
import com.ActionPage.SearchPageAction;
import com.ActionPage.VerifyPageAction;

import com.Uitility.Base_Class;


import cucumber.api.java.en.*;

public class SearchFieldEmpty extends Base_Class {
	HomePageAction homePageAction = new HomePageAction();
	SearchPageAction searchPageAction = new  SearchPageAction();
	VerifyPageAction verifyPageAction = new VerifyPageAction();
	
	@And("^User Do not Enter anyting in the search field$")
	public void user_Do_not_Enter_anyting_in_the_search_field() throws Throwable {
		homePageAction.user_Do_not_Enter_anyting_in_the_search_field();
	    
	}

	@When("^User click in the Search button$")
	public void click_in_the_Search_button() throws Throwable {
		homePageAction.click_in_the_Search_button();
		
	}

	@Then("^Verify user item is not display and warning message pop up$")
	public void verify_user_item_is_not_display_and_warning_message_pop_up() throws Throwable {
		verifyPageAction.verify_user_item_is_not_display_and_warning_message_pop_up();
	   
	}
}
