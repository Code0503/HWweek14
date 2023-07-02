package com.parabank.demo.pages;

import com.parabank.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
@CacheLookup
        @FindBy(linkText = "Log in")
    WebElement loginLink;



    public void clickOnLoginLink() {
        log.info("Click on Login Link :" + loginLink.toString());
        clickOnElement(loginLink);
    }



}


