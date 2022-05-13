package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddToCartFromDesktopPage extends Base {

	public AddToCartFromDesktopPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='content']//div[@class='row'][4]//div[3]//button")
	private WebElement addToCartButton;

	@FindBy(id = "input-quantity")
	private WebElement inputQuantity;

	@FindBy(xpath = "//div[@class='form-group']//button[text()='Add to Cart']")
	private WebElement finalAddToCartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageAfterAddToCart;

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public void enterQuantity(String quantity) {
		inputQuantity.sendKeys(quantity);
	}

	public void clickOnFinalAddToCartButton() {
		finalAddToCartButton.click();
	}

	public boolean successMessagePresent() {
		if (successMessageAfterAddToCart.isDisplayed())
			return true;
		else
			return false;
	}

}