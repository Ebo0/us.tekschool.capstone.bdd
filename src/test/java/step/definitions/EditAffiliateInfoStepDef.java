package step.definitions;

import core.Base;
import io.cucumber.java.en.When;
import page.objects.EditAffiliateInfo;

public class EditAffiliateInfoStepDef extends Base {
	
	EditAffiliateInfo editAffiliateInfo = new EditAffiliateInfo();
	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		editAffiliateInfo.clickOnEditAffiliateInfoLink();
		logger.info("user clicked on edit affiliate info link");
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		editAffiliateInfo.selectBankTransferRadio();
		logger.info("user selected bank transfer radio button");

	}
	@When("User fill Bank information with below information {string} {string} {string} {string} {string}")
	public void user_fill_bank_information_with_below_information(String bankName, String abaNumber, String swiftCode, String accountName, String accountNumber) {
		editAffiliateInfo.fillBankTransferForm(bankName, abaNumber, swiftCode, accountName, accountNumber);
		logger.info("user filled out the bank transfer form");

	}

}
