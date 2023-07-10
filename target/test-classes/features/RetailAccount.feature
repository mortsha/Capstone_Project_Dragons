@Account
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'studentMori1265@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account

  @Regression
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Motaaazaa' and Phone '3901460010'
    And User click on Update button
    Then user profile information should be updated

  @Regression
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234560891330467 | Morteza    |               8 |           2026 |          321 |
    And User click on Add your card button
    Then a message should be displayed on 'Payment Method added successfully'

  @Regression
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9999000077775555 | sharifi    |               9 |           2028 |          987 |
    And user click on Update Your Card button
    Then a message should be displayed for edit 'Payment Method updated Successfully'

  @Regression
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User select the card 
    And User click on remove option of card section
    Then payment details should be removed

  @Regression
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName   | phoneNumber | streetAddress  | apt   | city    | state    | zipCode |
      | United States | Morteza sh |  2233563214 | 1520 Hemlok Rd | house | Toronto | Virginia |   15478 |
    And User click Add Your Address button
    Then a message should be displayed for add address 'Address Added Successfully'

  @Regression
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill the new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city   | state   | zipCode |
      | Canada  | sharifi  | 22612040328 | 3000 vins Rd  | apa | London | Ontario |   98541 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @Regression
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
