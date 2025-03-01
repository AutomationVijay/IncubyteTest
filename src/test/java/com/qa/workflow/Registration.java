package com.qa.workflow;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.example.hooks.TestHooks;
import com.example.hooks.Xpaths;
import com.qa.accelarator.ActionEngine;

public class Registration extends ActionEngine {
	private final static Logger logs = LogManager.getLogger(Registration.class.getName());
	private WebDriver driver;
	TestHooks hooks;

	public Registration(TestHooks hooks) {
		this.driver = hooks.getDriver();
	}

	// user is on dashboard for Create Account

	public void userOnHomePage() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page.");
		if (strText.contains(Xpaths.URL)) {
			logs.info("User is on Home page.");
		} else {
			logs.error("User is not on Home page.");
		}
		assertEquals(strText, Xpaths.URL);
		logs.info("Get the URL: " + strText + "");
	}

	// user click on Create an Account

	public void registration_Button() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page.");
		if (strText.contains(Xpaths.URL)) {
			driver.findElement(Xpaths.registration_Btn).click();
			logs.info("Clicked On Create Account Button.");
		} else {
			logs.error("User is not on Home page.");
		}
	}

	// verify user is on registration page

	public void registration_Page() throws Exception {

		String strText = fnGetCurrentURL("User is on Create Account Page.");
		if (strText.contains(Xpaths.createAcc_URL)) {
			String reg_Page = driver.findElement(Xpaths.account_Page).getText();
			logs.info("User is on Create Account Page." + reg_Page);
		} else {
			logs.error("User is not on Create Account Page.");
		}

	}

	// click on create an account button

	public void account_Create() throws Exception {

		String strText = fnGetCurrentURL("User is on Create Account Page for Create Account.");
		if (strText.contains(Xpaths.createAcc_URL)) {
			driver.findElement(Xpaths.registration_Acc_btn).click();
			logs.info("Clicked On Create Account Button.");
		} else {
			logs.error("User is not on Create Account Page.");
		}
	}

	// verify all validation

	public void verify_Validation() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page for varify validation.");
		if (strText.contains(Xpaths.createAcc_URL)) {

			// First Name Validation
			String firstNameValidation = driver.findElement(Xpaths.first_Name).getText();
			if (firstNameValidation.contains(Xpaths.validation)) {
				logs.info("Validation for empty First Name is " + firstNameValidation);
			}

			// Last Name Validation
			String lastNameValidation = driver.findElement(Xpaths.last_Name).getText();
			if (lastNameValidation.contains(Xpaths.validation)) {
				logs.info("Validation for empty Last Name is " + lastNameValidation);
			}

			// Email ID Validation
			String emailIDValidation = driver.findElement(Xpaths.email_ID_Error).getText();
			if (emailIDValidation.contains(Xpaths.validation)) {
				logs.info("Validation for empty Email ID is " + emailIDValidation);
			}

			// Password Validation
			String passwordValidation = driver.findElement(Xpaths.pass_word_Error).getText();
			if (passwordValidation.contains(Xpaths.validation)) {
				logs.info("Validation for empty Password is " + passwordValidation);
			}

			// Confirm Password Validation
			String confirmPasswordValidation = driver.findElement(Xpaths.pass_word_confirm_Error).getText();
			if (confirmPasswordValidation.contains(Xpaths.validation)) {
				logs.info("Validation for empty Confirm Password is " + confirmPasswordValidation);
			}

			Thread.sleep(3000);
		} else {
			logs.error("Create Account Page Not Found.");
		}
	}

}
