package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features=".//Features/", //--> Declare feature file path
				glue="stepDefnetions",   //--> Step definition package name
				dryRun=true,             //--> To check all Steps are implemented or not Note: Scripts won't execute
				monochrome=true,         //--> Output will come Readable format 
				plugin= {"pretty","html:test-outputfolder"}, 
				tags= {"@Smoke"},         //--> Run based on Tag name
				strict=true				  //--> Scipts will execute even-though steps are not implemented and it throw run time Exception    	
		)
/*** Tags Declarations ****--> Tags are used to specify which scenarios need to be Run 
 **** Run based on Single tag name ***
 		* tags= {"@Smoke"} 
 **** And condition declarations ****
 		* tags= {“@Sanity”, “@Smoke”} 
 		* tags= {"@Sanity and @Smoke"}
 								
 **** OR condition Declarations
 		* tags= {"@Sanity or @Smoke"} 
 **** And and or Conditions ****
 		* tags= {"@Smoke", "@Sanity or @Regression"} --> Along with Smoke tag either Sanity or regression should be there 
 		 													then only those Scenarios will execute  
 */
public class Runner {

}
