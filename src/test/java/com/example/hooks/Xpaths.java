package com.example.hooks;

import org.openqa.selenium.By;

import com.qa.accelarator.ActionEngine;

public class Xpaths extends ActionEngine{

	// Browser= chrome, firefox, edge, ie, safari

	public static String strBrowserName = "chrome";

	// URL= test

	public static String server = "Test";

	// Module URL
	
	public static String URL = "https://magento.softwaretestingboard.com/";
	public static String createAcc_URL = "https://magento.softwaretestingboard.com/customer/account/create/";
	public static String Account_URL = "https://magento.softwaretestingboard.com/customer/account/";
	
	public static String SignIn_URL = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";
	public static String Login_Account_URL = "https://magento.softwaretestingboard.com/customer/account/index/";
	
	
	

	// Data for Account Create
	
	public static String strText = fnValidRandomString();

	public static String firstName = "Vijay";
	public static String lastName = "Navgire";
	public static String email = "vijay"+strText+"@yopmail.com";
	public static String invalid_email = "vijaynavgire";
	public static String password = "Vijay@123";
	public static String invali_password = "Vijay";

	// Home Page
	public static By actual_Home = By.xpath("//span[@class=\"base\"]");
	public static String expected_Home = "Home Page";

	// Create Account
	
	public static By registration_Btn = By.xpath("(//a[normalize-space()='Create an Account'])[1]");
	public static By registration_Page = By.xpath("(//span[@class='base'])[1]");
	public static By registration_Acc_btn = By.xpath("(//span[normalize-space()='Create an Account'])[1]");

	// All Field validation

	public static String validation_Msg = "This is a required field.";
	public static String email_invalid_Msg = "Please enter a valid email address (Ex: johndoe@domain.com).";
	public static String password_invalid_Msg = "Please enter the same value again.";

	public static By first_Name_Error = By.xpath("//div[@id='firstname-error']");
	public static By last_Name_Error = By.xpath("//div[@id='lastname-error']");
	public static By email_ID_Error = By.xpath("//div[@id='email_address-error']");
	public static By pass_word_Error = By.xpath("//div[@id='password-error']");
	public static By pass_word_confirm_Error = By.xpath("//div[@id='password-confirmation-error']");

	// Create account data field form

	public static By first_Name = By.xpath("//input[@id='firstname']");
	public static By last_Name = By.xpath("//input[@id='lastname']");
	public static By email_ID = By.xpath("//input[@id='email_address']");
	public static By pass_word = By.xpath("//input[@id='password']");
	public static By pass_word_confirm = By.xpath("//input[@id='password-confirmation']");

	// Created Account Verified

	public static By Account_Status = By
			.xpath("//div[@role=\"alert\"]//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

	public static String Account_Create_Msg = "Thank you for registering with Main Website Store.";
	public static String Account_Duplicate_Msg = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";

	
	// Sign In and Sign Out Page 
	
	public static By Sign_In_btn = By.xpath("(//a[contains(text(),'Sign In')])[1]");
	
	public static String Login_Page = "Customer Login";
	public static By login_Page = By.xpath("(//span[@class='base'])[1]");
	public static By login_signIn_Btn = By.xpath("(//span[normalize-space(text())='Sign In'])[1]");
	
	public static By login_email = By.xpath("(//input[@id='email'])[1]");
	public static By login_Password = By.xpath("(//input[@id='pass'])[1]");
	
	public static By login_email_Error = By.xpath("(//div[@id='email-error'])[1]");
	public static By login_password_Error = By.xpath("(//div[@id='pass-error'])[1]");
	
	public static By login_Account = By.xpath("//div[@class='panel header']//span[@class='logged-in']");
	public static String login_Invalid_Msg = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
	
	public static By logout_Btn = By.xpath("(//button[@type='button'])[1]");
	public static By sign_Out = By.xpath("(//a[normalize-space()='Sign Out'])[1]");
	
}
