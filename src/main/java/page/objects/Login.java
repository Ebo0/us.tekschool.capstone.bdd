package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Login extends Base{
	
	public Login () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountBtn;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(id = "input-email")
	private WebElement inputEmail;
	
	@FindBy(id = "input-password")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='content']//h2[text()='My Account']")
	private WebElement myAccountValidation;
	
	public void clickOnMyAccountBtn() {
		myAccountBtn.click();
	}
	
	public void clickOnLoginLink() {
		loginLink.click();
	}
	
	public void enterLoginCredentials(String userName, String pass) {
		inputEmail.sendKeys(userName);
		inputPassword.sendKeys(pass);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public boolean validateUserIsLoggedIn() {
		if(myAccountValidation.isDisplayed())
			return true;
		else
			return false;
	}

}
