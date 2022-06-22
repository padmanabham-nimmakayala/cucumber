package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "stepdefinition" }, monochrome = true, plugin = {
		"pretty", "html:target/HtmlReports.html","json:target/report.json" })
public class Runner extends AbstractTestNGCucumberTests {

}
