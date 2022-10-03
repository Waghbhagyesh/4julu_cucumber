package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resource\\org\\feature",
		glue="/org/StepDef",
		monochrome=true,
		dryRun=false,

		plugin={"pretty",
				"html:target/html_report/html_report.html",
				"json:target/json_report/json_report.json",
				"junit:target/junit_report/junit_report.xml"
		}


		)

public class TestRunner {

}
