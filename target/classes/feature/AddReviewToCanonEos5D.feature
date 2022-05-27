@CompleteTest
Feature: User add review to Canon EOS 5D from Desktops tab

Background:    
		Given user is on Retail home page 
		When User click on Desktops tab
		And User click on Show all desktops
		

@addReviewToCanonEos5D @desktopTest
Scenario Outline: User add review to Canon EOS 5D from Desktops tab
		And User click on Canon EOS 5D item
		And User click on write a review link
		And user fill the review information with below information "<yourname>" "<yourReview>" "<Rating>"
		And User click on Continue Button
		Then User should see a message with "Thank you for your review. It has been submitted to the webmaster for approval."
		
		
Examples:
		|yourname| yourReview | Rating|
		|yourname| Lorem ipsum dolor sit amet, consectetur tincidunt.| 3 |