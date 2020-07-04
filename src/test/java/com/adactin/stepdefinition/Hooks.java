package com.adactin.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void beforeHooks(Scenario scenario) {
		System.out.println(scenario.getName());
		System.out.println("\tHooks: Scenario Started");
		System.out.println("\tStatus:"+scenario.getStatus()+"\n");
		
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		//System.out.println(scenario.getName());
		if (scenario.isFailed()) {
			getScreenshot(scenario.getName());
		}
		System.out.println("\tHooks: Scenario Completed\n");
	}

}
