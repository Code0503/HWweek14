package com.parabank.demo.testsuite;

import com.parabank.demo.pages.RegisterPage;
import com.parabank.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
//    1.verifyThatSigningUpPageDisplay
//* click on the ‘Register’ link
//* Verify the text ‘Signing up is easy!’

   RegisterPage registerPage;
   // RegisterTest registerTest= new RegisterTest();
    @BeforeMethod
public void inIt(){
    registerPage = new RegisterPage();
}
    @Test
    public void verifyThatSigningUpPageDisplay(){
        /*1.verifyThatSigningUpPageDisplay
* click on the ‘Register’ link
* Verify the text ‘Signing up is easy!’*/
       registerPage.clickOnRegisterLink();
        registerPage.verifyUserOnRegisterPage("Signing up is easy!");
    }
    @Test
    public void userShouldRegisteranAccountSuccessfully(){

        registerPage.clickOnRegisterLink();
        registerPage.EnterFirstName("Dava"); //click on the ‘Register’ linkregisterPage.EnterFirstName("Java");
        registerPage.EnterLastname("Group"); //Enter First name
        registerPage.AddressStreet("Bark Road");//Enter Last name
        registerPage.EnterCityName("Fellingborough");//Enter Address
        registerPage.EnterState("England");//Enter City
        registerPage.EnterZipcode("NW1 4TW");
       registerPage.EnterPhonenumber("0345678900");
        registerPage.EnterSSN("GJ07 010 0210");
        registerPage.EnterUsername("Zava");
        registerPage.EnterPhonenumber("0123456");
        registerPage.ReEnterPassword("0123456");
        registerPage.ClickOnRegisterButton();
        registerPage.verifyUserIsRegiesterSuccess("If you have an account with us you can sign-up for free instant online access. You will have to provide some personal information.");

    }
}
