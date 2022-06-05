package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.EditAccountInfo;
import utilities.Util;

public class EditAccountInfoStepDef extends Base {
	
	EditAccountInfo editAccountInfo = new EditAccountInfo();

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		editAccountInfo.clickOnEditAccountInfo();
		logger.info("user clicked on click on edit account info");
	}
	@When("User modify below information {string} {string} {string} {string}")
	public void user_modify_below_information(String fname, String lname, String email, String telephone) {
		editAccountInfo.fillOutForm(fname, lname, email, telephone);
		logger.info("user filled out the form");
	}
	@When("User click on continue button")
	public void user_click_on_continue_button() {
		editAccountInfo.clickOnContinueBtn();
		logger.info("user clicked on continue button");
	}
	
	@Then("User should see following message {string}")
	public void user_should_see_following_message(String string) {
		Assert.assertTrue(editAccountInfo.actualTextIsDisplayed());
		logger.info("user sees the success message");
		
		Util.takeScreenShot();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
