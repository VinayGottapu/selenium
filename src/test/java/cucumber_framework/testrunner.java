package cucumber_framework;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features= {"src/test/resources/features/login.feature"},
			glue= {"cucumber_framework"},plugin= {"pretty","html:target/htmlreport.html"})

	public class testrunner extends AbstractTestNGCucumberTests {
	}



