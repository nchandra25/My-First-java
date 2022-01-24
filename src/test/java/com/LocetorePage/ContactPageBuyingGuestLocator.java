package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class ContactPageBuyingGuestLocator extends Base_Class{

	public ContactPageBuyingGuestLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	             @FindBy(how = How.CSS, using ="*[_sp='m570.l1545']")
		          public WebElement HelpAndContactLinkClick;
	             
	             @FindBy(how = How.XPATH, using ="//h2[text()='Buying as a guest ']")
	             public WebElement BuyingAsAGuest;
	             
	             @FindBy(how = How.XPATH, using ="//h1[text()='Buying as a guest ']")
	             public WebElement VerifyBuyingAsAGuest;
}
