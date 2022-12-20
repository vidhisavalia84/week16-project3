Feature: Computer Test
  @sanity
  @regression
  Scenario: Verify that product arrange in alphabetical order
    Given User is on Homepage
    When User click on Computer Menu
    And  User click on Desktop
    And  User select sort by position Z to A
#    Then User should see that products arranged in decending order
  @smoke
  @regression
  Scenario: User should see that product added successfully to shopping cart
    Given User is on Homepage
    When User click on Computer Menu
    And  User click on Desktop
    And  User select sort by position Z to A
    And  User click on add To Cart button
    And  User verify the text Build your own computer
    And  User select processor from drop down list
    And  User select ram from drop down list
    And  User select eightRam from drop down list
    And  User select HDD radio button
    And  User select OS radio vista premium button
    And  User select total commander check box
    And  User verify message
    And  User click on add To Cart button again
    And  User verify the product message
    And  User close message text button
    And  User close message text button
    And  User mouse hover on element shopping cart
    And  User click on go to cart button
    And  User clear text in quantity field
    And  User send text to quantity field
    And  User click on update shopping cart
    And  User verify total
    And  User click on checkbox I agree with terms and condition
    And  User click on check out button
    And  User verify welcome text
    And  User click on checkout as a guest button
    And  User enter first name "Krishna"
    And  User enter last name "Vara"
    And  User enter email address"krishna@gmail.com"
    And  User enter company name"Prime"
    And  User select country from drop down
    And  User enter city name"London"
    And  User enter address "12 abc road"
    And  User enter address again "Amreli"
    And  User enter post code"HA4 5RT"
    And  User enter telephone number"07985658595"
    And  User click on continue button
    And  User click on next day air button
    And  User click on cotinue button again
    And  User click on credit card button
    And  User click on continuefirst button
    And  User select master card from credit card drop down
    And  User send text to card holder name "Krish"
    And  User send text to card number "1111222233334444"
    And  User send text to card code "506"
    And  User select month and year for credit card expire date
    And  User click on continue second button
    And  User verify credit card message
    And  User verify next day air message
    And  User verify total amount message
    And  User click on conform button
    And  User verify thank you message
    And  User verify your order message
    And  User click on continuethree button
    Then User verify final message



