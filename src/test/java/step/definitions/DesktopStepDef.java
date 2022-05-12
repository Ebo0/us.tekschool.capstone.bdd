package step.definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPage;
import utilities.Util;

public class DesktopStepDef extends Base {

	DesktopPage desktopPage = new DesktopPage();

	@Given("user is on Retail home page")
	public void user_is_on_retail_home_page() {

		Assert.assertTrue(desktopPage.isLogoDisplayed());
		logger.info("user is on Home Page");

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPage.clickOnDesktoptag();
		logger.info("user clicked on the desktop tag");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.clickOnShowAllTag();
		logger.info("user clicked on show all desktop tag");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> items = desktopPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
		}
		
		Util.takeScreenShot();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
