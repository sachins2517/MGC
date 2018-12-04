package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LLR_RequestListingPage {

	//initialization	
	@FindBy(xpath="//span[@class='user__tbl__title user__tbl__title_dk']")
	private WebElement llrListingPage;
		

	//declaration
	public LLR_RequestListingPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

	public void checkListingPage() {
			if(llrListingPage.isDisplayed())
				Reporter.log("LLR Request Listing page is displayed.", true);
			else
				Assert.fail();
		}
}
