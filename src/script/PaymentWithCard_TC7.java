package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LLR_RequestListingPage;
import page.PaymentPage;
import page.RegisterPage;


public class PaymentWithCard_TC7 extends BaseTest{
	
	@Test
	public void testA() {
	
		String cardNum = Utility.getXLData(DATA_PATH, "Sheet1", 3, 0);
		String expiry = Utility.getXLData(DATA_PATH, "Sheet1", 3, 1);
	
		PaymentPage pay = new PaymentPage(driver);
		RegisterPage reg = new RegisterPage(driver);
		LLR_RequestListingPage req = new LLR_RequestListingPage(driver);
		pay.verifyForAmount();
		pay.clickCardOption();
		pay.enterCardNumber(driver, cardNum);
		pay.enterExpiry(driver, expiry);
		pay.clickTerms();
		reg.switchToMainPage(driver);
		pay.clickPrivacy();
		reg.switchToMainPage(driver);
		pay.clickConfirmSubscription();
		pay.verifyConfAmount();
		pay.clickCardConfirm();
		req.checkListingPage();
	}
}
