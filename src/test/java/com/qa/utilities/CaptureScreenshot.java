package com.qa.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {

	public static void captureSS(WebDriver driver, String screenshotName) {
		try {
			//Take the screenshot
			TakesScreenshot ts = (TakesScreenshot)driver;
			//store as file format
			File source=ts.getScreenshotAs(OutputType.FILE);
			// Open the current date and time
			String timestamp = new SimpleDateFormat("yyyy_MM_dd-hh_mm_ss").format(new Date());
			//Copy the screenshot on the desire location with different name using current date and time
			FileUtils.copyFile(source, new File("./ScreenShots/"+screenshotName+"-"+timestamp+".jpg"));
		}
		catch (Exception e){
			System.out.println("Exception while taking screenshot "+e.getMessage());
		}
	}
}
