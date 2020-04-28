package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features=".//Features/CreateUser.feature",
				glue="stepDefnetions",
				dryRun=false,
				monochrome=true,
				plugin= {"pretty","html:test-outputfolder"},
				tags= {"Sanity"}
		)

public class Runner {

}
