package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddingItemToWishList extends Base {

	public AddingItemToWishList() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[5]")
	private WebElement SonyVaioHeartButton;

	@FindBy(xpath = "//div//a[text()='login']")
	private WebElement requiredMessage;

	public void clickOnHeartButton() {
		SonyVaioHeartButton.click();
	}

	public boolean requiredMessageIsDisplayed() {
		if (requiredMessage.isDisplayed())
			return true;
		else
			return false;
	}
}
