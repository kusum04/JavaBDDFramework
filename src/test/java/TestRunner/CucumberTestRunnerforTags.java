package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//how to use @smoke@regression@perf
@CucumberOptions(tags="@smoke and @regression and not @perf", 
features= {"src\\test\\resources\\FeatureWithTags"},
glue= {"StepsDefinitions"},
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunnerforTags extends AbstractTestNGCucumberTests{


	}

