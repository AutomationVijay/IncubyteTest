package com.example.steps;

import com.example.hooks.TestHooks;
import com.qa.workflow.LoginAccount;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAccountStep {
	TestHooks hook;
	private LoginAccount login;

	public LoginAccountStep(TestHooks hooks) {
		this.hook = hooks;
	}

	@Given("user is on dashboard for Login Account")
	public void user_is_on_dashboard_for_Login_Account() throws Exception {
		login = new LoginAccount(hook);
		login.userOnHomePage();
	}

	@When("user click on Sign In button to open Sign In page")
	public void user_click_on_Sign_In_button_to_open_Sign_In_page() throws Exception {
		login.signIn_Button();
	}

	@And("verify user is on login page")
	public void verify_user_is_on_login_page() throws Exception {
		login.login_Page();
	}

	@Then("user click on Sign In button without credentials")
	public void user_click_on_Sign_In_button_without_credentials() throws Exception {
		login.account_login();
	}

	@And("verify empty fields validation for sign in page")
	public void verify_empty_fields_validation_for_sign_in_page() throws Exception {
		login.verify_Validation();
	}

	@And("enter invalid data in the field")
	public void enter_invalid_data_in_the_field() throws Exception {
		login.signIn_Invalid_Account();
	}

	@Then("user click on Sign In button with invalid credentials")
	public void user_click_on_Sign_In_button_with_invalid_credentials() throws Exception {
		login.account_login();
	}

	@Then("verify validation for Sign In page")
	public void verify_validation_for_Sign_In_page() throws Exception {
		login.verify_Invalid_Account();
	}

	@And("enter valid data in the field")
	public void enter_valid_data_in_the_field() throws Exception {
		login.login_Account();
	}

	@Then("user click on Sign In button with valid credentials")
	public void user_click_on_Sign_In_button_with_valid_credentials() throws Exception {
		login.account_login();
	}

	@Then("verify Sign In status")
	public void verify_Sign_In_status() throws Exception {
		login.signIn_Account();
	}

	@And("logout from the account")
	public void logout_from_the_account() throws Exception {
		login.logout_Account();
	}

	@And("enter disabled temporarily data in the field")
	public void enter_disabled_temporarily_data_in_the_field() throws Exception {
		login.disable_Credentials();
	}

	@Then("user click on Sign In button with disabled temporarily credentials")
	public void user_click_on_Sign_In_button_with_disabled_temporarily_credentials() throws Exception {
		login.account_login();
	}

	@And("verify disabled temporarily account login")
	public void verify_disabled_temporarily_account_login() throws Exception {
		login.disable_Account();
	}

}
