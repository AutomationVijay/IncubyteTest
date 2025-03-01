Feature: Registration Feature

  Scenario: TC_1 - Open Create Account Page
    Given user is on dashboard for Create Account
    Then user click on Create an Account
    And verify user is on registration page

  Scenario: TC_2 - Validate Create Account Page with empty field
    Given user is on dashboard for Create Account
    Then user click on Create an Account
    And verify user is on registration page
    Then click on create an account button
    And verify all validation

  Scenario: TC_3 - Create Account with invalid data
    Given user is on dashboard for Create Account
    Then user click on Create an Account
    And verify user is on registration page
    Then enter invalid data in the fields
    And click on create an account button
    Then verify invalid account validation

  Scenario: TC_4 - Create Account with valid data
    Given user is on dashboard for Create Account
    Then user click on Create an Account
    And verify user is on registration page
    Then enter valid data in the fields
    And click on create an account button
    And verify account create
