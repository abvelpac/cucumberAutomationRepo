Feature: Create account of Facebook11
	As a user you need to open facebook home page and do the validations

Scenario: Validate First Name field111
	Given User need to be on Facebook login page 
	When User enters user "David" first name 
	Then  User checks user "David" first name is present 
	
Scenario: Validate create user multiple fields112
	Given User need to be on Facebook login page 
	When User enters user "Ryan" first name 
	And User enters user "Jack" surname 
	Then User checks user "Ryan" first name is present 
	But user Mobile field should be blank 

    