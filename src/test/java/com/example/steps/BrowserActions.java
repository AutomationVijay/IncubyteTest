package com.example.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.example.hooks.TestHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BrowserActions
{
	TestHooks hooks;
   
	public BrowserActions(TestHooks hooks) {
        this.hooks = hooks;
    }
	
	@Before
    public void setUp() throws Exception {
		hooks.setUp();
    }
    
	@After(order = 1)
    public void tearDown(Scenario scenario) throws Exception {
		 if(scenario.isFailed())
	        {
	            TakesScreenshot ts = (TakesScreenshot) hooks.driver;
	            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        } 
    }
	
    @After(order = 0)
    public void tearDown() throws Exception {
    	hooks.tearDown();
    }

}
