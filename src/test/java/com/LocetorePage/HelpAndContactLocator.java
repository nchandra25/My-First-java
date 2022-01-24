package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class HelpAndContactLocator extends Base_Class {
	public HelpAndContactLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	             @FindBy(how = How.CSS, using ="*[_sp='m570.l1545']")
		             public WebElement HelpAndContactLink;
	             
	             @FindBy(how = How.ID, using = "gh-title")
	                 public WebElement HelpAndContactPage;

}
