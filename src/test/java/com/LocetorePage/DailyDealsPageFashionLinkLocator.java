package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class DailyDealsPageFashionLinkLocator extends Base_Class{
	public DailyDealsPageFashionLinkLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	             @FindBy(how = How.CSS, using ="*[_sp='m570.l3188']")
		         public WebElement DailyDealsLinkClick;
	             
	             @FindBy(how = How.XPATH, using ="//span[text()='Fashion']")
	             public WebElement  MouseOvertotheFashionLink ;
                
	             @FindBy(how = How.LINK_TEXT, using ="Men's Shoes")
	             public WebElement  MenShoesLinkClick ;
	             
	             @FindBy(how = How.CSS, using ="*[class='expand-btn__cell']")
	             public WebElement  VerifyMensShoes ;
}
