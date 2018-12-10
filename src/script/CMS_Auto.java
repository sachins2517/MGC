package script;

import org.testng.annotations.Test;

import generic.BaseTest1;
import generic.Utility;
import page.CMSPage;

public class CMS_Auto extends BaseTest1{
	
	@Test
	public void creationOfDDM() throws InterruptedException {
		
		String fname = Utility.getXLData(DATA_PATH, "Sheet1", 9, 0);
		String password = Utility.getXLData(DATA_PATH, "Sheet1", 9, 1);
		
		CMSPage cms = new CMSPage(driver);
		cms.sendUsername(fname);
		cms.sendPassword(password);
		cms.clickLogin();
		Thread.sleep(2000);
		cms.clickRepository(driver);
		cms.clickDDM(driver);
		cms.selectTestType(driver);
		Thread.sleep(5000);
		cms.selectSubSpeciality(driver);
		Thread.sleep(7000);
		cms.selectResultType(driver);
		Thread.sleep(5000);
		cms.selectGeneTested(driver);
		Thread.sleep(5000);
		cms.selectMutations(driver);
	}

}
