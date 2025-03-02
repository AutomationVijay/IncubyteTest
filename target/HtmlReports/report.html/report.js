$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/LoginAccount.feature");
formatter.feature({
  "name": "Login Account Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_1 - Login Account with No credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on dashboard for Login Account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_is_on_dashboard_for_Login_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button to open Sign In page",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_to_open_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button without credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_without_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify empty fields validation for sign in page",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_empty_fields_validation_for_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_2 - Login Account with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on dashboard for Login Account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_is_on_dashboard_for_Login_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button to open Sign In page",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_to_open_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter invalid data in the field",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.enter_invalid_data_in_the_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button with invalid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_with_invalid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify validation for Sign In page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_validation_for_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_3 - Login and Logout Account with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on dashboard for Login Account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_is_on_dashboard_for_Login_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button to open Sign In page",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_to_open_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid data in the field",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.enter_valid_data_in_the_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button with valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Sign In status",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_Sign_In_status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout from the account",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.logout_from_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_4 - Login with disabled temporarily account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on dashboard for Login Account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_is_on_dashboard_for_Login_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button to open Sign In page",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_to_open_Sign_In_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter disabled temporarily data in the field",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.enter_disabled_temporarily_data_in_the_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign In button with disabled temporarily credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.user_click_on_Sign_In_button_with_disabled_temporarily_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify disabled temporarily account login",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.LoginAccountStep.verify_disabled_temporarily_account_login()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.fail(Assert.java:96)\r\n\tat com.qa.workflow.LoginAccount.disable_Account(LoginAccount.java:233)\r\n\tat com.example.steps.LoginAccountStep.verify_disabled_temporarily_account_login(LoginAccountStep.java:92)\r\n\tat ✽.verify disabled temporarily account login(file:///D:/Automation/Projects/IncubyteTest/src/test/resources/feature/LoginAccount.feature:33)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "TC_4 - Login with disabled temporarily account");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});