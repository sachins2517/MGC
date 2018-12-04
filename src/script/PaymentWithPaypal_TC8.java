package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LLR_RequestListingPage;
import page.PaymentPage;
import page.RegisterPage;

public class PaymentWithPaypal_TC8 extends BaseTest{
	
	@Test
	public void testA() throws InterruptedException {
	
		String paypalemail = Utility.getXLData(DATA_PATH, "Sheet1", 4, 0);
		String paypalpassword = Utility.getXLData(DATA_PATH, "Sheet1", 4, 1);
		
		//Valid_Email_TC1 registration = new Valid_Email_TC1();
		PaymentPage pay = new PaymentPage(driver);
		RegisterPage reg = new RegisterPage(driver);
		LLR_RequestListingPage req = new LLR_RequestListingPage(driver);
		//registration.testA();
		pay.verifyForAmount();
		pay.clickPayPal(driver);
		pay.switchToPayPalScreen(driver);
		pay.enterPaypalEmail(paypalemail);
		pay.clickPaypalNext();
		pay.enterPaypalPassword(paypalpassword);
		pay.clickPaypalLogin();
		pay.clickPaypalAgree();
		pay.clickTerms();
		reg.switchToMainPage(driver);
		pay.clickPrivacy();
		reg.switchToMainPage(driver);
		pay.clickConfirmSubscription();
		pay.verifyConfAmount();
		pay.clickConfirm();
		req.checkListingPage();
	}
}
