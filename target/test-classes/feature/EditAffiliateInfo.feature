@CompleteTest
Feature: Edit your affiliate information from Cheque payment method to Bank Transfer

  Background: 
    Given user is on Retail home page
    And User click on MyAccount
    When User click on Login
    And User enter username "vascata@tekschool.us" and password "123456"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @EditAffiliateInfo
  Scenario Outline: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information "<bankName>" "<abaNumber>" "<swiftCode>" "<accountName>" "<accountNumber>"
    And User click on Continue button
    Then User should see a success message

    Examples: 
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | mpsBank  |    123456 | 1s5d3f    | MyName      |      99074649 |
