package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.RegisterPage;

public class Others_Reg_TC6 extends BaseTest {

	@Test
	public void testA() throws InterruptedException {
		
		String fname = Utility.getXLData(DATA_PATH, "Sheet1", 0, 0);
		String lname = Utility.getXLData(DATA_PATH, "Sheet1", 0, 1);
		String email = Utility.getXLData(DATA_PATH, "Sheet1", 0, 2);
		String orgname = Utility.getXLData(DATA_PATH, "Sheet1", 0, 5);
		String message1 = Utility.getXLData(DATA_PATH, "Sheet1", 0, 6);
		
		RegisterPage reg = new RegisterPage(driver);
		reg.setFirstName(fname);
		reg.setLastName(lname);
		reg.email(email);
		reg.emailtooltip(driver);
		Thread.sleep(2000);
		reg.emailtooltiptxt();
		reg.roleOther();
		reg.sendOrganisationName(orgname);
		reg.sendMessage(message1);
		reg.clickRegisterOthers();
		reg.checkForRegSuccess();
	}
}