package com.emr.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features= {"features/Pharmacy.feature"},glue = {"com.emr.stepdefs"})

public class Testrunner extends AbstractTestNGCucumberTests {

}
