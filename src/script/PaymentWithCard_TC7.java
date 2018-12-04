package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.PaymentPage;
import page.RegisterPage;


public class PaymentWithCard_TC7 extends BaseTest{
	
	@Test
	public void testA() {
	
		String cardNum = Utility.getXLData(DATA_PATH, "Sheet1", 0, 0);
		String expiry = Utility.getXLData(DATA_PATH, "Sheet1", 0, 1);
		String email = Utility.getXLData(DATA_PATH, "Sheet1", 0, 2);
		String orgname = Utility.getXLData(DATA_PATH, "Sheet1", 0, 5);
		String message1 = Utility.getXLData(DATA_PATH, "Sheet1", 0, 6);
	
		PaymentPage pay = new PaymentPage(driver);
		RegisterPage reg = new RegisterPage(driver);
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
	}
}
