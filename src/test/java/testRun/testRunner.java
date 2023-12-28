package testRun;

import org.junit.runner.RunWith;

/*import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;*/



import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:/Users/sanma/eclipse-workspace/myproject001_practice/src/test/java/feature/login.feature",
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome=true,// display console output in a proper readable format
		
				plugin = { "pretty", "json:target/cucumber-reports.json",
						"junit:target/cucumber-reports.xml",
						"html:target/cucumber-reports.html"}
		//plugin = { "pretty", "html:target/cucumber-reports.html" }
		)

public class testRunner {
	

}
