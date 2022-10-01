package Runner;
	
	import org.junit.runner.RunWith;
	import org.testng.annotations.DataProvider;

	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.testng.AbstractTestNGCucumberTests;

	@RunWith(Cucumber.class)//Junit execution

	@CucumberOptions(
			plugin= {"pretty","html:target/cucumber.html"},//report purpose
			monochrome=true,//console output
			features= {"src/test/resources/Features"},//location of feature files
			glue="StepDefinition",//location of step definition files
			dryRun=false
			)

	public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	}
	
	
		
		
			
					
	
