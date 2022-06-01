package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.ProductComparison;
import utilities.Util;

public class ProductComparisonStepDef extends Base{
	
	ProductComparison productComparison = new ProductComparison();
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		productComparison.clickOnCompareButtonOnMac();
		logger.info("user clicked on compare button on macbook");
	}
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		productComparison.clickOnCompareButtonOnMacAir();
		logger.info("user clicked on compare button on macbook air");

	}
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		productComparison.successMessageIsDisplayed();
		logger.info("user validates success message");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		productComparison.clickOnProductComparisonLink();
		logger.info("user click on product compare link");

	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		productComparison.tableIsDisplayed();
		logger.info("user validates comparison table displayed");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Util.takeScreenShot();

	}

}
