package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.UserVerifyCurrencyValuesChange;
import utilities.Util;

public class UserVerifyCurrencyValuesChangeStepDef extends Base {
	
	UserVerifyCurrencyValuesChange currencyChange = new UserVerifyCurrencyValuesChange();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		currencyChange.clickOnCurrencyLink();
		logger.info("user clicked on currency link");
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		currencyChange.clickOnEuro();
		logger.info("user clicked on Euro");

	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(currencyChange.shoppingCartText());
		logger.info("currency has changed to euro");
		
		Util.takeScreenShot();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
