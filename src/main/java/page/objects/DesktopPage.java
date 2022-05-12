package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPage extends Base {
	
	public DesktopPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktopTag;
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showAllTag;
	
	@FindBy(tagName="img")
	private List<WebElement> items;
	
	public boolean isLogoDisplayed () {
		if(logo.isDisplayed()) 
			return true;
		else return false;
	}
	
	public void clickOnDesktoptag() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTag).build().perform();
	}
	
	public void clickOnShowAllTag() {
		showAllTag.click();
	}
	
	public List<WebElement> elements() {
		List<WebElement> DesktopItems = items;
		return DesktopItems;
	}
}
