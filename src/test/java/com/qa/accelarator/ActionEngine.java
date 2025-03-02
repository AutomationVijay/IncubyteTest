package com.qa.accelarator;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.example.hooks.TestHooks;
import com.qa.reports.Reporter;

import io.cucumber.java.Scenario;

public class ActionEngine extends TestHooks {

	/***
	 * Name of Function :- fnGetURL Class Name :- ActionEngine
	 */
	public boolean fnGetURL(String strURL, String strDescription) {
		boolean blnStatus = true;
		try {
			driver.get(strURL);
			Reporter.pass("Open URL " + strDescription, "Successfully Launch URL " + strURL);
		} catch (Exception e) {
			blnStatus = false;
			Reporter.fail("Open URL " + strDescription, "Unable to Launch URL " + strURL);
		}
		return blnStatus;
	}

	/***
	 * Name of Function :- fnMaximizeBrowser Class Name :- ActionEngine
	 */
	public void fnMaximizeBrowser() {
		driver.manage().window().maximize();
	}

	/***
	 * Name of Function :- fnFullScreenBrowser Class Name :- ActionEngine
	 */
	public void fnFullScreenBrowser() {
		driver.manage().window().fullscreen();
	}

	/***
	 * Name of Function :- fnDeleteAllCookies Class Name :- ActionEngine
	 */
	public void fnDeleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	/***
	 * Name of Function :- fnCloseTestDriver Class Name :- ActionEngine
	 */
	public void fnCloseTestDriver() {
		driver.close();
	}

	/***
	 * Name of Function :- fnQuitDriver Class Name :- ActionEngine
	 */
	public void fnQuitDriver() {
		driver.quit();
	}

	/***
	 * Name of Function :- fnGetTitle Class Name :- ActionEngine
	 */
	public String fnGetTitle(String strDescription) {
		String strTitle = "";
		try {
			strTitle = driver.getTitle();
			Reporter.pass("Get Title " + strDescription, "Successfully Get Title " + strTitle);
		} catch (Exception e) {
			Reporter.fail("Get Title " + strDescription, "Unable to Get Title");
		}
		return strTitle;
	}


	/***
	 * Name of Function :- fnGetCurrentURL Class Name :- ActionEngine
	 */
	public String fnGetCurrentURL(String strDescription) {
		String strCurrentURL = "";
		try {
			strCurrentURL = driver.getCurrentUrl();
			Reporter.pass("Get Current URL " + strDescription, "Successfully Get Current URL : " + strCurrentURL);
		} catch (Exception e) {
			Reporter.fail("Get Current URL " + strDescription, "Unable to Get Current URL");
		}
		return strCurrentURL;
	}


	/***
	 * Name of Function :- fnValidRandomString Class Name :- ActionEngine, By Vijay
	 */
	public static String fnValidRandomString() {
		String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@._,()&-";
		String randomStr = RandomStringUtils.random(5, aToZ);
		return randomStr;
	}

	/***
	 * Name of Function :- fnValidRandomString256 Class Name :- ActionEngine, By
	 * Vijay
	 */
	public static String fnValidRandomString256() {
		String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@._,()&-";
		String randomStr = RandomStringUtils.random(255, aToZ);
		return randomStr;
	}

	/***
	 * Name of Function :- fnRandomString Class Name :- ActionEngine, By Vijay
	 */
	public static String fnInvalidRandomString() {
		String aToZ = "^[a-zA-Z @._,()&-]+$123456789~!#$%^*=[]{};':<>?/+";
		String randomStr = RandomStringUtils.random(15, aToZ);
		return randomStr;
	}

	public void fnImplicitWait() {
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	}
}
