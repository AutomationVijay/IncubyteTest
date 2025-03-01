package com.example.hooks;

import org.openqa.selenium.By;

public class Xpaths {

	// Browser= chrome, firefox, edge, ie, safari

	public static String strBrowserName = "chrome";

	// URL= test

	public static String server = "Test";

	// Module URL

	public static String URL = "https://magento.softwaretestingboard.com/";
	
	
	// Data for Account Create
	
	public static String firstName  = "Vijay";
	public static String lastName  = "Navgire";
	public static String email  = "vijay.navgire007@gmail.com";
	public static String password  = "Vijay@12345";
	public static String invali_password  = "Vijay@123456";

	// Home Page 
	public static By actual_Home = By.xpath("//span[@class=\"base\"]");
	public static String expected_Home = "Home Page";
	
	// Create Account
	
	public static By registration_Btn = By.xpath("(//a[normalize-space()='Create an Account'])[1]");
	public static By account_Page = By.xpath("(//span[@class='base'])[1]");
	public static String createAcc_URL = "https://magento.softwaretestingboard.com/customer/account/create/";
	
	public static By registration_Acc_btn = By.xpath("(//span[normalize-space()='Create an Account'])[1]");
	
	// All Field validation
	
	public static String validation = "This is a required field.";
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

}
