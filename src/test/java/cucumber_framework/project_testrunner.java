package cucumber_framework;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features= {"src/test/resources/features/project.feature"},
			glue= {"cucumber_framework"},plugin= {"pretty","html:target/htmlreport.html"})

	public class project_testrunner extends AbstractTestNGCucumberTests {
	}


