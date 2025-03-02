package com.qa.workflow;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.example.hooks.TestHooks;
import com.example.hooks.Xpaths;
import com.qa.accelarator.ActionEngine;

public class LoginAccount extends ActionEngine {
	private final static Logger logs = LogManager.getLogger(Registration.class.getName());
	private WebDriver driver;
	TestHooks hooks;

	public LoginAccount(TestHooks hooks) {
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

	// user click on Sign In button to open login page

	public void signIn_Button() throws Exception {

		String strText = fnGetCurrentURL("User is on Home page.");
		if (strText.contains(Xpaths.URL)) {
			driver.findElement(Xpaths.Sign_In_btn).click();
			logs.info("Clicked On Sign In Button.");
		} else {
			logs.error("User is not on Home page.");
		}
	}

	// verify user is on login page

	public void login_Page() throws Exception {

		String strText = fnGetCurrentURL("User is on login Page.");
		if (strText.contains(Xpaths.SignIn_URL)) {
			String reg_Page = driver.findElement(Xpaths.login_Page).getText();
			logs.info("User is on login Page - " + reg_Page);
		} else {
			logs.error("User is not on login Page.");
		}

	}

	// click on Sign up button for login an account

	public void account_login() throws Exception {

		String strText = fnGetCurrentURL("User is on login Page for login Account.");
		if (strText.contains(Xpaths.SignIn_URL)) {
			Thread.sleep(3000);
			driver.findElement(Xpaths.login_signIn_Btn).click();
			Thread.sleep(2000);
			logs.info("Clicked On Sign In Button.");
		} else {
			logs.error("User is not on login Page for login Account.");
		}
	}

	// verify all validation for empty fields

	public void verify_Validation() throws Exception {

		String strText = fnGetCurrentURL("User is on Sign In for varify validation.");
		if (strText.contains(Xpaths.SignIn_URL)) {

			// Email ID Validation
			String emailIDValidation = driver.findElement(Xpaths.login_email_Error).getText();
			if (emailIDValidation.contains(Xpaths.validation_Msg)) {
				logs.info("Validation for empty Email ID is - " + emailIDValidation);
			} else {
				logs.error("Validation for empty Email ID is not found");
			}

			// Password Validation
			String passwordValidation = driver.findElement(Xpaths.login_password_Error).getText();
			if (passwordValidation.contains(Xpaths.validation_Msg)) {
				logs.info("Validation for empty Password is - " + passwordValidation);
			} else {
				logs.error("Validation for empty Password is not found");
			}

			Thread.sleep(3000);
		} else {
			logs.error("Sign In Page Not Found.");
		}
	}

	// Sign In with invalid data

	public void signIn_Invalid_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on Sign In page for account login.");
		if (strText.contains(Xpaths.SignIn_URL)) {

			// Email ID Validation
			driver.findElement(Xpaths.login_email).sendKeys(Xpaths.invalid_email);

			// Password Validation
			driver.findElement(Xpaths.login_Password).sendKeys(Xpaths.invali_password);

			Thread.sleep(3000);
		} else {
			logs.error("Sign In Page Not Found.");
		}
	}

	// verify validation for invalid data

	public void verify_Invalid_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on login page for varify validation.");
		if (strText.contains(Xpaths.SignIn_URL)) {

			// Email ID Validation
			String emailIDValidation = driver.findElement(Xpaths.login_email_Error).getText();
			if (emailIDValidation.contains(Xpaths.email_invalid_Msg)) {
				logs.info("Validation for invalid Email ID is - " + emailIDValidation);
			} else {
				logs.error("Validation for invalid Email ID is not found");
			}

			Thread.sleep(3000);
		} else {
			logs.error("User is not on login page for varify validation.");
		}
	}

	// login account with valid data

	public void login_Account() throws Exception {

		String strText = fnGetCurrentURL("User is on Sign In page for account login.");
		if (strText.contains(Xpaths.SignIn_URL)) {

			// Email ID Validation
			driver.findElement(Xpaths.login_email).sendKeys(Xpaths.email);
			logs.info("Enter Email ID - " + Xpaths.email);

			// Password Validation
			driver.findElement(Xpaths.login_Password).sendKeys(Xpaths.password);
			logs.info("Enter Password - " + Xpaths.password);
			Thread.sleep(2000);
		} else {
			logs.error("User is not on Sign In page for account login.");
		}
	}

	// Verify Account is Signed In

	public void signIn_Account() throws Exception {

		Thread.sleep(3000);
		boolean acc_Status = driver.findElement(Xpaths.login_Account).isDisplayed();
		if (acc_Status) {
			logs.info("Account is logged In Successfully - " + driver.findElement(Xpaths.login_Account).getText());
		} else {
			logs.error("Account is not logged In, Verify the Credentials");
		}

	}

	// Verify Account is Signed Out

	public void logout_Account() throws Exception {
		Thread.sleep(3000);
		boolean acc_Status = driver.findElement(Xpaths.login_Account).isDisplayed();
		if (acc_Status) {
			driver.findElement(Xpaths.logout_Btn).click();
			Thread.sleep(2000);
			driver.findElement(Xpaths.sign_Out).click();
			String strText = fnGetCurrentURL("User is on Sign In page for account login.");
			if (strText.contains(Xpaths.URL)) {
				Thread.sleep(1000);
				logs.info("Account is logged Out Successfully - " + driver.findElement(Xpaths.actual_Home).getText());
			} else {
				logs.error("Account is not logged Out Successfully - " + strText);
			}

		} else {
			logs.error("Account is not logged In, Verify the Credentials");
		}

	}

	// duplicate_Account Verificate

	// Verify Account is Signed In

	public void disable_Account() throws Exception {

		Thread.sleep(3000);
		String acc_Status = driver.findElement(Xpaths.Account_Status).getText();
		if (acc_Status.equalsIgnoreCase(Xpaths.login_Invalid_Msg)) {
			logs.info("Account is not logged in. - " + acc_Status);
		} else {
			boolean isAccLogin = driver.findElement(Xpaths.login_Account).isDisplayed();
			if (isAccLogin) {
				logs.error("Account is Logged In and it is not duplicate, Verify the Credentials");
				Assert.fail();
			}

		}

	}

}
