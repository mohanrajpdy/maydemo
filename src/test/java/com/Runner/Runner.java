package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SRI\\eclipse-workspace\\Cucumber1\\src\\test\\java\\com\\Feature\\Adaction.feature",glue="com.Stepdef")
public class Runner extends Base {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver= browserLaunch("chrome");
		
	}
	
	
}
