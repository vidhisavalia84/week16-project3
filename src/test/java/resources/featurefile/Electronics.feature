Feature: Electronics page

  Background: User is on Homepage
  @sanity
  @regression
  Scenario: User should navigate to cellphones page successfully
    When User mouse hover on electronics tab
    And  User mouse hover on cell phones and click on cell phones
    Then User is navigated to cellphones page successfully
  @smoke
  @regression
  Scenario: Verify that user should add product successfully and place order successfully
    When User mouse hover on electronics tab
    And  User mouse hover on cell phones and click on cell phones
    And User is navigated to cellphones page successfully
    And  User click on list view tab
    And  User click on nokia lumia cellphone
    And  User verify nokia lumia message
    And  User verify price
    And  User Clear text from quantity field
    And  User enter quantity into quantity field
    And  User click on add To Cartbutton again
    And  User verify  product message
    And  User click on close button to close message
    And  User mouse hover on element shopping cart
    And  User click on go to cart button
    And  User verify shopping cart message
    And  User verify message texttwo
    And  User verify total amount
    And  User mouse hover on terms of services button and click
    And  User click on check out button
    And  User verify please sign in message
    And  User click on register button
    And  User verify register text

    And  User click on gender button
    And  User enter first name for register "Krish"
    And  User enter last name for register"patel"
    And  User enter birth date
    And  User enter birth month
    And  User enter birth year
    And  User enter email address"vidhi""@Gmail.com"
    And User enter company name for register"Prime"
    And User enter password for register "abc123"
    And User enter conform password for register"abc123"
    And User click on register button again
    And User verify reristration successfull message

    And User click on continue buttonfirst
    And User verify shopping cart message
    And User click on I agree with terms and condition
    And User click on check out button first
    And User select country  from drop down
    And User enter city  name"Delhi"
    And User enter addersslineone "123  BillRoad"
    And User enter addersslinetwo "Dell Area"
    And User enter zipcode "356 501"
    And User enter phone number"07958695847"
    And User enter fax number"562354"
    And User click on continue second electronics button
    And User click on second day air button
    And User click on continue third electronics button
    And User select radio button
    And User click on continue fourth electronics button
    And User select visa from credit card drop down
    And User send text to card holder  name "Krish"
    And User send text to card number  "1111222233334444"
    And User select expire month "3"
    And User select expire year "2024"
    And User enter card code "502"
    And User click on continue five electrinic button
    And User verify message credit card
    And User verify message second day air
    And User verify message total amount
    And User click on conform transaction
    And User verify thank you message again
    And User verify your order successful message
    And User click on continue six button
    And User verify message welcom to our store
    And User verify current url




