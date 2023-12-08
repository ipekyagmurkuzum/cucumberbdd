//TestNG with Cucumber usage

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(tags = "@smoke",features={"src/test/resources/Features"}, glue={"src/test/java/stepDefinitions"}, monochrome = true, plugin = {"pretty","html:target/HtmlReports/index.html","json:target/JSONReports/report.json"})
//public class TestRunner extends AbstractTestNGCucumberTests {
//}

//JUnit with Cucumber usage

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="stepDefinitions", plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"})
public class TestRunner{
}


