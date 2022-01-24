package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class SearchPageLocator extends Base_Class {
	public SearchPageLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	             @FindBy(how = How.CSS, using ="[class='@ebay/follow-ebay follow-inline']")
		         public WebElement WatchProductisdisply;
	             
	            

}
