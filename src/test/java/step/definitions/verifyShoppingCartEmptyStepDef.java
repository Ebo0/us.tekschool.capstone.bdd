package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.VerifyShoppingCartEmpty;
import utilities.Util;

public class verifyShoppingCartEmptyStepDef extends Base {
	
	VerifyShoppingCartEmpty verifyCartEmpty = new VerifyShoppingCartEmpty();
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		verifyCartEmpty.clickOnShoppingCartBtn();
		logger.info("user clicked on shopping cart btn");
	}
	@Then("{string} message should display")
	public void your_shopping_cart_is_empty_message_should_display(String expected) {
		Assert.assertEquals(expected, verifyCartEmpty.actualText());
		logger.info("expected text equals actual text");
		
		Util.takeScreenShot();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
