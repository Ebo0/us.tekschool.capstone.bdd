package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.AddAndRemoveMacbook;
import utilities.Util;

public class AddAndRemoveMacbookStepDef extends Base{
	
	AddAndRemoveMacbook addAndRemoveMacbook = new AddAndRemoveMacbook();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		addAndRemoveMacbook.clickOnLaptopNotebookTab();
		logger.info("user clicked on Laptops & Notebooks navbar");
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		addAndRemoveMacbook.showLaptopNoteBookLink();
		logger.info("User clicked on show all laptops and notebook link");
	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		addAndRemoveMacbook.showMacbookLink();
		logger.info("User clicked on Macbook");

	}
	@When("User click add Macbook to Cart button")
	public void user_click_add_macbook_to_cart_button() {
		addAndRemoveMacbook.addToCart();
		logger.info("user clicked on add to cart button");
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		addAndRemoveMacbook.addToCart();
		logger.info("User added macbook into shopping cart");

	}
	@When("User should see {string} item\\(s) {string} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(String qty, String total) {
		addAndRemoveMacbook.checkingTotalOfAmount(total, qty);
		logger.info("user sees qty and total price in the shopping cart");
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		addAndRemoveMacbook.clickOnShoppingCart();
		logger.info("user click on shopping cart button");
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		addAndRemoveMacbook.clickOnRemoveItemButton();
		logger.info("user click on red X remove button");
		
	}
	@Then("item should be removed and cart should show ‘{string} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(String qty) {
		addAndRemoveMacbook.checkingTotalOfZero(qty);
		logger.info("user assert the total of shopping cart is zero");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Util.takeScreenShot();
	}
}
