package stepDef;

import com.ActionPage.DailyDealsAction;
import com.Uitility.Base_Class;

import cucumber.api.java.en.*;

public class DailyDealsPage extends Base_Class {
	DailyDealsAction dailyDealsAction = new DailyDealsAction();

	
	
	
	

    @And("^User click in the Daily Deals link$")
    public void user_click_in_the_Daily_Deals_link() throws Throwable {
    	dailyDealsAction.user_click_in_the_Daily_Deals_link();
    }

    @Then("^Verify Daily Deals page is display$")
    public void verify_Daily_Deals_page_is_display() throws Throwable {
    	dailyDealsAction.verify_Daily_Deals_page_is_display();
}

}
