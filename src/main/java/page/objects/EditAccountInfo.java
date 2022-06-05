package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class EditAccountInfo extends Base {
	public EditAccountInfo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountInfo;

	@FindBy(id = "input-firstname")
	private WebElement fnameInput;

	@FindBy(id = "input-lastname")
	private WebElement lnameInput;

	@FindBy(id = "input-email")
	private WebElement emailInput;

	@FindBy(id = "input-telephone")
	private WebElement telephoneInput;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement actualTxt;

	public void clickOnEditAccountInfo() {
		editAccountInfo.click();
	}

	public void fillOutForm(String fname, String lname, String email, String tel) {
		fnameInput.clear();
		lnameInput.clear();
		emailInput.clear();
		telephoneInput.clear();
		fnameInput.sendKeys(fname);
		lnameInput.sendKeys(lname);
		emailInput.sendKeys(email);
		telephoneInput.sendKeys(tel);
	}

	public void clickOnContinueBtn() {
		continueBtn.click();
	}

	public boolean actualTextIsDisplayed() {
		if(actualTxt.isDisplayed())
			return true;
		else
			return false;
	}
}
