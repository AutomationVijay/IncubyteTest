package com.example.steps;

import com.example.hooks.TestHooks;
import com.qa.workflow.Registration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationStep {
	TestHooks hook;
	private Registration register;

	public RegistrationStep(TestHooks hooks) {
		this.hook = hooks;
	}

	@Given("user is on dashboard for Create Account")
	public void user_is_on_dashboard_for_Create_Account() throws Exception {
		register = new Registration(hook);
		register.userOnHomePage();
	}

	@Then("user click on Create an Account")
	public void user_click_on_Create_an_Account() throws Exception {
		register.registration_Button();
	}

	@Then("verify user is on registration page")
	public void verify_user_is_on_registration_page() throws Exception {
		register.registration_Page();
	}

	@Then("click on create an account button")
	public void click_on_create_an_account_button() throws Exception {
		register.account_Create();
	}

	@And("verify all validation")
	public void verify_all_validation() throws Exception {
		register.verify_Validation();
	}

	@Then("enter invalid data in the fields")
	public void enter_invalid_data_in_the_fields() throws Exception {
		register.create_Invalid_Account();
	}

	@Then("verify invalid account validation")
	public void verify_invalid_account_validation() throws Exception {
		register.verify_Invalid_Account();
	}

	@Then("enter valid data in the fields")
	public void enter_valid_data_in_the_fields() throws Exception {
		register.create_Account();
	}

	@And("verify account create")
	public void verify_account_create() throws Exception {
		register.verify_Account();
	}

	@And("verify duplicate account create")
	public void verify_duplicate_account_create() throws Exception {
		register.duplicate_Account();
	}

}
