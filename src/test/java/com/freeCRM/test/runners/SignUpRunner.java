package com.freeCRM.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Owner\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\Feautures\\signup.feature"
, glue="C:\\Users\\Owner\\eclipse-workspace\\CucumberMaven\\src\\test\\java\\com\\freeCRM\\test\\stepDefinitions\\SignUpSteps.java") 

public class SignUpRunner {

}
