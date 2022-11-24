package stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nilesh\\eclipse-workspace\\testing\\src\\test\\resources\\cucumber\\a3.feature",
glue= {"stepdefination"},
monochrome=true,
plugin= {"pretty","html:target/html_reports/report.html"}
)

public class TestRunner {

}
