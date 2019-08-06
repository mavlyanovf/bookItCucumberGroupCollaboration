package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//commented
public class MapPage {

    public MapPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (className = "title")
    public WebElement mapPageNameLocator;
}
