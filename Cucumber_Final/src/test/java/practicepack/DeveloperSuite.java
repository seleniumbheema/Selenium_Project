package practicepack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:reports"},features="src/test/java")
//@CucumberOptions(format ={"html:reports"})
public class DeveloperSuite {

}
