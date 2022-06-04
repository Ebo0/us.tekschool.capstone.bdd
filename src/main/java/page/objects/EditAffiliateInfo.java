package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class EditAffiliateInfo extends Base {
	
	public EditAffiliateInfo () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInfoLink;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadio;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankNameInput;
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaNumberInput;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeInput;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameInput;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberInput;
	
	public void clickOnEditAffiliateInfoLink() {
		editAffiliateInfoLink.click();
	}
	
	public void selectBankTransferRadio() {
		bankTransferRadio.click();
	}
	
	public void fillBankTransferForm(String bankName, String abaNumber, String swiftCode, String accountName, String accountNumber) {
		bankNameInput.sendKeys(bankName);
		abaNumberInput.sendKeys(abaNumber);
		swiftCodeInput.sendKeys(swiftCode);
		accountNameInput.sendKeys(accountName);
		accountNumberInput.sendKeys(accountNumber);
	}

}
