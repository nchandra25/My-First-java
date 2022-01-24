package stepDef;

import com.ActionPage.DailyDealsPageFashionLinkAction;
import com.Uitility.Base_Class;

import cucumber.api.java.en.*;


public class DailyDealsPageFashionLink extends Base_Class{
	DailyDealsPageFashionLinkAction dailyDealsPageFashionLinkAction = new DailyDealsPageFashionLinkAction();
	
	@And("^User click Daily Deals link$")
	public void user_click_Daily_Deals_link() throws Throwable {
		dailyDealsPageFashionLinkAction.user_click_Daily_Deals_link();
	}

	@Then("^User Mouse Over to the Fashion Link$")
	public void user_Mouse_Over_to_the_Fashion_Link() throws Throwable {
		dailyDealsPageFashionLinkAction.user_Mouse_Over_to_the_Fashion_Link();
	}

	@Then("^User click in 'Men's Shoes' link$")
	public void user_click_in_Men_s_Shoes_link() throws Throwable {
		dailyDealsPageFashionLinkAction.user_click_in_Men_s_Shoes_link();
	}

	@And("^Verify Men's Shoes page is display$")
	public void verify_Men_s_Shoes_page_is_display() throws Throwable {
		dailyDealsPageFashionLinkAction.verify_Men_s_Shoes_page_is_display();
	}

}
