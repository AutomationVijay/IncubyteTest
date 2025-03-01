Feature: Login Account Feature

  Scenario: TC_1 - Login Account with No credentials
    Given user is on dashboard for Login Account
    When user click on Sign In button to open Sign In page
    And verify user is on login page
    Then user click on Sign In button without credentials
    And verify empty fields validation for sign in page

  Scenario: TC_2 - Login Account with invalid credentials
    Given user is on dashboard for Login Account
    When user click on Sign In button to open Sign In page
    And verify user is on login page
    And enter invalid data in the field
    Then user click on Sign In button with invalid credentials
    Then verify validation for Sign In page

@test
  Scenario: TC_3 - Login Account with valid credentials
    Given user is on dashboard for Login Account
    When user click on Sign In button to open Sign In page
    And verify user is on login page
    And enter valid data in the field
    Then user click on Sign In button with valid credentials
    Then verify Sign In status
