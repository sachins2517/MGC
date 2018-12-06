package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;

public class Create_LLR_Request_TC9 extends BaseTest{
	
	@Test
	public void testA() throws InterruptedException {
	
		String username = Utility.getXLData(DATA_PATH, "Sheet1", 6, 0);
		String password = Utility.getXLData(DATA_PATH, "Sheet1", 6, 1);
		
		CMS_Auto c = new CMS_Auto();
		c.creationOfDDM();
		
		
		
		
	}
	

}
