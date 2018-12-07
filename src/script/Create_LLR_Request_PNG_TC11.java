package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LLR_Listing_Page;
import page.LLR_RequestPage;
import page.RegisterPage;

public class Create_LLR_Request_PNG_TC11 extends BaseTest{
	
	@Test
	public void testA() throws InterruptedException {
	
		String labName = Utility.getXLData(DATA_PATH, "Sheet1", 8, 1);
		String testType = Utility.getXLData(DATA_PATH, "Sheet1", 8, 2);
		String subSpec = Utility.getXLData(DATA_PATH, "Sheet1", 8, 3);
		String resType = Utility.getXLData(DATA_PATH, "Sheet1", 8, 4);
		String genType = Utility.getXLData(DATA_PATH, "Sheet1", 8, 5);
		String mutation = Utility.getXLData(DATA_PATH, "Sheet1", 8, 6);
		String imgPath = Utility.getXLData(DATA_PATH, "Sheet1", 8, 8);
		
		CMS_Auto c = new CMS_Auto();
		c.creationOfDDM();
		
		LLR_RequestPage request = new LLR_RequestPage(driver);
		RegisterPage reg = new RegisterPage(driver);
		LLR_Listing_Page list = new LLR_Listing_Page(driver);
		request.selectLabName(labName);
		request.selectDate();
		request.selectTestType(testType);
		request.selectSubSpeciality(subSpec);
		request.selectResultType(resType);
		request.selectgeneTestType(genType);
		request.selectmutationName(mutation);
		request.uploadFile(imgPath);
		request.clickTerms();
		reg.switchToMainPage(driver);
		request.clickPrivacy();
		reg.switchToMainPage(driver);
		request.clickSubmit();
		request.clickIDoNotHave();
		request.clickSubmitBtn();
		request.clickFinalSubmit();
		list.clickOK();
		list.checkListingPage();
	}
}