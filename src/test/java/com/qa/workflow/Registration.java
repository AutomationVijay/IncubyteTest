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

}
