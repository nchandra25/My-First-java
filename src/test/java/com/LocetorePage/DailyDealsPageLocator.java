package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;


public class DailyDealsPageLocator extends Base_Class{

	public DailyDealsPageLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	             @FindBy(how = How.CSS, using ="*[_sp='m570.l3188']")
		             public WebElement DailyDealsLink;
	             
	             @FindBy(how = How.XPATH, using ="//a[ text()='Deals']")
	             public WebElement DailyDealpage;
}
	             