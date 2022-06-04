package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.Login;
import utilities.Util;

public class LoginStepDef extends Base {

	Login login = new Login();

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		login.clickOnMyAccountBtn();
		logger.info("user clicked on My Account Button");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		login.clickOnLoginLink();
		logger.info("user clicked on Login Link");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		login.enterLoginCredentials(string, string2);
		logger.info("user entered login credentials");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		login.clickOnLoginBtn();
		logger.info("User clicked on login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(login.validateUserIsLoggedIn());

		Util.takeScreenShot();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
