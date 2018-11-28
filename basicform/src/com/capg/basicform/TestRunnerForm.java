package com.capg.basicform;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:jsonlog/jsonfile"},glue= {"com.capg.basicform"})
public class TestRunnerForm {

}
