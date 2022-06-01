@CompleteTest
Feature: Product Comparison

  Background: 
    Given user is on Retail home page
    When User click on Laptop &NoteBook tab
    And User click on Show all Laptop &NoteBook option

  @ProductComparisons
  Scenario: Product Comparison
    And User click on product comparison icon on ‘MacBook’
    And User click on product comparison icon on ‘MacBook Air
    Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’
    And User click on Product comparison link
    Then User should see Product Comparison Chart
