package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.ValidateThePriceOfMacbook;
import utilities.Util;

public class ValidateThePriceOfMacbookProStepDef extends Base {
	
	ValidateThePriceOfMacbook validateThePriceOfMacbookPro = new ValidateThePriceOfMacbook();
	
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		validateThePriceOfMacbookPro.clickOnMacbookPro();
		logger.info("User clicked on macbook pro item");
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(String input) {
		validateThePriceOfMacbookPro.checkPriceTag(input);
		logger.info("User sees the price tag presented on UI");
		
		Util.takeScreenShot();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
