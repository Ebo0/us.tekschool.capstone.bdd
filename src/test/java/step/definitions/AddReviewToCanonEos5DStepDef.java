package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.AddReviewToCanonEos5D;
import utilities.Util;

public class AddReviewToCanonEos5DStepDef extends Base{
	
	AddReviewToCanonEos5D addReviewToCanonEos5D = new AddReviewToCanonEos5D();
	
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		addReviewToCanonEos5D.clickOnCanon();
		logger.info("user clicked on Canon Eos 5D");
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		addReviewToCanonEos5D.clickOnWriteAReview();
		logger.info("user clicked on write a review link");
	}
	@When("user fill the review information with below information {string} {string} {string}")
	public void user_fill_the_review_information_with_below_information(String string, String string2, String string3) {
		addReviewToCanonEos5D.fillReviewForm(string, string2);
		logger.info("user filled out review form");
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		addReviewToCanonEos5D.clickOnContinueBtn();
		logger.info("user clicked on continue Btn");
	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		Assert.assertTrue(addReviewToCanonEos5D.verificationIsDisplayed());
		logger.info("Verification message is displayed");
		
		Util.takeScreenShot();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
