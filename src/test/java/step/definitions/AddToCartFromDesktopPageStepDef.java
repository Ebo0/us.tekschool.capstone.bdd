package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.AddToCartFromDesktopPage;
import utilities.Util;

public class AddToCartFromDesktopPageStepDef extends Base{
	
	AddToCartFromDesktopPage addToCartFromDesktopPage = new AddToCartFromDesktopPage();
	
	@When("User click on ADD TO CART option on HP LP3065 item")
	public void user_click_on_add_to_cart_option_on_item( ) {
		addToCartFromDesktopPage.clickOnAddToCartButton();
		logger.info("user clicked on add to cart option on item");
	
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		addToCartFromDesktopPage.enterQuantity(string);
		logger.info("user entered quantity");
	}
	@When("User click add to cart button")
	public void user_click_add_to_cart_button() {
		addToCartFromDesktopPage.clickOnFinalAddToCartButton();
		logger.info("user clicked on final add to cart button");
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(addToCartFromDesktopPage.successMessagePresent());
		logger.info("user validated the success message");
		
		Util.takeScreenShot();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

