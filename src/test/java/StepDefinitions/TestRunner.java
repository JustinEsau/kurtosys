package StepDefinitions;


import io.cucumber.core.backend.StepDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"StepDefinitions"}, monochrome = true,
plugin = {"pretty", "html:target/reports/index.html"},
tags = "@kurtosys"
)
public class TestRunner {
}
