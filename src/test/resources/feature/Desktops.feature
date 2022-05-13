@CompleteTest
Feature: Retail desktop page

Background: 
	Given user is on Retail home page 

@desktopTest
Scenario: User verify all items are present in Desktop tab
		When User click on Desktops tab
		And User click on Show all desktops
		Then User should see all items are present in Desktop page