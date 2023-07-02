package com.parabank.demo.testsuite;

import com.parabank.demo.pages.HomePage;
import com.parabank.demo.pages.LoginPage;
import com.parabank.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
HomePage homePage;
LoginPage loginPage;
@BeforeMethod
public void inIt(){
    homePage = new HomePage();
    loginPage = new LoginPage();
}
@Test(groups = "smoke")
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    loginPage.loginToApplication("Ten","Ben0101");
    loginPage.clickOnLoginButton();
    loginPage.verifyUserIsLogin("Accounts Overview");

}
@Test(groups = "sanity")
public void userShouldLoginSuccessfullyWithInValidCredentials(){
    loginPage.loginToApplication("pav","23456");
    loginPage.clickOnLoginButton();
    loginPage.verifyUserIsLogin("Error!");

}
@Test(groups = "regssion")
public void userShouldLogOutSuccessfully(){
    loginPage.loginToApplication("Ten","Ben0101");
    loginPage.clickOnLoginButton();
    loginPage.clickOnLogoutButton();
    loginPage.verifyUserLogedOut("Customer Login");
}
}
