package com.AccountTestingSalesforce;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource"},
		format = {"pretty","html:target/site/cucumber-pretty", "json:target/cucumber.json"}
		)
public class RunnerSteps {

}
