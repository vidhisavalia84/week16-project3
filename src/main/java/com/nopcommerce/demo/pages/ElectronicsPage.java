package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electonicTab ;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphonee ;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement cellPhoneMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listTab ;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-item']//img[@title='Show details for Nokia Lumia 1020']")
    WebElement nokiaLumia1020 ;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyPrice$349 ;

    @CacheLookup
    @FindBy(css = "#product_enteredQuantity_20")
    WebElement quantity  ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement  addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyMessage  ;

    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement  crossButton;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/cart'and@class='ico-cart']")
    WebElement shoppingCart ;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement gotoCartButton ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement messageShoppinCart ;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement  messageText2;

    @CacheLookup
    @FindBy(xpath = "//table[@class='cart-total']/tbody/tr[4]/td[2]")
    WebElement total$698  ;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfServiceButton ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut ;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement pleaseSignIn ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText ;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderButton ;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName ;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement  lastName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDate ;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month  ;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement  year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Company']")
    WebElement  company;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement  conformPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton ;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationMessage ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continue1 ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement  shoppingCart1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice'and@type='checkbox']")
    WebElement termasOfService1  ;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout1 ;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement  selectCountry;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city ;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1 ;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address2")
    WebElement  address2;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement  zipcode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber ;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FaxNumber")
    WebElement faxNumber;

    @CacheLookup
    @FindBy(name = "save")
    WebElement continue2 ;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement dayAir ;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement  continue3;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creitCardBtn ;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continue4 ;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement visa ;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName ;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber  ;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth ;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear ;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode ;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continue5 ;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement messageCreditCard ;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[2]")
    WebElement message2ndDayAir ;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement message698 ;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyou ;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulMessage ;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continue6 ;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement  lastMessage  ;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logout;

    public void mousehoverOnElectronicsTab() {
        Reporter.log("Mouse hover on electrinics "+electonicTab.toString());
        mouseHoverToElement(electonicTab);
    }
    public void mousehoverOnCellphoneAndClickOnCellphone() {
        Reporter.log("Mouse hover on cells phones and click "+cellphonee.toString());
        mouseHoverToElementAndClick(cellphonee);
    }
     public String cellPhoneMessage(){
        return getTextFromElement(cellPhoneMessage);
    }
    public void clickOnListViewTab() {
        Reporter.log("click on vista"+listTab.toString());
        clickOnElement(listTab);
    }
    public void clickOnNokiaLumia1020Cellphone() {
        Reporter.log("click on nokia lumia 1020"+nokiaLumia1020.toString());
        try {
            clickOnElement(nokiaLumia1020);
            // driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]")).click();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            clickOnElement(nokiaLumia1020);
        }
    }
    public String getNokiaLumia1020Message() {
        Reporter.log("Get nokia lumia 1020 text");
        return getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
    }
    public String verifyPrice$349() {
        Reporter.log("Verify price $349 "+verifyPrice$349.toString());
        return getTextFromElement(verifyPrice$349);
    }
    public void clearTextOfElement() {

        Actions actions = new Actions(driver);
        quantity.clear();
    }
    public void addQuantityOf2() {
        Reporter.log("Add quantity 2"+quantity.toString());
        sendTextToElement(quantity, "2");
    }
    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart button "+addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
    public String verifyMessage() {

        return getTextFromElement(verifyMessage);
    }
    public void clickOnCrossButton() {
        Reporter.log("Close the mesage"+crossButton.toString());
        clickOnElement(crossButton);
    }
    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on shopping cart "+shoppingCart.toString());
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCartButton() {
        Reporter.log("click on go to cart"+gotoCartButton.toString());
        clickOnElement(gotoCartButton);
    }
    public String verifyMessageShoppinCart() {
        Reporter.log("Verify text shopping cart "+messageShoppinCart.toString());
        return getTextFromElement(messageShoppinCart);
    }
    public String verifyMessageText2() {
        Reporter.log("Verify quantity 2"+messageText2.toString());
        return getTextFromElement(messageText2);
    }
    public String verifyTotal$698() {
        Reporter.log("Verify total $698"+total$698.toString());
        return getTextFromElement(total$698);
    }
    public void mouseHoverOnTermsOfServiceButtonAndClick() {
        Reporter.log("Click on terms of service "+termsOfServiceButton.toString());
        mouseHoverToElementAndClick(termsOfServiceButton);
    }
    public void clickOnCheckOutButton() {
        Reporter.log("Click on check out button "+checkOut.toString());
        clickOnElement(checkOut);
    }
    public String VerifyPleaseSignIn() {
        Reporter.log("Verify sign in text "+pleaseSignIn.toString());
        return getTextFromElement(pleaseSignIn);
    }
    public void clickOnRegister() {
        Reporter.log("Click on register "+register.toString());
        clickOnElement(register);
    }
    public String verifyRegisterText() {
        Reporter.log("Verify register text "+registerText.toString());
        return getTextFromElement(registerText);
    }
    public void clickOnGenderButton() {
        Reporter.log("Select gender"+genderButton.toString());
        clickOnElement(genderButton);
    }
    public void enterFirstName(String name) {
        Reporter.log("Enter first name "+firstName.toString());
        sendTextToElement(firstName, name);
    }
    public void enterLasttName(String name) {
        Reporter.log("Enter last name "+lastName.toString());
        sendTextToElement(lastName, name);
    }
    public void enterBirthDate() {
        Reporter.log("Enter birth date "+birthDate.toString());
        selectByValueFromDropDown(birthDate,"10");

    }
    public void enterBirthMonth() {
        Reporter.log("Enter birth month "+month.toString());
        selectByValueFromDropDown(month,"2");
    }
    public void enterBirthYear() {
        Reporter.log("Enter birth year "+year.toString());
        selectByValueFromDropDown(year,"1956");

    }
    public void enterEmail(String emailaddress) {
        Reporter.log("Enter email "+email.toString());
        sendTextToElement(email, emailaddress);
    }
    public void enterCompanyName(String companyName) {
        Reporter.log("Enter company name "+companyName.toString());
        sendTextToElement(company, companyName);
    }
    public void enterPassword(String passwordText) {
        Reporter.log("Enter password "+password.toString());
        sendTextToElement(password, passwordText);
    }
    public void enterConformPassword(String password) {
        Reporter.log("Conform password"+conformPassword.toString());
        sendTextToElement(conformPassword, password);
    }
    public void clickOnRegisterButton() {
        Reporter.log("Click on register button "+registerButton.toString());
        clickOnElement(registerButton);
    }
    public String verifyRegistrationMessage() {
        Reporter.log("Verify registration message "+registrationMessage.toString());
        return getTextFromElement(registrationMessage);
    }
    public void clickContinue1() {
        Reporter.log("click on continue "+continue1.toString());
        clickOnElement(continue1);
    }
    public String verifyShoppingCartText1() {
        Reporter.log("Verify message "+shoppingCart1.toString());
        return getTextFromElement(shoppingCart1);
    }
    public void clickOnTermsofService1() {
        Reporter.log("Click on terms of services "+termasOfService1.toString());
        //clickOnElement(termasOfService);
        clickOnElement(termasOfService1);
    }
    public void clickOnCheckOut1(){
        Reporter.log("Click on chechout "+checkout1.toString());
        clickOnElement(checkout1);
    }

    public void selectCountry() {
        Reporter.log("Select country"+selectCountry.toString());
        selectByValueFromDropDown(selectCountry,"12");

    }
    public void enterCity(String name) {
        Reporter.log("enter city "+city.toString());
        sendTextToElement(city, name);
    }
    public void enterAddress1(String add1) {
        Reporter.log("Enter address "+address1.toString());
        sendTextToElement(address1, add1);
    }
    public void enterAddress2(String add2) {
        Reporter.log("Enter address "+address2.toString());
        sendTextToElement(address2, add2);
    }

    public void enterZipCode(String zip) {
        Reporter.log("Enter zipcode "+zipcode.toString());
        sendTextToElement(zipcode, zip);
    }

    public void enterPhoneNumber(String num) {
        Reporter.log("Enter phone number "+phoneNumber.toString());
        sendTextToElement(phoneNumber, num);
    }

    public void enterFaxNumber(String num) {
        Reporter.log("Enter fax number "+faxNumber.toString());
        sendTextToElement(faxNumber, num);
    }

    public void clickOnContinue2() {
        Reporter.log("click on continue "+continue2.toString());
        clickOnElement(continue2);
    }
    public void clickOn2ndDayAirButton() {
        Reporter.log("click on 2nd day air"+dayAir.toString());
        clickOnElement(dayAir);
    }

    public void clickOnContinue3() {
        Reporter.log("Click on continue "+continue3.toString());
        clickOnElement(continue3);
    }

    public void selectRadioButton() {
        Reporter.log("Select credit card radio button "+creitCardBtn.toString());
        clickOnElement(creitCardBtn);
    }
    public void clickOnContinue4() {
        Reporter.log("Click on continue"+continue4.toString());
        clickOnElement(continue4);
    }
    public void selectVisaFromCreditCardDropDown() {
        Reporter.log("Select visa"+visa.toString());
        selectByValueFromDropDown(visa,"visa");
    }
    public void enterCardHolderName(String name) {
        Reporter.log("Enter card holder name "+cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }
    public void enterCardNumber(String name) {
        Reporter.log("Enter card number "+cardNumber.toString());
        sendTextToElement(cardNumber, name);
    }
    public void selectExpireMonth(String name) {
        Reporter.log("Select expire month"+expireMonth.toString());
        selectByValueFromDropDown(expireMonth, name);
    }
    public void selectExpireYear(String name) {
        Reporter.log("Select expire year"+expireYear.toString());
        selectByValueFromDropDown(expireYear, name);
    }
    public void enterCardCode(String num) {
        Reporter.log("Enter card code "+cardCode.toString());
        sendTextToElement(cardCode,num);
    }
    public void clickOnContinue5() {
        Reporter.log("click on continue "+continue5.toString());
        clickOnElement(continue5);
    }
    public String verifymessageCreditCard() {
        Reporter.log("verify text credit card"+messageCreditCard.toString());
        return getTextFromElement(messageCreditCard);
    }
    public String verifymessage2ndDayAir() {
        Reporter.log("Verify text 2nd day air"+message2ndDayAir.toString());
        return getTextFromElement(message2ndDayAir);
    }
    public String verifymessage698() {
        Reporter.log("verify text 698"+message698.toString());
        return getTextFromElement(message698);
    }
    public void conformTransaction() {
        Reporter.log("click on conform"+conform.toString());
        clickOnElement(conform);
    }

    public String verifyMessageThankYou(){
        Reporter.log("Verify thank you text "+thankyou.toString());
        return getTextFromElement(thankyou);
    }

    public String verifyMessageSuccessful(){
        Reporter.log("Verify message "+successfulMessage.toString());
        return getTextFromElement(successfulMessage);
    }
    public void clickOnContinue6(){
        Reporter.log("click on continue "+continue6.toString());
        clickOnElement(continue6);
    }
    public String verifyMessageWelcomeToOurStore(){
        Reporter.log("Verify message "+lastMessage.toString());
        return getTextFromElement(lastMessage);
    }

public String urlMessage(){
        return driver.getCurrentUrl();
}





}
