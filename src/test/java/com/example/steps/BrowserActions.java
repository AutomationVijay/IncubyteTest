package com.example.steps;

import static com.example.hooks.TestHooks.driver;

import com.example.hooks.TestHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
import ru.yandex.qatools.ashot.util.ImageTool;
import ru.yandex.qatools.ashot.Screenshot;

public class BrowserActions {
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
		if (scenario.isFailed()) {
			AShot aShot = new AShot();
			ShootingStrategy shootingStrategy = ShootingStrategies.viewportPasting(1000);
			Screenshot screenshot = aShot.shootingStrategy(shootingStrategy)
					.coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver);

			byte[] screenshotBytes = ImageTool.toByteArray(screenshot.getImage());
			scenario.attach(screenshotBytes, "image/png", scenario.getName());
		}
	}

	@After(order = 0)
	public void tearDown() throws Exception {
		hooks.tearDown();
	}

}
