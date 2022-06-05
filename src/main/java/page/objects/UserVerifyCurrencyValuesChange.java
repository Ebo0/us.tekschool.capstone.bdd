package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class UserVerifyCurrencyValuesChange extends Base {

	public UserVerifyCurrencyValuesChange() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyLink;

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement eur;

	@FindBy(id = "cart-total")
	private WebElement shoppingcartButton;

	public void clickOnCurrencyLink() {
		currencyLink.click();
	}

	public void clickOnEuro() {
		eur.click();
	}

	public boolean shoppingCartText() {
		if (shoppingcartButton.getText().contains("€"))
			return true;
		else
			return false;
	}
}
