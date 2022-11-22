@gmail
Feature: To Validate the login functionality of Gmail Application

	Background:
		Given The USer Should be in the Gmail login Page
		
		@validlogin
		Scenario: To Validate gmail login with valid credentials
			When The User has to enter the username and click the next button
			When The User has to enter the password and click the next button
			Then To validate the user profile for the valid login
			
		@invalidlogin
		Scenario: To Validate gmail login with invalid credentials
			When The User has to enter the username and click the next button
			When The User has to enter the invalid password and click the next button
			Then To validate the user profile for the Invalid valid login