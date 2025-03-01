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

//	public String CSV_Path = "./TestData/Tenant.csv";
//	CSVReader csvReader;
//	public String[] csvRow;

	public Registration(TestHooks hooks) {
		this.driver = hooks.getDriver();
	}

	// Verify user in on home page
	
	public void userOnHomePage() {

		String strText = fnGetCurrentURL("User is on Home page.");
		if (strText.contains(Xpaths.URL)) {
			logs.info("User is on Home page.");
		} else {
			logs.error("User is not on Home page.");
		}
		assertEquals(strText, Xpaths.URL);
		logs.info("Get the URL: " + strText + "");
	}
	
	// Verify user in on home page
	
	public void registration_Button() {

		String strText = fnGetCurrentURL("User is on Home page.");
		if (strText.contains(Xpaths.URL)) {
			driver.findElement(Xpaths.registration_Btn).click();
			logs.info("Clicked On Create Account Button.");
		} else {
			logs.error("Create Account Button Not Found.");
		}
	}
	
	public void registration_Page() {

		String strText = fnGetCurrentURL("User is on Create Account Page.");
		if (strText.contains(Xpaths.createAcc_URL)) {
			String reg_Page = driver.findElement(Xpaths.account_Page).getText();
			logs.info("User is on Create Account Page." + reg_Page);
		} else {
			logs.error("User is not on Create Account Page.");
		}

	}
	

}
