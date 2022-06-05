@CompleteTest
Feature: User Login

  Background: 
    Given user is on Retail home page
    And User click on MyAccount
    When User click on Login
    And User enter username "vascata@tekschool.us" and password "123456"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @RegisterAsAffiliate
  Scenario Outline: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with following information "<company>" "<website>" "<taxID>" "<paymentMethod>"
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @EditAffiliateInfo
  Scenario Outline: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information "<bankName>" "<abaNumber>" "<swiftCode>" "<accountName>" "<accountNumber>"
    And User click on Continue button
    Then User should see a success message
      
  @editAccountInfo
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information "<firstname>" "<lastName>" "<email>" "<telephone>"
    And User click on continue button
    Then User should see following message " Success: Your account has been successfully updated."

Examples: 
      | firstname | lastName | email                 | telephone | bankName 	 | abaNumber | swiftCode | accountName | accountNumber | company | website | taxID        | paymentMethod |
      | Valara    | Calata   | Vascataa@tekschool.us |  99004649 |   mpsBank   |    123456 | 1s5d3f    | MyName      |      99074649 | MPS     | mps.mn  | 123-456-4555 | Somerich      |
    
      
      


      