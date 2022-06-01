package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.AddingItemToWishList;
import utilities.Util;

public class AddingItemToWishListStepDef extends Base {
	
	AddingItemToWishList addingItemToWishList = new AddingItemToWishList();

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		addingItemToWishList.clickOnHeartButton();
		logger.info("user clicked on heart button");
	}
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		addingItemToWishList.requiredMessageIsDisplayed();
		logger.info("Login required message displayed");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Util.takeScreenShot();
	}
}
