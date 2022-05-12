package step.definitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base{
	
	
	/*
	 * This class hosts 2 methods that will run before and after each scenario
	 * Cucumber has Hooks and we have Before hooks and after hooks 
	 * Before hooks executes a block of code before each scenario
	 * After hooks executes a block of code after each scenario 
	 */
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " + scenario.getName() + " started");
		selectBrowser(); //this method will select the browser
		launchBrowser(); //this method will launch the browser
	}
	
	
	@After
	public void afterHooks(Scenario scenario) {
		
		tearDown();
		logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		
	}
	
}
