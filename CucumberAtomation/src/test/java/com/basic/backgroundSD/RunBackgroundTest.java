package com.basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		monochrome = true,
		//dryRun = true,
		features = {"src/test/resources/com/basic/backgroundFF/"},
		glue = {"com/basic/backgroundSD/"},
		plugin = { "pretty", 
				             "html:target/cucumber-htmlreport",
				             "json:target/cucumber-report1.json",
                             "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"})

public class RunBackgroundTest {

}
