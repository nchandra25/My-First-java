package com.LocetorePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Uitility.Base_Class;

public class HomePageLocator extends Base_Class {
	public HomePageLocator() {
   	 PageFactory.initElements(driver , this);
    }
	
             @FindBy(how = How.ID, using ="gh-ac")
	             public WebElement WatchForMenIntheSearchfield;
             
             @FindBy(how = How.ID, using = "gh-btn")
                 public WebElement clickintheSearchbutton;
             
             @FindBy(how = How.ID, using ="gh-ac")
             public WebElement DonotEnteranytinginthesearchfield;
             
             @FindBy(how = How.ID, using = "gh-btn")
             public WebElement userclickintheSearchbutton;
}
