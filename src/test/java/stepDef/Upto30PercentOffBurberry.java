package stepDef;

import com.ActionPage.Upto30PercentOffBurberryAction;
import com.Uitility.Base_Class;

import cucumber.api.java.en.*;

public class Upto30PercentOffBurberry extends Base_Class {
	Upto30PercentOffBurberryAction upto30PercentOffBurberryAction = new Upto30PercentOffBurberryAction();

@And("^User click in the Brand Outlet  link$")
public void user_click_in_the_Brand_Outlet_link() throws Throwable {
	upto30PercentOffBurberryAction.user_click_in_the_Brand_Outlet_link();
}

@When("^User click in the  Up to (\\d+)% off Burberry$")
public void user_click_in_the_Up_to_off_Burberry(int arg1) throws Throwable {
	upto30PercentOffBurberryAction.user_click_in_the_Up_to_off_Burberry();
}

@Then("^Verify Up to (\\d+)% off Burberry page is display$")
public void verify_Up_to_off_Burberry_page_is_display(int arg1) throws Throwable {
	upto30PercentOffBurberryAction.verify_Up_to_off_Burberry_page_is_display();
}


}
