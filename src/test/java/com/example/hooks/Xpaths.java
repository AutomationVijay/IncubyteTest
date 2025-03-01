package com.example.hooks;

import org.openqa.selenium.By;

public class Xpaths {

	// Browser= chrome, firefox, edge, ie, safari

	public static String strBrowserName = "chrome";

	// URL= test

	public static String server = "Test";

	// Module URL

	public static String URL = "https://magento.softwaretestingboard.com/";

	// Home Page 
	public static By actual_Home = By.xpath("//span[@class=\"base\"]");
	public static String expected_Home = "Home Page";
	
	// Create Account
	
	public static By registration_Btn = By.xpath("(//a[normalize-space()='Create an Account'])[1]");
	public static By account_Page = By.xpath("(//span[@class='base'])[1]");
	public static String createAcc_URL = "https://magento.softwaretestingboard.com/customer/account/create/";
	
	

}
