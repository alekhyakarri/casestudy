package stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/casestudy4.feature", glue="stepdef",
                            plugin="html:target/htmlreport")
                              // plugin="junit:target/xmlreport.xml")
                                //plugin="json:target/jsonreport.json")
public class Runner {

}
