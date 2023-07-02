package com.parabank.demo.pages;

import com.parabank.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @CacheLookup
            @FindBy (xpath = "//div[@id='loginPanel']/p[2]/a")
    WebElement registerLink;
    @CacheLookup
            @FindBy (id="customer.firstName")
    WebElement Firstname;
    @CacheLookup
            @FindBy (id="customer.lastName")
    WebElement Lastname;
    @CacheLookup
            @FindBy (id="customer.address.street")
    WebElement Address;
    @CacheLookup
            @FindBy (id="customer.address.city")
    WebElement City;
    @CacheLookup
            @FindBy (id="customer.address.state")
    WebElement AddressState;
    @CacheLookup
            @FindBy (id="customer.address.zipCode")
    WebElement Zipcode;
    @CacheLookup
            @FindBy (id="customer.phoneNumber")
    WebElement PhoneNumber;
   @CacheLookup
           @FindBy (id="customer.ssn")
    WebElement ssn;
   @CacheLookup
           @FindBy (id="customer.username")
     WebElement Username;
    @CacheLookup
            @FindBy (id="customer.password")
    WebElement Password;
   @CacheLookup
           @FindBy (id="repeatedPassword")
    WebElement ConfirmPassowrd;
   @CacheLookup
           @FindBy (xpath="//table[@class='form2']/tbody/tr[13]//input")
    WebElement RegisterButton;
   @CacheLookup
   @FindBy (xpath="//div[@id='rightPanel']/h1")
   WebElement RegisterPageText;
   @CacheLookup
   @FindBy (css="div#rightPanel>p")
   WebElement RegisterSuccessfull;


    public void clickOnRegisterLink() {
        log.info("Click on Register Link : "+registerLink.toString());
        clickOnElement(registerLink);
    }
    public void EnterFirstName(String entername){
        log.info("Enter firstname : "+Firstname.toString());
        sendTextToElement(Firstname,entername);
    }
    public void EnterLastname(String enterLastname){
        log.info("Enter lastname : "+Lastname.toString());
        sendTextToElement(Lastname,enterLastname);
    }
    public void AddressStreet(String EnterStreet){
        log.info("Enter first line of the address : "+Address.toString());
        sendTextToElement(Address,EnterStreet);
    }
    public void EnterCityName(String EnterCity){
        Reporter.log("Enter City" +City.toString() + "<br>");
        sendTextToElement(City,EnterCity);
    }
    public void EnterState(String stateName){
       log.info("Enter State" + AddressState.toString());
        sendTextToElement(AddressState,stateName);
    }
    public void EnterZipcode(String zipcode){
        log.info("Enter PostCode" + Zipcode.toString());
        sendTextToElement(Zipcode,zipcode);
    }
    public void EnterPhonenumber(String phoneNumber){
        Reporter.log("Enter Phonenumber" + PhoneNumber.toString() + "<br>");
        sendTextToElement(PhoneNumber,phoneNumber);
    }
    public void EnterSSN(String enterSSN){
        log.info("Enter SSN" + ssn.toString());
        sendTextToElement(ssn,enterSSN);
    }
    public void verifyUserOnRegisterPage(String Expected){
        log.info("Verify  user on Register page: "+RegisterPageText.toString());
        verifyText(Expected,RegisterPageText);
    }
    public void verifyUserIsRegiesterSuccess(String expected){
        log.info("Verify registration is successful: "+RegisterSuccessfull.toString());
        verifyText(expected,RegisterSuccessfull);
    }
    public void EnterUsername(String PassUsername){
     log.info("Enter username" + Username.toString());
     sendTextToElement(Username,PassUsername);
    }
    public void EnterPassword(String enterPassword){
        log.info("Enter Password" + Password.toString());
        sendTextToElement(Password,enterPassword);
    }
    public void ReEnterPassword(String reEnterPassword){
        log.info("Enter confirm password" + ConfirmPassowrd.toString());
        sendTextToElement(ConfirmPassowrd,reEnterPassword);
    }
    public void ClickOnRegisterButton(){
        clickOnElement(RegisterButton);
    }

}
