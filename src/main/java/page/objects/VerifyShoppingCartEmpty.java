package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class VerifyShoppingCartEmpty extends Base {
	
	public VerifyShoppingCartEmpty() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "cart-total")
	private WebElement shoppingcartButton;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyText;
	
	public void clickOnShoppingCartBtn() {
		shoppingcartButton.click();
	}
	
	public String actualText() {
		String actualTxt = emptyText.getText();
		return actualTxt;
	}

}
