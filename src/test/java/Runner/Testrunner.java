package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/features/seleniumchik.feature"},
	//	dryRun=true,
		snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE,
		glue= {"Steps"},
		plugin= {"pretty","html:cucumber-reports","json:reports/result.json","junit:reports/result.xml"}
		
		
		
		
		
		)
public class Testrunner extends AbstractTestNGCucumberTests {

}
