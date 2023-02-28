package com.qe.test.runner;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "C://Users//moukumar//IdeaProjects//SeleniumMavenNew//src//test//resources//Features//Login.feature" },
		glue = {"//com.qe.test.stepdefinition.Login.LoginStepDef"} ,
		dryRun = true,
		monochrome = true,
		plugin = {"pretty"})
public class Run {
}


// /SeleniumMavenNew/src/main/java/Feature/Login.feature

//tags = "@tag1", monochrome = true, plugin = { "pretty",
//		"html:target/cucumber-reports/cucumber-html-reports",
//	"json:target/cucumber-reports/cucumber-html-reports/common.json" })
//com.qe.test.stepdefinition
//src/test/resources