package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class VerifyPageLocator extends Base_Class{

		public VerifyPageLocator() {
		   	 PageFactory.initElements(driver , this);
		    }
			
		             @FindBy(how = How.CSS, using ="*[class='s-message__content']")
			             public WebElement WarningMessagePopUp;
		             
		             

}
