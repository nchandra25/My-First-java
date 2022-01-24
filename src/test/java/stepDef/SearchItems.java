package stepDef;



import com.ActionPage.HomePageAction;
import com.ActionPage.SearchPageAction;
import com.Uitility.Base_Class;

import cucumber.api.java.en.*;

public class SearchItems extends Base_Class{
	
	HomePageAction homePageAction = new HomePageAction();
	SearchPageAction searchPageAction = new  SearchPageAction();
	
	@Given("^Lanch dell \"([^\"]*)\"$")
	public void lanch_dell(String URL) throws Throwable {
		launchURL(URL);
		 
	}
	   
	@And("^User Enter Watch For Men In the Search field$")
		public void user_Enter_Watch_For_Men_In_the_Search_field() throws Throwable { 
		homePageAction.EnterWatchForMenIntheSearchfield();
	}

	@When("^User click in the  Search button$")
	public void user_click_in_the_Search_button() throws Throwable {
		homePageAction.user_click_in_the_Search_button();
	}

	@Then("^Verify Watch Product is disply$")
	public void verify_Watch_Product_is_disply() throws Throwable {
		searchPageAction.verify_Watch_Product_is_disply();
	}



}
