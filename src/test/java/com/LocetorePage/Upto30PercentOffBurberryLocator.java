package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class Upto30PercentOffBurberryLocator extends Base_Class{
      
	
	public Upto30PercentOffBurberryLocator() {
	   	 PageFactory.initElements(driver , this);
	    }
		
	@FindBy(how = How.CSS, using ="*[_sp='m570.l47233']")
    public WebElement BrandOutletLink;
	
	@FindBy(how = How.XPATH, using ="//a[text()='Burberry - Up to 30% off']")
    public WebElement BurberryUpto30offLink;
	
	@FindBy(how = How.CSS, using ="*[class='title-banner__title']")
    public WebElement BurberryUpto30offDisplay;
}

