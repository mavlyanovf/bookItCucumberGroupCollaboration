package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "email")
    public WebElement emailLocator;

    @FindBy(name = "password")
    public WebElement passwordLocator;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButtonLocator;


//    public void login(){
//        String username = ConfigurationReader.getProperty("storemanagerusername");
//        String password = ConfigurationReader.getProperty("storemanagerpassword");
//        emailLocator.sendKeys(username);
//        passwordLocator.sendKeys(password);
//        signInButtonLocator.click();
//    }

    public void login(String username, String password){
        emailLocator.sendKeys(username);
        passwordLocator.sendKeys(password);
        signInButtonLocator.click();
    }




}
