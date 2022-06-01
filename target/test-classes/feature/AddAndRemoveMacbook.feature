@CompleteTest
Feature: User add and remove Macbook from cart

  Background: 
    Given user is on Retail home page

@AddAndRemoveMacBook
  Scenario: User add and remove Macbook from cart
    When User click on Laptop &NoteBook tab
    And User click on Show all Laptop &NoteBook option
    And User click on MacBook item
    And User click add Macbook to Cart button
    And User should see a message ‘Success: You have added MacBook to your shopping cart!’
    And User should see "1" item(s) "602.00" showed to the cart
    And User click on cart option
    And user click on red X button to remove the item from cart
    Then item should be removed and cart should show ‘"0" item(s)’
