package script;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LLR_Listing_Page;
import page.LLR_RequestPage;
import page.LoginPage;
import page.RegisterPage;

public class Create_LLR_Request_PDF_TC12 extends BaseTest{
	
	@Test(priority=12)
	public void create_LLR_pdf() throws InterruptedException, AWTException {
	
		String labName = Utility.getXLData(DATA_PATH, "Sheet1", 12,0);
		String testType = Utility.getXLData(DATA_PATH, "Sheet1", 12, 1);
		String subSpec = Utility.getXLData(DATA_PATH, "Sheet1", 12, 2);
		String resType = Utility.getXLData(DATA_PATH, "Sheet1", 12, 3);
		String genType = Utility.getXLData(DATA_PATH, "Sheet1", 12, 4);
		String mutation = Utility.getXLData(DATA_PATH, "Sheet1", 12, 5);
		String email1 = Utility.getXLData(DATA_PATH, "Sheet1", 2, 0);
		String password1 = Utility.getXLData(DATA_PATH, "Sheet1", 2, 1);
		String imgPath = Utility.getXLData(DATA_PATH, "Sheet1", 12, 8);
		
		LLR_RequestPage request = new LLR_RequestPage(driver);
		RegisterPage reg = new RegisterPage(driver);
		LLR_Listing_Page list = new LLR_Listing_Page(driver);
		LoginPage login = new LoginPage(driver);
		
		login.loginLink();
		login.email(email1);
		login.password(password1);
		login.signIn();
		
		list.clickRequest();
		
		
		request.selectLabName(labName);
		request.selectDateField();
		request.selectDate();
		request.selectTestType(testType);
		request.selectSubSpeciality(subSpec);
		request.selectResultType(resType);
		Thread.sleep(2000);
		request.downKeys(driver);
		request.selectgeneTestType(genType);
		request.selectmutationName(mutation);
		Thread.sleep(3000);
		request.uploadFile(imgPath);
		Thread.sleep(5000);
		request.downToSubmit(driver);
		request.clickTerms();
		reg.switchToMainPage(driver);
		request.clickPrivacy();
		reg.switchToMainPage(driver);
		request.clickSubmit();
		request.clickFinalSubmit();
		list.clickOK();
		list.checkListingPage();
	}
}