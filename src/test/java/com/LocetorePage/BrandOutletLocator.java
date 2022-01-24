package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class BrandOutletLocator extends Base_Class{
	
	public BrandOutletLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	             @FindBy(how = How.CSS, using ="*[_sp='m570.l47233']")
		             public WebElement BrandOutletLink;
	             
	             @FindBy(how = How.CSS, using ="[class='b-pageheader__text']")
	             public WebElement BrandOutletpage;

}
