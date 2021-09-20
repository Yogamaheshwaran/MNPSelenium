package MNPRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Mahesh\\eclipse-workspace\\NPMPortalBDDFramework\\src\\main\\java\\Features\\login.feature",//path of the feature file
		glue = {"MnpStepDefinition"} ,//the path of the step definition files
		//format= {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step definition file	 
		)

public class TestRunner {

	
}
