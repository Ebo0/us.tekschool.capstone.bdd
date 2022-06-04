@CompleteTest
Feature: User Login

  Background: 
    Given user is on Retail home page

  @UserLogin
  Scenario: User Login
    And User click on MyAccount
    When User click on Login
    And User enter username "vascata@tekschool.us" and password "123456"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard