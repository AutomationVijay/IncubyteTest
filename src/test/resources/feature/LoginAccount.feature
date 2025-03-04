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

  Scenario: TC_3 - Login and Logout Account with valid credentials
    Given user is on dashboard for Login Account
    When user click on Sign In button to open Sign In page
    And verify user is on login page
    And enter valid data in the field
    Then user click on Sign In button with valid credentials
    Then verify Sign In status
    And logout from the account

  Scenario: TC_4 - Login with disabled temporarily account
    Given user is on dashboard for Login Account
    When user click on Sign In button to open Sign In page
    And verify user is on login page
    And enter disabled temporarily data in the field
    Then user click on Sign In button with disabled temporarily credentials
    And verify disabled temporarily account login
