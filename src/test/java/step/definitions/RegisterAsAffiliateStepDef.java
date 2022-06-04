package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RegisterAsAffiliate;
import utilities.Util;

public class RegisterAsAffiliateStepDef extends Base {
	
	RegisterAsAffiliate registerAsAffiliate = new RegisterAsAffiliate();

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		registerAsAffiliate.clickOnRegisterAsAnAffiliateLink();
		logger.info("user clicked on register as an affiliate link");
	}

	@When("User fill affiliate form with following information {string} {string} {string} {string}")
	public void user_fill_affiliate_form_with_following_information(String company, String website, String taxID,
			String paymentMethod) {
		registerAsAffiliate.fillOutRegisterForm(company, website, taxID, paymentMethod);
		Assert.assertTrue(registerAsAffiliate.verifyChequeRadioIsSelected());
		logger.info("user filled out the form");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		registerAsAffiliate.checkAgreebox();
		logger.info("user checked the agreement checkbox");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		registerAsAffiliate.clickOnContinueBtn();
		logger.info("user clicked on continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(registerAsAffiliate.successMessageIsDisplayed());
		logger.info("user verified the success message");
		
		Util.takeScreenShot();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
