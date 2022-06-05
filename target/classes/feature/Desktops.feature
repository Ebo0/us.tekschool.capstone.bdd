@CompleteTest
Feature: Retail desktop page

  Background: 
    Given user is on Retail home page
    When User click on Desktops tab
    And User click on Show all desktops

  @verifyDesktop
  Scenario: User verify all items are present in Desktop tab
    When User click on Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page

  @addLaptopToCart
  Scenario: User add laptop into shopping cart from Desktops page
    And User click on ADD TO CART option on HP LP3065 item
    And User select quantity "1"
    And User click add to cart button
    Then User should see a message "Success: you have added HP LP 3065 to your Shopping Cart"

  @addCanonEos5DToCart
  Scenario: User add Canon EOS 5D into shopping cart from Desktops Page
    And User click ADD TO CART option on Canon EOS 5D item
    And User select color from dropdown Red
    And User select quantity "1"
    And User click add to Cart button
    Then User should see a message "Success: You have added Canon EOS 5D to your shopping cart!"

  @addReviewToCanonEos5D 
  Scenario Outline: User add review to Canon EOS 5D from Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information "<yourname>" "<yourReview>" "<Rating>"
    And User click on Continue Button
    Then User should see a message with "Thank you for your review. It has been submitted to the webmaster for approval."

    Examples: 
      | yourname | yourReview                                         |
      | yourname | Lorem ipsum dolor sit amet, consectetur tincidunt. |
