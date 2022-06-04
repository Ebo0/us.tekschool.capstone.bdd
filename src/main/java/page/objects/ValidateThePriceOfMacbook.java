package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ValidateThePriceOfMacbook extends Base {
	
	public ValidateThePriceOfMacbook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='MacBook Pro']")
	private WebElement MacbookProLink;
	
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement PriceTag;
	
	public void clickOnMacbookPro() {
		MacbookProLink.click();
	}
	
	public boolean checkPriceTag(String input) {
		String existingPriceTag = PriceTag.getText();
		if(existingPriceTag.contains(input))
			return true;
		else
			return false;
	}

}
