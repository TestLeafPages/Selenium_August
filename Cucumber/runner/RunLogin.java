package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/features" },
				  glue = "steps",
				  monochrome = true,
				  plugin = {"pretty","html:report"}
			//	 tags = {"@regression"} only regression
			//	  tags = {"~@regression"} // all scenarios except regression
			//	  tags = {"~@regression,@functional"} //either not regression or functional
				//  tags = {"@regression","@functional"} //scenario having both functional and regression
				  //dryRun = true,
				  //snippets = SnippetType.CAMELCASE
				  )
public class RunLogin extends AbstractTestNGCucumberTests {

}
