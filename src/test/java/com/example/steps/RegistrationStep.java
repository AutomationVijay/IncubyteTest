package com.example.steps;

import com.example.hooks.TestHooks;
import com.qa.workflow.Registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationStep {
	TestHooks hook;
	private Registration register;

	public RegistrationStep(TestHooks hooks) {
		this.hook = hooks;
	}

	@Given("user is on dashboard for tenant")
	public void user_is_on_dashboard_for_tenant() throws Exception {
		register = new Registration(hook);
		register.userOnHomePage();
	}

	@Then("user click on Create an Account")
	public void user_click_on_Create_an_Account() throws Exception {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("verify user is on registration page")
	public void verify_user_is_on_registration_page() throws Exception {
		// Write code here that turns the phrase above into concrete actions

	}

}
