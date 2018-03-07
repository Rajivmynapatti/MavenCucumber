package Indianic.CucumberDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue={"StepDefinition"},monochrome=true, format = {"pretty"} )  //, glue={"StepDefinationPackage"},monochrome=true, format = {"pretty"}
public class TestRunnerTest {

}
