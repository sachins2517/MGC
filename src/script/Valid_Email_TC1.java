package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.AccessCodePage;
import page.RegisterPage;

public class Valid_Email_TC1 extends BaseTest {

	@Test
	public void testA() throws InterruptedException {
		
		String fname = Utility.getXLData(DATA_PATH, "Sheet1", 0, 0);
		String lname = Utility.getXLData(DATA_PATH, "Sheet1", 0, 1);
		String email = Utility.getXLData(DATA_PATH, "Sheet1", 0, 2);
		String pw = Utility.getXLData(DATA_PATH, "Sheet1", 0, 3);
		String confirmpwd = Utility.getXLData(DATA_PATH, "Sheet1", 0, 4);
		
		RegisterPage reg = new RegisterPage(driver);
		AccessCodePage access = new AccessCodePage(driver);
		reg.setFirstName(fname);
		reg.setLastName(lname);
		reg.email(email);
		reg.emailtooltip(driver);
		Thread.sleep(2000);
		reg.emailtooltiptxt();
		reg.rolePatient();
		reg.setPassword(pw);
		reg.confirmPassword(confirmpwd);
		reg.clickPlan();
		reg.closePlan();
		reg.clickPromocode();
		reg.getPromocodeTxt();
		reg.clickTerms();
		reg.switchToMainPage(driver);
		reg.clickPrivacy();
		reg.switchToMainPage(driver);
		reg.clickRegisterPatient();
		//Thread.sleep(3000);
		reg.waitForAccessCodePageLoad(driver);
		reg.checkForAccessCodePage();
		System.out.println("Checking for access code presence");
		Thread.sleep(20000);
		access.clickSubmit();
		reg.checkForPaymentPage();	
	}
}



