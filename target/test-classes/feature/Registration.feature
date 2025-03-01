Feature: Registration Feature


		@test
		Scenario: TC_1 - Open Registration Page
		Given user is on dashboard for tenant
		Then user click on Create an Account
		And verify user is on registration page
		
		
		Scenario: TC_2 - Validate Registration Page with empty field
		Given user is on dashboard for tenant
		Then user click on Create an Account
		And verify user is on registration page
		Then click on create an account button
		And verify all validation
		
		Scenario: TC_3 - Create Account with valid data
		Given user is on dashboard for tenant
		Then user click on Create an Account
		And verify user is on registration page
		Then enter valid data in the fields
		And click on create an account button
		And verify account create
		
		
		
		
		