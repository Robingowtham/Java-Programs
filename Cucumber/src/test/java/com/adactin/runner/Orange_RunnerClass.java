package com.adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="com.adactin.feature/Orange.feature", glue="com.adactin.stepdefinition")
public class Orange_RunnerClass {

		
}
