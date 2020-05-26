package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/HomePage.feature",glue="Steps",dryRun=false,monochrome=true)
public class RunnerClass {

}
