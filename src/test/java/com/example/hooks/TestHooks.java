package com.example.hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.reports.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHooks extends Reporter {
	private final static Logger logs = LogManager.getLogger(TestHooks.class.getName());
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	public static WebDriver driver;

	public void setUp() throws Exception {
		if (Xpaths.strBrowserName.toLowerCase().startsWith("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		driver.manage().window().maximize();
		logs.info("browser is open successfully.");
		driver.manage().deleteAllCookies();

		if (Xpaths.server.toLowerCase().startsWith("test")) {
			driver.get(Xpaths.URL);
			logs.info("Open URL ", "Successfully Launch URL " + Xpaths.URL);
		}

		Thread.sleep(1000);
		String strTitle = driver.getTitle();
		if (strTitle.contains("Home Page")) {
			logs.info("Title Matched as - " + strTitle);
		} else {
			logs.error("Title not Matched as - " + "Home Page");
		}

	}

	public void tearDown() throws Exception {
		logs.info("GrantThornton | Compliance Tracker", "Logout");

		driver.close();
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}
}