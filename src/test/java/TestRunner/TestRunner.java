package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

		// features = { "D:\\javaprojects\\cucumberproject\\Features\\LoginDTT.feature"
		// },
		features = { "C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\feature\\login.feature" },
		// features = "@target/rerun.txt", // it is used to run only failuer testcases
		glue = "StepDefinition", plugin = { "pretty", "html:reports/myreport.html",
				"json:reports/myreport.json", "rerun:target/rerun.txt"

		}, // Mandatory to capture failures
		dryRun = false, monochrome = true, tags = "@sanity" // Scenarios tagged with @sanity,
)
public class TestRunner {

}
