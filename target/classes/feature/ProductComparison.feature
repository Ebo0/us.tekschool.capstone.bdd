@CompleteTest
Feature: Product Comparison

  Background: 
    Given user is on Retail home page
    When User click on Laptop &NoteBook tab
    And User click on Show all Laptop &NoteBook option

@ProductComparison
  Scenario: 
    And User click on heart icon to add ‘Sony VaIO’ laptop to wish list
    Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’
