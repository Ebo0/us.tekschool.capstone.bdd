package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddCanonEos5D extends Base{
	
	public AddCanonEos5D() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//span[text()='Add to Cart'])[2]")
	private WebElement addCanonEos5DToCartButton;
	
	@FindBy(id="input-option226")
	private WebElement selectOptions;
	
	@FindBy(xpath="(//option[@value='15'])")
	private WebElement selectRed;
	
	@FindBy(id="input-quantity")
	private WebElement enterQty;
	
	@FindBy(id="button-cart")
	private WebElement finalAddButton;
	
	public void clickOnAddCanonEos5DToCartButton(){
		addCanonEos5DToCartButton.click();
	}
	
	public void chooseRedColor() {
		selectOptions.click();
		selectRed.click();
	}
	public void enterQty(String qty) {
		enterQty.sendKeys(qty);
	}
	
	public void finallyAddtoCart() {
		finalAddButton.click();
	}

}
