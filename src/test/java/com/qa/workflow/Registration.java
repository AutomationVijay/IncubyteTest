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
			String reg_Page = driver.findElement(Xpaths.registration_Page).getText();
			logs.info("User is on Create Account Page - " + reg_Page);
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

	// verify all validation for empty fields

	public void verify_Validation() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page for varify validation.");
		if (strText.contains(Xpaths.createAcc_URL)) {

			// First Name Validation
			String firstNameValidation = driver.findElement(Xpaths.first_Name_Error).getText();
			if (firstNameValidation.contains(Xpaths.validation_Msg)) {
				logs.info("Validation for empty First Name is - " + firstNameValidation);
			} else {
				logs.error("Validation for empty First Name is not found");
			}

			// Last Name Validation
			String lastNameValidation = driver.findElement(Xpaths.last_Name_Error).getText();
			if (lastNameValidation.contains(Xpaths.validation_Msg)) {
				logs.info("Validation for empty Last Name is - " + lastNameValidation);
			} else {
				logs.error("Validation for empty Last Name is not found");
			}

			// Email ID Validation
			String emailIDValidation = driver.findElement(Xpaths.email_ID_Error).getText();
			if (emailIDValidation.contains(Xpaths.validation_Msg)) {
				logs.info("Validation for empty Email ID is - " + emailIDValidation);
			} else {
				logs.error("Validation for empty Email ID is not found");
			}

			// Password Validation
			String passwordValidation = driver.findElement(Xpaths.pass_word_Error).getText();
			if (passwordValidation.contains(Xpaths.validation_Msg)) {
				logs.info("Validation for empty Password is - " + passwordValidation);
			} else {
				logs.error("Validation for empty Password is not found");
			}

			// Confirm Password Validation
			String confirmPasswordValidation = driver.findElement(Xpaths.pass_word_confirm_Error).getText();
			if (confirmPasswordValidation.contains(Xpaths.validation_Msg)) {
				logs.info("Validation for empty Confirm Password is - " + confirmPasswordValidation);
			} else {
				logs.error("Validation for empty Comfirm Password is not found");
			}

			Thread.sleep(3000);
		} else {
			logs.error("Create Account Page Not Found.");
		}
	}

	// Create Account with invalid data

	public void create_Invalid_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page for account create.");
		if (strText.contains(Xpaths.createAcc_URL)) {

			// First Name
			driver.findElement(Xpaths.first_Name).sendKeys(Xpaths.firstName);

			// Last Name
			driver.findElement(Xpaths.last_Name).sendKeys(Xpaths.lastName);

			// Email ID Validation
			driver.findElement(Xpaths.email_ID).sendKeys(Xpaths.invalid_email);

			// Password Validation
			driver.findElement(Xpaths.pass_word).sendKeys(Xpaths.password);

			// Confirm Password Validation
			driver.findElement(Xpaths.pass_word_confirm).sendKeys(Xpaths.invali_password);

			Thread.sleep(3000);
		} else {
			logs.error("Create Account Page Not Found.");
		}
	}

	// verify all validation for invalid data

	public void verify_Invalid_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page for varify validation.");
		if (strText.contains(Xpaths.createAcc_URL)) {

			// Email ID Validation
			String emailIDValidation = driver.findElement(Xpaths.email_ID_Error).getText();
			if (emailIDValidation.contains(Xpaths.email_invalid_Msg)) {
				logs.info("Validation for invalid Email ID is - " + emailIDValidation);
			} else {
				logs.error("Validation for invalid Email ID is not found");
			}

			// Confirm Password Validation
			String confirmPasswordValidation = driver.findElement(Xpaths.pass_word_confirm_Error).getText();
			if (confirmPasswordValidation.contains(Xpaths.password_invalid_Msg)) {
				logs.info("Validation for invalid Confirm Password is - " + confirmPasswordValidation);
			} else {
				logs.error("Validation for invalid Comfirm Password is not found");
			}

			Thread.sleep(3000);
		} else {
			logs.error("Create Account Page Not Found.");
		}
	}

	// Create Account with data

	public void create_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page for account create.");
		if (strText.contains(Xpaths.createAcc_URL)) {

			// First Name
			driver.findElement(Xpaths.first_Name).sendKeys(Xpaths.firstName);

			// Last Name
			driver.findElement(Xpaths.last_Name).sendKeys(Xpaths.lastName);

			// Email ID Validation
			driver.findElement(Xpaths.email_ID).sendKeys(Xpaths.email);

			// Password Validation
			driver.findElement(Xpaths.pass_word).sendKeys(Xpaths.password);

			// Confirm Password Validation
			driver.findElement(Xpaths.pass_word_confirm).sendKeys(Xpaths.password);

			Thread.sleep(3000);
		} else {
			logs.error("Create Account Page Not Found.");
		}
	}

	// Verify Account is created

	public void verify_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on My Account Page.");
		if (strText.contains(Xpaths.Account_URL)) {
			String acc_Status = driver.findElement(Xpaths.Account_Status).getText();
			if (acc_Status.equalsIgnoreCase(Xpaths.Account_Create_Msg)) {
				logs.info("Account is created Successfully - " + Xpaths.Account_Create_Msg);
			} else if (acc_Status.equalsIgnoreCase(Xpaths.Account_Duplicate_Msg)) {
				logs.error("Account is not created - " + Xpaths.Account_Duplicate_Msg);
			} else {
				logs.error("Account is not created, Verify the Credentials");
			}

		} else {
			logs.error("User is not on My Account Page.");
		}
	}
	
	// Verify Account is created

	public void duplicate_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on My Account Page.");
		if (strText.contains(Xpaths.Account_URL)) {
			String acc_Status = driver.findElement(Xpaths.Account_Status).getText();
			if (acc_Status.equalsIgnoreCase(Xpaths.Account_Create_Msg)) {
				logs.info("Account is created Successfully - " + Xpaths.Account_Create_Msg);
			} else if (acc_Status.equalsIgnoreCase(Xpaths.Account_Duplicate_Msg)) {
				logs.error("Account is not created - " + Xpaths.Account_Duplicate_Msg);
			} else {
				logs.error("Account is not created, Verify the Credentials");
			}

		} else {
			logs.error("User is not on My Account Page.");
		}
	}

}
