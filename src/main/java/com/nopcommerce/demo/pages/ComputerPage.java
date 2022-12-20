package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    private static final Logger log= LogManager.getLogger(ComputerPage.class);
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computertab;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopTab;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement selectPosition;

    @CacheLookup
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add to cart'])[3]")
    // @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyTextBuildYourOwnComputer;

    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement sortProcessor;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_1']//option[2]")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(xpath = "//select[@data-attr ='2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//option[@data-attr-value ='5']")
    WebElement select8Gb;

    @CacheLookup
    @FindBy(xpath = "//label[@for ='product_attribute_3_7']")
    WebElement selectHddRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@id ='product_attribute_4_9']")
    WebElement selectOSradio;

    @CacheLookup
    @FindBy(xpath = "//input[@id ='product_attribute_5_10']")
    WebElement selectMicrosoftOffice;

    @CacheLookup
    @FindBy(xpath = "//input[@id ='product_attribute_5_12']")
    WebElement selectTotalCommander;

    @CacheLookup
    @FindBy(xpath = "//span[@id ='price-value-1']")
    WebElement verifyPrice;

    @CacheLookup
    @FindBy(xpath = "//button[@id ='add-to-cart-button-1']")
    WebElement clickOnAddToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyTheMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyShoppingCartMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTextWelcome;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany;
    // By sendTextToCompany = By.id("BillingNewAddress_Company");

    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;

    @FindBy(id = "CreditCardType")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement clickOnMasterCard;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholdername;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;

    @FindBy(id = "ExpireYear")
    WebElement expireYear;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;

    @CacheLookup
    @FindBy(css = "//button[normalize-space()='Confirm']")
    WebElement continueButton3;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement creditCardMessage;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement nextDayAirMessage;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement finalAmountMessage;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouMessage;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement finalMessage;


    public void clickOnComputerTab() {
        log.info("click on Computer tab"+computertab.toString());
        clickOnElement(computertab);
    }

    public void clickOnDesktop() {
        log.info("Click onDesktop "+ desktopTab.toString());
        clickOnElement(desktopTab);
    }

    /* public void clickOnSortByPosition() {
       clickOnElement(sortByPosition);
   }*/
    public void selectOptionAtoZFromList() {
        log.info("Select option Z to A"+selectPosition.toString());
        selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");

    }

    public void addToCartButton() {
try {


        clickOnElement(addToCart);
    }catch (StaleElementReferenceException ex){
    clickOnElement(addToCart);
}
    }

    public String verifyTextBuildYourOwnComputer() {
        log.info("Verify Text build your own computer"+verifyTextBuildYourOwnComputer.toString());
        return getTextFromElement(verifyTextBuildYourOwnComputer);
    }

    public void clickOnProcessorfeildDropDown() {
        log.info("Click on sort processor "+sortProcessor.toString());
        clickOnElement(sortProcessor);
    }

    public void selectProcessorFromDropDownList() {
        log.info("Select processor "+selectProcessor.toString());
        clickOnElement(selectProcessor);
    }

    public void selectRamFromDropDownList() {
        log.info("Select ram "+selectRam.toString());
        clickOnElement(selectRam);
    }

    public void select8GBFromDropDown() {
        log.info("Select 8GB "+select8Gb.toString());
        clickOnElement(select8Gb);
    }

    public void selectHddRadioButton() {
        log.info("Select HDD Radio Button "+selectHddRadio.toString());
        clickOnElement(selectHddRadio);
    }

    public void selectOSradioVistaPremiumButton() {
        log.info("Select OS radio vista premium button "+selectOSradio.toString());
        clickOnElement(selectOSradio);
    }

    public void selectMicrosoftOffice() {
        log.info("Select microsoft office "+selectMicrosoftOffice.toString());
        clickOnElement(selectMicrosoftOffice);
    }

    public void setSelectTotalCommanderCheckBox() {
        log.info(" Select totla commander checkbox"+selectTotalCommander.toString());
        clickOnElement(selectTotalCommander);
    }

    public String verifyMessage() {
        // Thread.sleep(1000);
        log.info("Verify message "+verifyPrice.toString());
        return getTextFromElement(verifyPrice);
    }

    public void clickAgainOnAddToCartButton() {
        log.info("Click on add to cart button "+clickOnAddToCart.toString());
        clickOnElement(clickOnAddToCart);
    }

    public String verifyTheMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    public void closeMessageTextButton() {
        log.info("Close message button "+closeButton.toString());
        clickOnElement(closeButton);
    }

    public String verifyShoppingCartMessage() {
        log.info("Verify shopping cart message "+verifyShoppingCartMessage.toString());
        return getTextFromElement(verifyShoppingCartMessage);
    }

    public void mouseHoverOnElementShoppingCart() {
        log.info("Mouse hover on shopping cart"+mouseHoverOnShoppingCart.toString());
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }

    public void clickOnGoToCart() {
        log.info("Click on go to cart "+clickOnAddToCart.toString());
        clickOnElement(clickOnGoToCart);
    }

    public String verifyMessageShoppingCart() {
        log.info("Verify message shoppingcart "+verifyShoppingCartMessage.toString());
        return getTextFromElement(verifyMessageShoppingCart);
    }

    public void clearTextInQuantityField() {
        log.info("Clear text in quantity field "+clearText.toString());
        Actions actions = new Actions(driver);
        clearText.clear();
    }

    public void sendTextToQuantityField() {
        log.info("Send text to quantity "+sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }

    public void clickOnUpdateShoppingCartButton() {
        log.info("Click on update shopping cart "+clickOnUpdateShoppingCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }

    public String verifyTotal() {
        log.info("Verify total"+verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        log.info("click On CheckBox I agree with terms and condition"+clickOnCheckbox.toString());
        clickOnElement(clickOnCheckbox);
    }

    public void clickOnCheckOutButton() {
        log.info("Click on check box "+clickOnCheckbox.toString());
        clickOnElement(clickOnCheckout);
    }

    public String verifyWelcometText() {
        log.info("Wel come text "+verifyTextWelcome.toString());
        return getTextFromElement(verifyTextWelcome);
    }
    public void clickOnCheckOutAsGuest() {
        log.info("Click on checkout as guest "+clickOnCheckoutAsGuest.toString());
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public void sendTextToFirstNameField(String name) {
        log.info("Enter first name "+sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, name);
    }
    public void sendTextToLastNameField(String lastName) {
        log.info("Enter last name "+sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void sendTextToEmailField(String email) {
        log.info("Enter email "+sendTextToEmail.toString());
        sendTextToElement(sendTextToEmail, email);
    }
    public void sendTextToCompanyField(String company) {
        log.info("Enter company name "+sendTextToCompany.toString());
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        log.info("Select country "+country.toString());
        selectByIndexFromDropDown(country,156);
    }
    public void sendTextToCityField(String city) {
        log.info("Enter city name "+sendTextToCity.toString());
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddressLine1(String address) {
        log.info("Enter address "+sendTextToAddress1.toString());
        sendTextToElement(sendTextToAddress1, address);
    }
    public void sendTextToAddressLine2(String address) {
        log.info("Enter address");
        sendTextToElement(sendTextToAddress2, address);
    }
    public void sendTextToPostcode(String postcode) {
        log.info("Enter post code "+sendTextToPostalCode.toString());
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    public void sendTextToPhoneNumberField(String number) {
        log.info("Enter phone number "+sendTextToPhoneNumber.toString());
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    public void clickOnContinueButton() {
        log.info("Click on continue "+clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
    public void clickOnNextDayAirButton() {
        log.info("Click on next day air"+clickOnNextDayAir.toString());
        clickOnElement(clickOnNextDayAir);
    }
    public void clickOnContinueButtonAgain() {
        log.info("Click on continue");
        clickOnElement(clickOnContinueTab);
    }
    public void clickOnCreditCardButton() {
        log.info("Click on credit card"+clickOnCreditCard.toString());
        clickOnElement(clickOnCreditCard);
    }
    public void selectClickOnContinue1() {
        log.info("Click on continue");
        clickOnElement(continueButton);
    }

    public void selectMasterCardFromCreditCardDropdown() {
        log.info("Select master card "+creditCard.toString());

        selectByIndexFromDropDown(creditCard,1);
    }
    public void sendTextTOCardHolderName(String name) {
        log.info("Enter card holder name "+cardholdername.toString());
        sendTextToElement(cardholdername, name);
    }
    public void sendTextTOCardNumber(String num) {
        log.info("Enter card number"+cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }
    public void sendTextToCardCode(String code) {
        log.info("Enter card code "+cardCode.toString());
        sendTextToElement(cardCode, code);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        log.info("Select month and year for credit card expire ");

        selectByVisibleTextFromDropDown(expireMonth,"05");
        selectByVisibleTextFromDropDown(expireYear,"2024");
    }
    public void clickOnContinueButton2() {
        log.info("Click on continue "+continueButton2.toString());
        clickOnElement(continueButton2);
    }
    public String creditCardMessage(){
        log.info("Credit card text "+creditCardMessage.toString());
        return getTextFromElement(creditCardMessage);
    }
    public String nextDayAirMessage(){
        log.info("Next day air text"+nextDayAirMessage.toString());
        return getTextFromElement(nextDayAirMessage);
    }
    public String totalAmountMessage(){
        log.info("Total amount message"+finalAmountMessage.toString());
        return getTextFromElement(finalAmountMessage);

    }
    public String thankYouMessage(){
        log.info("Thank you message"+thankYouMessage.toString());
        return getTextFromElement(thankYouMessage);

    }
    public String yourOrderMessage(){
        log.info("Your order message "+successfulMessage.toString());
        return getTextFromElement(successfulMessage);

    }
    public String finalMessage(){
        log.info(" Final message "+finalMessage.toString());
        return getTextFromElement(finalMessage);

    }
    public void clickOnConformButton() {
        log.info("Click on conform button "+conform.toString());
        clickOnElement(conform);
    }
    public void clickOnContinueButton3() {
        log.info("Click on continue button "+continueButton3.toString());
        clickOnElement(continueButton3);
    }


}
