package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddAndRemoveMacbook extends Base{
	
	public AddAndRemoveMacbook() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopNotebook;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showLaptopNoteBook;
	
	@FindBy(xpath= "//h4//a[text()='MacBook']")
	private WebElement macbookLink;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement totalOfCart;
	
	@FindBy(xpath = "//div[@id='cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeFromCartButton;
	
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement totalOfCartisZero;
	
	public void clickOnLaptopNotebookTab() {
		laptopNotebook.click();
	}
	
	public void showLaptopNoteBookLink() {
		showLaptopNoteBook.click();
	}
	
	public void showMacbookLink() {
		macbookLink.click();
	}
	
	public void addToCart() {
		addToCartButton.click();
	}
	
	public boolean isSuccessMessageDisplayed() {
		if(successMessage.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkingTotalOfAmount(String qty, String amount)  {
		String totalPriceAmount = totalOfCart.getText();
		if(totalPriceAmount.contains(amount) && totalPriceAmount.contains(qty)) {
			return true; }
			else {
				return false;
			}
		}
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public void clickOnRemoveItemButton() {
		removeFromCartButton.click();
	}
	public boolean checkingTotalOfZero(String amount)  {
		String totalPriceAmount = totalOfCartisZero.getText();
		if(totalPriceAmount.contains(amount)) {
			return true; }
			else {
				return false;
			}
		}
}	
