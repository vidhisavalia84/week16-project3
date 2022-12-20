$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Computer.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Test",
  "description": "",
  "id": "computer-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9292354400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that product arrange in alphabetical order",
  "description": "",
  "id": "computer-test;verify-that-product-arrange-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Computer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Desktop",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User select sort by position Z to A",
  "keyword": "And "
});
formatter.match({
  "location": "ComputerSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 232400600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnComputerMenu()"
});
formatter.result({
  "duration": 1086326200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnDesktop()"
});
formatter.result({
  "duration": 498185300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectSortByPositionZToA()"
});
formatter.result({
  "duration": 198093400,
  "status": "passed"
});
formatter.after({
  "duration": 806592200,
  "status": "passed"
});
formatter.before({
  "duration": 2354521100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#    Then User should see that products arranged in decending order"
    }
  ],
  "line": 12,
  "name": "User should see that product added successfully to shopping cart",
  "description": "",
  "id": "computer-test;user-should-see-that-product-added-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User click on Computer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on Desktop",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User select sort by position Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on add To Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User verify the text Build your own computer",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User select processor from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User select ram from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select eightRam from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User select HDD radio button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User select OS radio vista premium button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User select total commander check box",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User verify message",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User click on add To Cart button again",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User verify the product message",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User close message text button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User close message text button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User mouse hover on element shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User click on go to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User clear text in quantity field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User send text to quantity field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click on update shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User verify total",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User click on checkbox I agree with terms and condition",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User click on check out button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User verify welcome text",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User click on checkout as a guest button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enter first name \"Krishna\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enter last name \"Vara\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User enter email address\"krishna@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User enter company name\"Prime\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User select country from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User enter city name\"London\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User enter address \"12 abc road\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User enter address again \"Amreli\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User enter post code\"HA4 5RT\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User enter telephone number\"07985658595\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User click on next day air button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User click on cotinue button again",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User click on credit card button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User click on continuefirst button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User select master card from credit card drop down",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User send text to card holder name \"Krish\"",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User send text to card number \"1111222233334444\"",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "User send text to card code \"506\"",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User select month and year for credit card expire date",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User click on continue second button",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User verify credit card message",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "User verify next day air message",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User verify total amount message",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "User click on conform button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "User verify thank you message",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User verify your order message",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User click on continuethree button",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "User verify final message",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 76400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnComputerMenu()"
});
formatter.result({
  "duration": 612238900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnDesktop()"
});
formatter.result({
  "duration": 525771900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectSortByPositionZToA()"
});
formatter.result({
  "duration": 162851200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnAddToCartButton()"
});
formatter.result({
  "duration": 2093242700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyTheTextBuildYourOwnComputer()"
});
formatter.result({
  "duration": 1182738400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectProcessorFromDropDownList()"
});
formatter.result({
  "duration": 1085908700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectRamFromDropDownList()"
});
formatter.result({
  "duration": 1125663100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectEightRamFromDropDownList()"
});
formatter.result({
  "duration": 1084445300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectHDDRadioButton()"
});
formatter.result({
  "duration": 1118991900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectOSRadioVistaPremiumButton()"
});
formatter.result({
  "duration": 1106823100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectTotalCommanderCheckBox()"
});
formatter.result({
  "duration": 1113779400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyMessage()"
});
formatter.result({
  "duration": 2063431700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnAddToCartButtonAgain()"
});
formatter.result({
  "duration": 95409200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyTheProductMessage()"
});
formatter.result({
  "duration": 313338800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userCloseMessageTextButton()"
});
formatter.result({
  "duration": 110015700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userCloseMessageTextButton()"
});
formatter.result({
  "duration": 90308900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userMouseHoverOnElementShoppingCart()"
});
formatter.result({
  "duration": 201631400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnGoToCartButton()"
});
formatter.result({
  "duration": 1400081300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClearTextInQuantityField()"
});
formatter.result({
  "duration": 152533700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSendTextToQuantityField()"
});
formatter.result({
  "duration": 140252500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnUpdateShoppingCart()"
});
formatter.result({
  "duration": 745346600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyTotal()"
});
formatter.result({
  "duration": 73422800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnCheckboxIAgreeWithTermsAndCondition()"
});
formatter.result({
  "duration": 117449500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnCheckOutButton()"
});
formatter.result({
  "duration": 781295300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyWelcomeText()"
});
formatter.result({
  "duration": 79875300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnCheckoutAsAGuestButton()"
});
formatter.result({
  "duration": 1134748800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krishna",
      "offset": 23
    }
  ],
  "location": "ComputerSteps.userEnterFirstName(String)"
});
formatter.result({
  "duration": 142954800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vara",
      "offset": 22
    }
  ],
  "location": "ComputerSteps.userEnterLastName(String)"
});
formatter.result({
  "duration": 157525900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krishna@gmail.com",
      "offset": 25
    }
  ],
  "location": "ComputerSteps.userEnterEmailAddress(String)"
});
formatter.result({
  "duration": 191335000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime",
      "offset": 24
    }
  ],
  "location": "ComputerSteps.userEnterCompanyName(String)"
});
formatter.result({
  "duration": 147253800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectCountryFromDropDown()"
});
formatter.result({
  "duration": 4885288000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 21
    }
  ],
  "location": "ComputerSteps.userEnterCityName(String)"
});
formatter.result({
  "duration": 188875600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12 abc road",
      "offset": 20
    }
  ],
  "location": "ComputerSteps.userEnterAddress(String)"
});
formatter.result({
  "duration": 191000000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amreli",
      "offset": 26
    }
  ],
  "location": "ComputerSteps.userEnterAddressAgain(String)"
});
formatter.result({
  "duration": 159858700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HA4 5RT",
      "offset": 21
    }
  ],
  "location": "ComputerSteps.userEnterPostCode(String)"
});
formatter.result({
  "duration": 199481400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07985658595",
      "offset": 28
    }
  ],
  "location": "ComputerSteps.userEnterTelephoneNumber(String)"
});
formatter.result({
  "duration": 195051300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnContinueButton()"
});
formatter.result({
  "duration": 110870700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnNextDayAirButton()"
});
formatter.result({
  "duration": 440436200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnCotinueButtonAgain()"
});
formatter.result({
  "duration": 123354200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnCreditCardButton()"
});
formatter.result({
  "duration": 348150500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnContinuefirstButton()"
});
formatter.result({
  "duration": 120310500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectMasterCardFromCreditCardDropDown()"
});
formatter.result({
  "duration": 487600000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krish",
      "offset": 36
    }
  ],
  "location": "ComputerSteps.userSendTextToCardHolderName(String)"
});
formatter.result({
  "duration": 2091776400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1111222233334444",
      "offset": 31
    }
  ],
  "location": "ComputerSteps.userSendTextToCardNumber(String)"
});
formatter.result({
  "duration": 1125371100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "506",
      "offset": 29
    }
  ],
  "location": "ComputerSteps.userSendTextToCardCode(String)"
});
formatter.result({
  "duration": 122952900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userSelectMonthAndYearForCreditCardExpireDate()"
});
formatter.result({
  "duration": 343385000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnContinueSecondButton()"
});
formatter.result({
  "duration": 75644200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyCreditCardMessage()"
});
formatter.result({
  "duration": 280654400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyNextDayAirMessage()"
});
formatter.result({
  "duration": 43688600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyTotalAmountMessage()"
});
formatter.result({
  "duration": 49947500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnConformButton()"
});
formatter.result({
  "duration": 2064991100,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: An invalid or illegal selector was specified\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#invalid_selector_exception\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [5c9a299dfedd5cab7560ef18be908d5f, findElement {using\u003dcss selector, value\u003d//button[normalize-space()\u003d\u0027Confirm\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\VIDHIP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:63224}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63224/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5c9a299dfedd5cab7560ef18be908d5f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.nopcommerce.demo.utility.Utility.clickOnElement(Utility.java:53)\r\n\tat com.nopcommerce.demo.pages.ComputerPage.clickOnContinueButton3(ComputerPage.java:534)\r\n\tat com.nopcommerce.demo.cucumber.steps.ComputerSteps.userClickOnConformButton(ComputerSteps.java:277)\r\n\tat ✽.And User click on conform button(Computer.feature:64)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ComputerSteps.userVerifyThankYouMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerSteps.userVerifyYourOrderMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerSteps.userClickOnContinuethreeButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerSteps.userVerifyFinalMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1120194700,
  "status": "passed"
});
formatter.uri("Electronics.feature");
formatter.feature({
  "line": 1,
  "name": "Electronics page",
  "description": "",
  "id": "electronics-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2859854600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is on Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to cellphones page successfully",
  "description": "",
  "id": "electronics-page;user-should-navigate-to-cellphones-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User mouse hover on electronics tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User mouse hover on cell phones and click on cell phones",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is navigated to cellphones page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectrinicsSteps.userMouseHoverOnElectronicsTab()"
});
formatter.result({
  "duration": 191596400,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userMouseHoverOnCellPhonesAndClickOnCellPhones()"
});
formatter.result({
  "duration": 697110000,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userIsNavigatedToCellphonesPageSuccessfully()"
});
formatter.result({
  "duration": 62933800,
  "status": "passed"
});
formatter.after({
  "duration": 741535500,
  "status": "passed"
});
formatter.before({
  "duration": 2407907900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is on Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 12,
  "name": "Verify that user should add product successfully and place order successfully",
  "description": "",
  "id": "electronics-page;verify-that-user-should-add-product-successfully-and-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User mouse hover on electronics tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User mouse hover on cell phones and click on cell phones",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User is navigated to cellphones page successfully",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on list view tab",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on nokia lumia cellphone",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User verify nokia lumia message",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User verify price",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Clear text from quantity field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enter quantity into quantity field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on add To Cartbutton again",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User verify  product message",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User click on close button to close message",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User mouse hover on element shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User click on go to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User verify shopping cart message",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User verify message texttwo",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User verify total amount",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User mouse hover on terms of services button and click",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User click on check out button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User verify please sign in message",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User verify register text",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User click on gender button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enter first name for register \"Krish\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User enter last name for register\"patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enter birth date",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enter birth month",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enter birth year",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User enter email address\"vidhi\"\"@Gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User enter company name for register\"Prime\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User enter password for register \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User enter conform password for register\"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User click on register button again",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User verify reristration successfull message",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User click on continue buttonfirst",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User verify shopping cart message",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User click on I agree with terms and condition",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User click on check out button first",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User select country  from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User enter city  name\"Delhi\"",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User enter addersslineone \"123  BillRoad\"",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User enter addersslinetwo \"Dell Area\"",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User enter zipcode \"356 501\"",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "User enter phone number\"07958695847\"",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User enter fax number\"562354\"",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User click on continue second electronics button",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User click on second day air button",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "User click on continue third electronics button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User select radio button",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "User click on continue fourth electronics button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "User select visa from credit card drop down",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User send text to card holder  name \"Krish\"",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User send text to card number  \"1111222233334444\"",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "User select expire month \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "User select expire year \"2024\"",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "User enter card code \"502\"",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "User click on continue five electrinic button",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "User verify message credit card",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "User verify message second day air",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "User verify message total amount",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "User click on conform transaction",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "User verify thank you message again",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "User verify your order successful message",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "User click on continue six button",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "User verify message welcom to our store",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "User verify current url",
  "keyword": "And "
});
formatter.match({
  "location": "ElectrinicsSteps.userMouseHoverOnElectronicsTab()"
});
formatter.result({
  "duration": 209177200,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userMouseHoverOnCellPhonesAndClickOnCellPhones()"
});
formatter.result({
  "duration": 1110265500,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userIsNavigatedToCellphonesPageSuccessfully()"
});
formatter.result({
  "duration": 56850700,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnListViewTab()"
});
formatter.result({
  "duration": 102601600,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnNokiaLumiaCellphone()"
});
formatter.result({
  "duration": 3105758000,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyNokiaLumiaMessage()"
});
formatter.result({
  "duration": 58371400,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyPrice()"
});
formatter.result({
  "duration": 52232900,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userClearTextFromQuantityField()"
});
formatter.result({
  "duration": 97093500,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userEnterQuantityIntoQuantityField()"
});
formatter.result({
  "duration": 111688900,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnAddToCartbuttonAgain()"
});
formatter.result({
  "duration": 108610800,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyProductMessage()"
});
formatter.result({
  "duration": 311103000,
  "status": "passed"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnCloseButtonToCloseMessage()"
});
formatter.result({
  "duration": 115081200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userMouseHoverOnElementShoppingCart()"
});
formatter.result({
  "duration": 185267800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.userClickOnGoToCartButton()"
});
formatter.result({
  "duration": 40099078200,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d108.0.5359.125)\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [64db17865572ca049cccdd72ee32fdff, clickElement {id\u003da3fa2ed1-34f6-4527-a065-1c3e94c2e043}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\VIDHIP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:63271}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63271/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (64db17865572ca049cccdd72ee32fdff)] -\u003e xpath: //button[@class\u003d\u0027button-1 cart-button\u0027]]\nSession ID: 64db17865572ca049cccdd72ee32fdff\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\r\n\tat sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.nopcommerce.demo.utility.Utility.clickOnElement(Utility.java:53)\r\n\tat com.nopcommerce.demo.pages.ComputerPage.clickOnGoToCart(ComputerPage.java:363)\r\n\tat com.nopcommerce.demo.cucumber.steps.ComputerSteps.userClickOnGoToCartButton(ComputerSteps.java:111)\r\n\tat ✽.And User click on go to cart button(Electronics.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyShoppingCartMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyMessageTexttwo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyTotalAmount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userMouseHoverOnTermsOfServicesButtonAndClick()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerSteps.userClickOnCheckOutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyPleaseSignInMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnRegisterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyRegisterText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnGenderButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Krish",
      "offset": 36
    }
  ],
  "location": "ElectrinicsSteps.userEnterFirstNameForRegister(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "patel",
      "offset": 34
    }
  ],
  "location": "ElectrinicsSteps.userEnterLastNameForRegister(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userEnterBirthDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userEnterBirthMonth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userEnterBirthYear()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "vidhi",
      "offset": 25
    },
    {
      "val": "@Gmail.com",
      "offset": 32
    }
  ],
  "location": "ElectrinicsSteps.userEnterEmailAddress(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime",
      "offset": 37
    }
  ],
  "location": "ElectrinicsSteps.userEnterCompanyNameForRegister(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 34
    }
  ],
  "location": "ElectrinicsSteps.userEnterPasswordForRegister(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "ElectrinicsSteps.userEnterConformPasswordForRegister(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnRegisterButtonAgain()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyReristrationSuccessfullMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnContinueButtonfirst()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyShoppingCartMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnIAgreeWithTermsAndCondition()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnCheckOutButtonFirst()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userSelectCountryFromDropDown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Delhi",
      "offset": 22
    }
  ],
  "location": "ElectrinicsSteps.userEnterCityName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123  BillRoad",
      "offset": 27
    }
  ],
  "location": "ElectrinicsSteps.userEnterAddersslineone(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell Area",
      "offset": 27
    }
  ],
  "location": "ElectrinicsSteps.userEnterAddersslinetwo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "356 501",
      "offset": 20
    }
  ],
  "location": "ElectrinicsSteps.userEnterZipcode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "07958695847",
      "offset": 24
    }
  ],
  "location": "ElectrinicsSteps.userEnterPhoneNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "562354",
      "offset": 22
    }
  ],
  "location": "ElectrinicsSteps.userEnterFaxNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnContinueSecondElectronicsButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnSecondDayAirButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnContinueThirdElectronicsButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userSelectRadioButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnContinueFourthElectronicsButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userSelectVisaFromCreditCardDropDown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Krish",
      "offset": 37
    }
  ],
  "location": "ElectrinicsSteps.userSendTextToCardHolderName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1111222233334444",
      "offset": 32
    }
  ],
  "location": "ElectrinicsSteps.userSendTextToCardNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 26
    }
  ],
  "location": "ElectrinicsSteps.userSelectExpireMonth(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2024",
      "offset": 25
    }
  ],
  "location": "ElectrinicsSteps.userSelectExpireYear(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "502",
      "offset": 22
    }
  ],
  "location": "ElectrinicsSteps.userEnterCardCode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnContinueFiveElectrinicButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyMessageCreditCard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyMessageSecondDayAir()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyMessageTotalAmount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnConformTransaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyThankYouMessageAgain()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyYourOrderSuccessfulMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userClickOnContinueSixButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyMessageWelcomToOurStore()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectrinicsSteps.userVerifyCurrentUrl()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1142461500,
  "status": "passed"
});
});