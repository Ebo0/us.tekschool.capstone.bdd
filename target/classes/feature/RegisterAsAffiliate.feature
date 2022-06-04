@CompleteTest
Feature: Register as an Affiliate user with Cheque Payment Method

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

Examples:
      | company | website | taxID | paymentMethod |
      |MPS|mps.mn|123-456-4555|Somerich|