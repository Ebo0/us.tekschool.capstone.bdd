package step.definitions;

import core.Base;
import io.cucumber.java.en.When;
import page.objects.AddCanonEos5D;
import utilities.Util;

public class AddCanonEos5DStepDef extends Base{
	
	AddCanonEos5D addCanonEos5D = new AddCanonEos5D();
	
	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		addCanonEos5D.clickOnAddCanonEos5DToCartButton();
		logger.info("user clicked on Canon EOS 5D add to cart button");
	}
	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		addCanonEos5D.chooseRedColor();
		logger.info("user chose color red");

	}
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		addCanonEos5D.finallyAddtoCart();
		logger.info("user finally added Canon EOS 5D into shopping cart");
		
		Util.takeScreenShot();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
