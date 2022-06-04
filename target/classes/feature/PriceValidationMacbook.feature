@CompleteTest
Feature: Validate the price of MacBook Pro is 2000

  Background: 
    Given user is on Retail home page
    When User click on Laptop &NoteBook tab
    And User click on Show all Laptop &NoteBook option
@ValidatePrice
  Scenario: 
    And User click on ‘MacBook Pro’ item
    Then User should see "$2,000.00" price tag is present on UI.
