package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ProductComparison extends Base {

	public ProductComparison() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement compareButtonOnMacbook;

	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement compareButtonOnMacbookAir;

	@FindBy(xpath = "(//div//a[text()='MacBook Air'])[1]")
	private WebElement successAddedToComparisonMessage;

	@FindBy(xpath = "//div//a[text()='product comparison']")
	private WebElement productComparisonLink;

	@FindBy(xpath = "//table//tbody[1]")
	private WebElement assertionTable;

	public void clickOnCompareButtonOnMac() {
		compareButtonOnMacbook.click();
	}

	public void clickOnCompareButtonOnMacAir() {
		compareButtonOnMacbookAir.click();
	}

	public boolean successMessageIsDisplayed() {
		if (successAddedToComparisonMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}

	public boolean tableIsDisplayed() {
		if (assertionTable.isDisplayed())
			return true;
		else
			return false;
	}

}
