package stepDef;

import com.ActionPage.BrandOutletAction;
import com.Uitility.Base_Class;

import cucumber.api.java.en.*;

public class BrandOutlet extends Base_Class {
	BrandOutletAction brandOutletAction = new BrandOutletAction();
	
	
	@And("^User click in the Brand Outlet link$")
	public void user_click_in_the_Brand_Outlet_link() throws Throwable {
		brandOutletAction.user_click_in_the_Brand_Outlet_link();
	    
	}

	@Then("^Verify Brand Outlet page is display$")
	public void verify_Brand_Outlet_page_is_display() throws Throwable {
		brandOutletAction.verify_Brand_Outlet_page_is_display();
	}


}
