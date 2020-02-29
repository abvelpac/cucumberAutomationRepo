package com.basic.parametrizationSD;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		monochrome = true,
		//dryRun = true,
		features = {"src/test/resources/com/basic/parametrizationFF/"},
		glue = {"com/basic/parametrizationSD/"},
		plugin = { "pretty", 
				             "html:target/cucumber-htmlreport",
				             "json:target/cucumber-report8.json",
                             "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"})

public class RunParametrizationTest {

}
