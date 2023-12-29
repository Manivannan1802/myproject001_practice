package testRun;

import org.junit.runner.RunWith;

/*import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;*/



import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\megal\\git\\myproject001_practice\\Banking Feature\\NewCustomer.feature",
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome=true,// display console output in a proper readable format
		
				plugin = { "pretty","html:target/cucumber-reports.html"}
		//plugin = { "pretty", "html:target/cucumber-reports.html" }
		)

public class testRunner {
	

}
