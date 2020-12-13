package com.adactin.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adactin.utility.FileReaderManager;
import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		/* "pretty", "html:Report\\CucumberReport",  "json:Report\\CucumberReport.json",*/
		"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html" })

public class Runner extends BaseClass {
	private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    /**
     * @return returns two dimensional array of {@link CucumberFeatureWrapper} objects.
     */
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
	
	public static WebDriver driver;

	@BeforeClass
	public static void browswerOpen() throws IOException {
		String browserName = FileReaderManager.getInstance().getCRInstance().getBrowserName();
		driver = browserLaunch(browserName);
	}

	@AfterClass
	public static void browserClose() {
		driver.close();
	}

}
