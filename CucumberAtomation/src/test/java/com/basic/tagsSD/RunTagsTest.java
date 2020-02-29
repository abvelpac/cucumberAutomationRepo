package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		monochrome = true,
		//dryRun = true,
		//tags = {"@Important"}, // All scenario execute if it is tag for featuree file
		//tags = {"@Smoke"}, // Only tag with smoke
		//tags = {"@Smoke", "@Regression"}, // AND condition
		tags = {"@Smoke,@Regression"}, // OR condition
		
		features = {"src/test/resources/com/basic/tagsFF/"},
		glue = {"com/basic/tagsSD/"},
		plugin = { "pretty", 
				             "html:target/cucumber-htmlreport",
				             "json:target/cucumber-report10.json",
				             "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"})

public class RunTagsTest {

}
