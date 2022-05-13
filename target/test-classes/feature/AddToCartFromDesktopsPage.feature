@CompleteTest
Feature: User add HP LP 3065 from Desktops tab to the cart


Background:    
		Given user is on Retail home page 
		When User click on Desktops tab
		And User click on Show all desktops

@addProductToCart 
  Scenario: User add laptop into shopping cart from Desktops page
    And User click on ADD TO CART option on HP LP3065 item
    And User select quantity "1"
    And User click add to cart button
    Then User should see a message "Success: you have added HP LP 3065 to your Shopping Cart"

