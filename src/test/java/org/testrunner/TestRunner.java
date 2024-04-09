package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Asus\\eclipse-workspace\\VitraProject\\src\\test\\resources\\FeatureFiles\\Login.feature",glue = "org.stepdefinition", plugin={"junit:Report\\VitraReport.xml"} )

public class TestRunner {

}
