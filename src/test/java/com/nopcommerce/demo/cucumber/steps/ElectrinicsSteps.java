package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectrinicsSteps {
    @When("^User mouse hover on electronics tab$")
    public void userMouseHoverOnElectronicsTab() {
        new ElectronicsPage().mousehoverOnElectronicsTab();
    }

    @And("^User mouse hover on cell phones and click on cell phones$")
    public void userMouseHoverOnCellPhonesAndClickOnCellPhones() {
        new ElectronicsPage().mousehoverOnCellphoneAndClickOnCellphone();
    }

    @Then("^User is navigated to cellphones page successfully$")
    public void userIsNavigatedToCellphonesPageSuccessfully() {
        Assert.assertEquals("Cell phones", new ElectronicsPage().cellPhoneMessage());
    }

    @And("^User click on list view tab$")
    public void userClickOnListViewTab() {
        new ElectronicsPage().clickOnListViewTab();
    }

    @And("^User click on nokia lumia cellphone$")
    public void userClickOnNokiaLumiaCellphone()throws InterruptedException {
        Thread.sleep(2000);
        new ElectronicsPage().clickOnNokiaLumia1020Cellphone();
    }

    @And("^User verify nokia lumia message$")
    public void userVerifyNokiaLumiaMessage() {
        Assert.assertEquals("Nokia Lumia 1020",new ElectronicsPage().getNokiaLumia1020Message());
    }

    @And("^User verify price$")
    public void userVerifyPrice() {
        Assert.assertEquals("$349.00",new ElectronicsPage().verifyPrice$349());
    }

    @And("^User Clear text from quantity field$")
    public void userClearTextFromQuantityField() {
        new ElectronicsPage().clearTextOfElement();
    }

    @And("^User enter quantity into quantity field$")
    public void userEnterQuantityIntoQuantityField() {
        new ElectronicsPage().addQuantityOf2();
    }
    @And("^User click on add To Cartbutton again$")
    public void userClickOnAddToCartbuttonAgain() {
        new ElectronicsPage().clickOnAddToCartButton();
    }
    @And("^User verify  product message$")
    public void userVerifyProductMessage() {
        Assert.assertEquals("The product has been added to your shopping cart", new ElectronicsPage().verifyMessage());
    }
    @And("^User click on close button to close message$")
    public void userClickOnCloseButtonToCloseMessage() {
        new ElectronicsPage().clickOnCrossButton();
    }
    @And("^User verify shopping cart message$")
    public void userVerifyShoppingCartMessage() {
        Assert.assertEquals("Shopping cart",new ElectronicsPage().verifyMessageShoppinCart());
    }

    @And("^User verify message texttwo$")
    public void userVerifyMessageTexttwo() {
        Assert.assertEquals("(2)",new ElectronicsPage().verifyMessageText2());
    }

    @And("^User verify total amount$")
    public void userVerifyTotalAmount() {
        Assert.assertEquals("$698.00",new ElectronicsPage().verifyTotal$698());
    }


    @And("^User mouse hover on terms of services button and click$")
    public void userMouseHoverOnTermsOfServicesButtonAndClick() {
        new ElectronicsPage().mouseHoverOnTermsOfServiceButtonAndClick();
    }

    @And("^User verify please sign in message$")
    public void userVerifyPleaseSignInMessage() {
        Assert.assertEquals("Welcome, Please Sign In!",new ElectronicsPage().VerifyPleaseSignIn());
    }

    @And("^User click on register button$")
    public void userClickOnRegisterButton() {
        new ElectronicsPage().clickOnRegister();
    }

    @And("^User verify register text$")
    public void userVerifyRegisterText() {
        Assert.assertEquals("Register",new ElectronicsPage().verifyRegisterText());
    }

    @And("^User click on gender button$")
    public void userClickOnGenderButton() {
        new ElectronicsPage().clickOnGenderButton();
    }
    @And("^User enter first name for register \"([^\"]*)\"$")
    public void userEnterFirstNameForRegister(String name)  {
        new ElectronicsPage().enterFirstName(name);
    }

    @And("^User enter last name for register\"([^\"]*)\"$")
    public void userEnterLastNameForRegister(String lastName)  {
        new ElectronicsPage().enterLasttName(lastName);

    }

        @And("^User enter birth date$")
    public void userEnterBirthDate() {
        new ElectronicsPage().enterBirthDate();
    }

    @And("^User enter birth month$")
    public void userEnterBirthMonth() {
        new ElectronicsPage().enterBirthMonth();
    }

    @And("^User enter birth year$")
    public void userEnterBirthYear() {
        new ElectronicsPage().enterBirthYear();
    }

    @And("^User enter email address\"([^\"]*)\"\"([^\"]*)\"$")
    public void userEnterEmailAddress(String name, String email)  {
        new ElectronicsPage().enterEmail(name+Utility.getRandomString(1)+email);
    }
    @And("^User enter company name for register\"([^\"]*)\"$")
    public void userEnterCompanyNameForRegister(String name)  {
        new ElectronicsPage().enterCompanyName(name);
    }

    @And("^User enter password for register \"([^\"]*)\"$")
    public void userEnterPasswordForRegister(String pass)  {
        new ElectronicsPage().enterPassword(pass);
    }

    @And("^User enter conform password for register\"([^\"]*)\"$")
    public void userEnterConformPasswordForRegister(String conformPassword)  {
        new ElectronicsPage().enterConformPassword(conformPassword);
    }
    @And("^User click on register button again$")
    public void userClickOnRegisterButtonAgain() {
        new ElectronicsPage().clickOnRegisterButton();
    }


    @And("^User verify reristration successfull message$")
    public void userVerifyReristrationSuccessfullMessage() {
        Assert.assertEquals("Your registration completed",new ElectronicsPage().verifyRegistrationMessage());
    }


    @And("^User click on continue buttonfirst$")
    public void userClickOnContinueButtonfirst() {
        new ElectronicsPage().clickContinue1();
    }

    @And("^User click on I agree with terms and condition$")
    public void userClickOnIAgreeWithTermsAndCondition() {
        new ElectronicsPage().clickOnTermsofService1();
    }

    @And("^User click on check out button first$")
    public void userClickOnCheckOutButtonFirst() {
        new ElectronicsPage().clickOnCheckOut1();
    }

    @And("^User select country  from drop down$")
    public void userSelectCountryFromDropDown() {
        new ElectronicsPage().selectCountry();
    }

    @And("^User enter city  name\"([^\"]*)\"$")
    public void userEnterCityName(String city)  {
        new ElectronicsPage().enterCity(city);
    }

    @And("^User enter addersslineone \"([^\"]*)\"$")
    public void userEnterAddersslineone(String add1)  {
        new ElectronicsPage().enterAddress1(add1);
    }

    @And("^User enter addersslinetwo \"([^\"]*)\"$")
    public void userEnterAddersslinetwo(String add2)  {
        new ElectronicsPage().enterAddress2(add2);
    }

    @And("^User enter zipcode \"([^\"]*)\"$")
    public void userEnterZipcode(String code){
        new ElectronicsPage().enterZipCode(code);
    }

    @And("^User enter phone number\"([^\"]*)\"$")
    public void userEnterPhoneNumber(String num){
        new ElectronicsPage().enterPhoneNumber(num);
    }

    @And("^User enter fax number\"([^\"]*)\"$")
    public void userEnterFaxNumber(String faxNum){
        new ElectronicsPage().enterFaxNumber(faxNum);
    }

    @And("^User click on continue second electronics button$")
    public void userClickOnContinueSecondElectronicsButton() {
        new ElectronicsPage().clickOnContinue2();
    }

    @And("^User click on second day air button$")
    public void userClickOnSecondDayAirButton() {
        new ElectronicsPage().clickOn2ndDayAirButton();
    }

    @And("^User click on continue third electronics button$")
    public void userClickOnContinueThirdElectronicsButton() {
        new ElectronicsPage().clickOnContinue3();
    }

    @And("^User select radio button$")
    public void userSelectRadioButton() {
        new ElectronicsPage().selectRadioButton();
    }

    @And("^User click on continue fourth electronics button$")
    public void userClickOnContinueFourthElectronicsButton() {
        new ElectronicsPage().clickOnContinue4();
    }

    @And("^User select visa from credit card drop down$")
    public void userSelectVisaFromCreditCardDropDown() {
        new ElectronicsPage().selectVisaFromCreditCardDropDown();
    }

    @And("^User send text to card holder  name \"([^\"]*)\"$")
    public void userSendTextToCardHolderName(String text)  {
        new ElectronicsPage().enterCardHolderName(text);
    }

    @And("^User send text to card number  \"([^\"]*)\"$")
    public void userSendTextToCardNumber(String num)  {
        new ElectronicsPage().enterCardNumber(num);
    }

    @And("^User select expire month \"([^\"]*)\"$")
    public void userSelectExpireMonth(String month)  {
        new ElectronicsPage().selectExpireMonth(month);
    }

    @And("^User select expire year \"([^\"]*)\"$")
    public void userSelectExpireYear(String year)  {
        new ElectronicsPage().selectExpireYear(year);
    }

    @And("^User enter card code \"([^\"]*)\"$")
    public void userEnterCardCode(String code)  {
        new ElectronicsPage().enterCardCode(code);
    }

    @And("^User click on continue five electrinic button$")
    public void userClickOnContinueFiveElectrinicButton() {
        new ElectronicsPage().clickOnContinue5();
    }

    @And("^User verify message credit card$")
    public void userVerifyMessageCreditCard() {
        Assert.assertEquals("Credit Card",new ElectronicsPage().verifymessageCreditCard());
    }

    @And("^User verify message second day air$")
    public void userVerifyMessageSecondDayAir() {
        Assert.assertEquals("2nd Day Air",new ElectronicsPage().verifymessage2ndDayAir());
    }

    @And("^User verify message total amount$")
    public void userVerifyMessageTotalAmount() {
        Assert.assertEquals("$698.00",new ElectronicsPage().verifymessage698());
    }
    @And("^User verify thank you message again$")
    public void userVerifyThankYouMessageAgain() {
        Assert.assertEquals("Thank you",new ElectronicsPage().verifyMessageThankYou());
    }

    @And("^User verify your order successful message$")
    public void userVerifyYourOrderSuccessfulMessage() {
        Assert.assertEquals("Your order has been successfully processed!",new ElectronicsPage().verifyMessageSuccessful());
    }

    @And("^User click on continue six button$")
    public void userClickOnContinueSixButton() {
        new ElectronicsPage().clickOnContinue6();
    }
    @And("^User click on conform transaction$")
    public void userClickOnConformTransaction() {
        new ElectronicsPage().conformTransaction();
    }

    @And("^User verify message welcom to our store$")
    public void userVerifyMessageWelcomToOurStore() {
        Assert.assertEquals("Welcome to our store",new ElectronicsPage().verifyMessageWelcomeToOurStore());
    }

    @And("^User verify current url$")
    public void userVerifyCurrentUrl() {
        Assert.assertEquals("https://demo.nopcommerce.com/",new ElectronicsPage().urlMessage());
    }



}
