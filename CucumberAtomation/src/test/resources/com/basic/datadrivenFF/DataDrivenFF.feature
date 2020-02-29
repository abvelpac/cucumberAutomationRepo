Feature: Create account of Facebook2
	As a user you need to open facebook home page and do the validations


Scenario Outline: Validate create user multiple fields21
	Given User need to be on Facebook login page 
	When User enters user "<user>" first name 
	And User enters user "<surname>" surname 
	Then User checks user "<user>" first name is present 
	But user Mobile field should be blank 
	Then close browser 
	Examples: 
		|user  |surname	|
		|Tom   |Hanks   |
		|Jack  |Daniel  |
    