package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class PaymentPage {

	//initialization	
	@FindBy(xpath="//div[@class='pm-pay-details']")
	private WebElement paymentSection;
		
	@FindBy(xpath="//a[@role='button']")
	private WebElement profileBtn;	
		
	@FindBy(linkText="Logout")
	private WebElement logout;

	@FindBy(id="realAmount")
	private WebElement subTotal;

	@FindBy(id="subTotalId")
	private WebElement amtpayable;

	@FindBy(id="total-text")
	private WebElement totalamt;
	
	@FindBy(id="promocodeId")
	private WebElement promoTxtField;
	
	@FindBy(id="applyBtn")
	private WebElement apply;
	
	@FindBy(className="//div[@aria-label='Paying with Card']")
	private WebElement cardOption;
	
	@FindBy(xpath="//div[@aria-label='Paying with PayPal']")
	private WebElement paypalOption;

	@FindBy(id="braintree-hosted-field-number")
	private WebElement cardFrame;
	
	@FindBy(id="credit-card-number")
	private WebElement cardNumEntry;
	
	@FindBy(id="expiration")
	private WebElement cardExpiry;
	
	@FindBy(xpath="//div[@class='braintree-toggle']/span")
	private WebElement chooseAnotherPay;
	
	@FindBy(id="userTermId1")
	private WebElement termsLink;
	
	@FindBy(id="userPrivacyId11")
	private WebElement privacyLink;
	
	@FindBy(id="confirm_btn")
	private WebElement confirmCardBtn;
	
	@FindBy(id="cancel_btn")
	private WebElement cancelCardBtn;
	
	@FindBy(id="popupTotalAmount")
	private WebElement verifyConfirmAmount;

	@FindBy(xpath="//iframe[@class='zoid-component-frame zoid-visible']")
	private WebElement payPalFrame;
	
	@FindBy(xpath="//div[@data-funding-source='paypal']")
	private WebElement payPalBtn;
	
	@FindBy(id="email")
	private WebElement payPalEmail;
	
	@FindBy(id="btnNext")
	private WebElement payPalNxtBtn;
	
	@FindBy(id="password")
	private WebElement payPalPassword;
	
	@FindBy(id="btnLogin")
	private WebElement payPalLogin;
	
	@FindBy(xpath="(//label[@class='noBottom multiFiLabelContainer'])[2]")
	private WebElement toggleBtn;
			
	@FindBy(xpath="//button[@class='btn full confirmButton continueButton']")
	private WebElement continueBtn;
	
	@FindBy(id="confirmButtonTop")
	private WebElement agreeBtn;
	
	@FindBy(id="cancelLink")
	private WebElement cancelLink;
	
	@FindBy(xpath="//button[@class='button blue__btn submitSubscriptionBtn']")
	private WebElement confirmSubBtn;
	
	//declaration
	public PaymentPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

	public void checkPaymentSection() {
			if(paymentSection.isDisplayed())
				Reporter.log("Payment Section is displayed.", true);
			else
				Assert.fail();
		}

	public void clickLogout() {
			profileBtn.click();
			logout.click();
		}

	public void verifyForAmount() {
			String price = amtpayable.getText();
			if(price.equals(totalamt.getText()))
				Reporter.log("Both prices are equal.", true);
			else
				Assert.fail();
		}

	public void enterPromoCode(String code) {
			promoTxtField.sendKeys(code);
		}
	
	public void clickApply() {
			apply.click();
	}
	
	public void clickCardOption() {
			cardOption.click();
		}
	
	public void enterCardNumber(WebDriver driver, String cardNum) {
			driver.switchTo().frame(cardFrame);
			cardNumEntry.sendKeys(cardNum);
	}
	
	public void enterExpiry(WebDriver driver, String expiry) {
			driver.switchTo().frame(cardFrame);
			cardExpiry.sendKeys(expiry);
	}
	
	public void clickOtherPayment() {
			chooseAnotherPay.click();
	}
	
	public void clickTerms() {
			termsLink.click();
	}
	
	public void clickPrivacy() {
			privacyLink.click();
	}
	
	public void clickConfirm() {
			confirmCardBtn.click();
	}
	
	public void clickCancel() {
			cancelCardBtn.click();
	}
	
	public void verifyConfAmount() {
		String confirmAmnt = verifyConfirmAmount.getText();
		String totalAmnt = totalamt.getText();
		if(confirmAmnt.equals(totalAmnt))
		{
			Reporter.log("Total amount and payable amount are same.",true);
		}
		else
		{
			Reporter.log("Total amount and payable amount are not same.",true);
			Assert.fail();
		}
	}
	
	public void payPalOption() {
			paypalOption.click();
	}

	public void clickPayPal(WebDriver driver) {
			driver.switchTo().frame(payPalFrame);
			payPalBtn.click();
	}
	
	public void switchToPayPalScreen(WebDriver driver) {
			String handle = driver.getWindowHandle();
			driver.switchTo().window(handle);
	}
	
	public void enterPaypalEmail(String email2) {
			payPalEmail.clear();
			payPalEmail.sendKeys(email2);
	}

	public void clickPaypalNext() {
		if(payPalNxtBtn.isDisplayed())	
				payPalNxtBtn.click();
	}
	
	public void waitForPasswordField(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeSelected(payPalPassword));
	}
	
	public void enterPaypalPassword(String pwd) {
			payPalPassword.sendKeys(pwd);
	}
	
	public void waitForLoginBtn(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeSelected(payPalLogin));
	}
	
	public void clickPaypalLogin() {
			payPalLogin.click();
	}
	
	public void selectPaypalAnotherCard() {
			toggleBtn.click();
	}
	
	public void clickContinueToMakePayment() {
			continueBtn.click();
	}
	
	public void clickPaypalCancel() {
			cancelLink.click();
	}
	
	public void clickPaypalAgree() {
			agreeBtn.click();
	}
	
	public void clickConfirmSubscription() {
			confirmSubBtn.click();
	}	
}