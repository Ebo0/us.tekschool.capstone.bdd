package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterAsAffiliate extends Base{
	
	public RegisterAsAffiliate () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Register for an affiliate account']")
	private WebElement registerAsAffiliateLink;
	
	@FindBy(id = "input-company")
	private WebElement inputCompany;
	
	@FindBy(id = "input-website")
	private WebElement inputWebsite;
	
	@FindBy(id = "input-tax")
	private WebElement inputTax;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeRadio;
	
	@FindBy(id = "input-cheque")
	private WebElement inputChequePayeeName;
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement agreeCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessage;
	
	public void clickOnRegisterAsAnAffiliateLink() {
		registerAsAffiliateLink.click();
	}
	
	public boolean verifyChequeRadioIsSelected() {
		if(chequeRadio.isSelected())
			return true;
		else
			return false;
	}
	
	public void fillOutRegisterForm(String company, String website, String tax, String chequePayeeName) {
		inputCompany.sendKeys(company);
		inputWebsite.sendKeys(website);
		inputTax.sendKeys(tax);
		inputChequePayeeName.sendKeys(chequePayeeName);
	}
	
	public void checkAgreebox() {
		agreeCheckBox.click();
	}
	
	public void clickOnContinueBtn() {
		continueBtn.click();
	}
	
	public boolean successMessageIsDisplayed() {
		if(successMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
}
