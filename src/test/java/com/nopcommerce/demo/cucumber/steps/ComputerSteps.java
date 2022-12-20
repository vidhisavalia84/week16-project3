package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {

    }

    @When("^User click on Computer Menu$")
    public void userClickOnComputerMenu() {
        new ComputerPage().clickOnComputerTab();
    }

    @And("^User click on Desktop$")
    public void userClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^User select sort by position Z to A$")
    public void userSelectSortByPositionZToA() {
        new ComputerPage().selectOptionAtoZFromList();
    }



    @And("^User click on add To Cart button$")
    public void userClickOnAddToCartButton()throws InterruptedException {
        Thread.sleep(2000);
        new ComputerPage().addToCartButton();
    }

    @And("^User verify the text Build your own computer$")
    public void userVerifyTheTextBuildYourOwnComputer() {
        Assert.assertEquals("Build your own computer", new ComputerPage().verifyTextBuildYourOwnComputer());
    }

    @And("^User select processor from drop down list$")
    public void userSelectProcessorFromDropDownList()throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().selectProcessorFromDropDownList();
    }

    @And("^User select ram from drop down list$")
    public void userSelectRamFromDropDownList() throws InterruptedException{
        Thread.sleep(1000);
        new ComputerPage().selectRamFromDropDownList();
    }

    @And("^User select eightRam from drop down list$")
    public void userSelectEightRamFromDropDownList()throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().select8GBFromDropDown();
    }

    @And("^User select HDD radio button$")
    public void userSelectHDDRadioButton()throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().selectHddRadioButton();
    }

    @And("^User select OS radio vista premium button$")
    public void userSelectOSRadioVistaPremiumButton()throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().selectOSradioVistaPremiumButton();
    }

    @And("^User select total commander check box$")
    public void userSelectTotalCommanderCheckBox()throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().setSelectTotalCommanderCheckBox();
    }

    @And("^User verify message$")
    public void userVerifyMessage() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals("$1,475.00", new ComputerPage().verifyMessage());
    }

    @And("^User click on add To Cart button again$")
    public void userClickOnAddToCartButtonAgain() {
        new ComputerPage().clickAgainOnAddToCartButton();
    }

    @And("^User verify the product message$")
    public void userVerifyTheProductMessage() {
        Assert.assertEquals("The product has been added to your shopping cart",new ComputerPage().verifyTheMessage());
    }

    @And("^User close message text button$")
    public void userCloseMessageTextButton() {
        new ComputerPage().closeMessageTextButton();
    }



    @And("^User mouse hover on element shopping cart$")
    public void userMouseHoverOnElementShoppingCart() {
        new ComputerPage().mouseHoverOnElementShoppingCart();
    }

    @And("^User click on go to cart button$")
    public void userClickOnGoToCartButton() {
        new ComputerPage().clickOnGoToCart();
    }

    @And("^User clear text in quantity field$")
    public void userClearTextInQuantityField() {
        new ComputerPage().clearTextInQuantityField();
    }

    @And("^User send text to quantity field$")
    public void userSendTextToQuantityField() {
        new ComputerPage().sendTextToQuantityField();
    }

    @And("^User click on update shopping cart$")
    public void userClickOnUpdateShoppingCart() {
        new ComputerPage().clickOnUpdateShoppingCartButton();
    }

    @And("^User verify total$")
    public void userVerifyTotal() {
        Assert.assertEquals("$2,950.00",new ComputerPage().verifyTotal());
    }

    @And("^User click on checkbox I agree with terms and condition$")
    public void userClickOnCheckboxIAgreeWithTermsAndCondition() {
        new ComputerPage().clickOnCheckBoxIAgreeWithTermsAndCondition();
    }

    @And("^User click on check out button$")
    public void userClickOnCheckOutButton() {
        new ComputerPage().clickOnCheckOutButton();
    }

    @And("^User verify welcome text$")
    public void userVerifyWelcomeText() {
        Assert.assertEquals("Welcome, Please Sign In!", new ComputerPage().verifyWelcometText());
    }

    @And("^User click on checkout as a guest button$")
    public void userClickOnCheckoutAsAGuestButton() {
        new ComputerPage().clickOnCheckOutAsGuest();
    }

    @And("^User enter first name \"([^\"]*)\"$")
    public void userEnterFirstName(String firstName)  {
        new ComputerPage().sendTextToFirstNameField(firstName);
    }

    @And("^User enter last name \"([^\"]*)\"$")
    public void userEnterLastName(String lastName)  {
        new ComputerPage().sendTextToLastNameField(lastName);
    }

    @And("^User enter email address\"([^\"]*)\"$")
    public void userEnterEmailAddress(String email)  {
        new ComputerPage().sendTextToEmailField(email);
    }

    @And("^User enter company name\"([^\"]*)\"$")
    public void userEnterCompanyName(String company)  {
        new ComputerPage().sendTextToCompanyField(company);
    }

    @And("^User select country from drop down$")
    public void userSelectCountryFromDropDown() {
        new ComputerPage().selectCountryFromDropDownList();
    }

    @And("^User enter city name\"([^\"]*)\"$")
    public void userEnterCityName(String city)  {
        new ComputerPage().sendTextToCityField(city);
    }

    @And("^User enter address \"([^\"]*)\"$")
    public void userEnterAddress(String address)  {
        new ComputerPage().sendTextToAddressLine1(address);
    }

    @And("^User enter address again \"([^\"]*)\"$")
    public void userEnterAddressAgain(String address)  {
        new ComputerPage().sendTextToAddressLine2(address);
    }

    @And("^User enter post code\"([^\"]*)\"$")
    public void userEnterPostCode(String code)  {
        new ComputerPage().sendTextToPostcode(code);
    }

    @And("^User enter telephone number\"([^\"]*)\"$")
    public void userEnterTelephoneNumber(String num)  {
        new ComputerPage().sendTextToPhoneNumberField(num);
    }
    @And("^User click on continue button$")
    public void userClickOnContinueButton() {
        new ComputerPage().clickOnContinueButton();
    }

    @And("^User click on next day air button$")
    public void userClickOnNextDayAirButton() {
        new ComputerPage().clickOnNextDayAirButton();
    }

    @And("^User click on cotinue button again$")
    public void userClickOnCotinueButtonAgain() {
        new ComputerPage().clickOnContinueButtonAgain();
    }

    @And("^User click on credit card button$")
    public void userClickOnCreditCardButton() {
        new ComputerPage().clickOnCreditCardButton();
    }

    @And("^User click on continuefirst button$")
    public void userClickOnContinuefirstButton() {
        new ComputerPage().selectClickOnContinue1();
    }

    @And("^User select master card from credit card drop down$")
    public void userSelectMasterCardFromCreditCardDropDown() {
        new ComputerPage().selectMasterCardFromCreditCardDropdown();
    }

    @And("^User send text to card holder name \"([^\"]*)\"$")
    public void userSendTextToCardHolderName(String text)throws InterruptedException  {
        Thread.sleep(2000);
        new ComputerPage().sendTextTOCardHolderName(text);
    }
    @And("^User send text to card number \"([^\"]*)\"$")
    public void userSendTextToCardNumber(String num)throws InterruptedException  {
        Thread.sleep(1000);
        new ComputerPage().sendTextTOCardNumber(num);
    }
    @And("^User send text to card code \"([^\"]*)\"$")
    public void userSendTextToCardCode(String code)  {
        new ComputerPage().sendTextToCardCode(code);
    }


    @And("^User select month and year for credit card expire date$")
    public void userSelectMonthAndYearForCreditCardExpireDate() {
        new ComputerPage().selectMonthAndYearForCreditCardExpireData();
    }

    @And("^User click on continue second button$")
    public void userClickOnContinueSecondButton() {
        new ComputerPage().clickOnContinueButton2();
    }

    @And("^User verify credit card message$")
    public void userVerifyCreditCardMessage() {
        Assert.assertEquals("Credit Card", new ComputerPage().creditCardMessage());
    }

    @And("^User verify next day air message$")
    public void userVerifyNextDayAirMessage() {
        Assert.assertEquals("Next Day Air", new ComputerPage().nextDayAirMessage());
    }

    @And("^User verify total amount message$")
    public void userVerifyTotalAmountMessage() {
        Assert.assertEquals("$2,950.00", new ComputerPage().totalAmountMessage());
    }

    @And("^User click on conform button$")
    public void userClickOnConformButton()throws InterruptedException {
        Thread.sleep(2000);
        new ComputerPage().clickOnContinueButton3();
    }

    @And("^User verify thank you message$")
    public void userVerifyThankYouMessage() {
        Assert.assertEquals("Thank you",new ComputerPage().thankYouMessage());
    }

    @And("^User verify your order message$")
    public void userVerifyYourOrderMessage() {
        Assert.assertEquals("Your order has been successfully processed!",new ComputerPage().yourOrderMessage());
    }

    @And("^User click on continuethree button$")
    public void userClickOnContinuethreeButton() {
        new ComputerPage().clickOnContinueButton3();
    }

    @Then("^User verify final message$")
    public void userVerifyFinalMessage() {
        Assert.assertEquals("Welcome to our store",new ComputerPage().finalMessage());
    }




}
