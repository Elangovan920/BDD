package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdef",dryRun=false,
tags="@all",plugin= {"html:src\\test\\resources\\report",
		              "json:src\\test\\resources\\report\\jsonreport\\jreport.json",
		              "junit:src\\test\\resources\\report\\junitreport\\junitrepo.xml"})	

public class TestRunner {
	@AfterClass
	public static void rep() {
		JVMReports.generateReport("src\\test\\resources\\report\\jsonreport\\jreport.json");
         System.out.println("completed");
	}
}
