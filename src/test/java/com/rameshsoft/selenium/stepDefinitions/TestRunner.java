package com.rameshsoft.selenium.stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/Facebook_Test.feature",
                 glue="com.rameshsoft.selenium.stepDefinitions", 
                 plugin = {"html:target/cucumber"},
                 dryRun=false,
                 strict=false,
                 monochrome=true)
                 //tags="@Rameshsoft")

public class TestRunner 
{

}
