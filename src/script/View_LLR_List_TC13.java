package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.LLR_Listing_Page;
import page.LLR_RequestPage;


public class View_LLR_List_TC13 extends BaseTest{
	
	@Test
	public void testA() throws InterruptedException {
	
		LLR_Listing_Page list = new LLR_Listing_Page(driver);
		LLR_RequestPage req = new LLR_RequestPage(driver);
		list.clickActionIcon();
		list.clickViewRequest();
		req.checkForEditing();	
	}
}
