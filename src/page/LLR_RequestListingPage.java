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
		
    @FindBy(xpath="//img[@src='/mgc-direct-web/resources/assets/images/user-logo/logo.png']")
	private WebElement logo;
    
    @FindBy(xpath="//a[contains(text(), 'My Reports')]")
    private WebElement myrreport;
    
    @FindBy(xpath="//a[contains(text(), 'Notification Settings')]")
	private WebElement notificationsetting;
    
    @FindBy(xpath="//a[contains(text(), 'Surveys')]")
    private WebElement surveys;
    
    @FindBy(xpath="//a[@class='dropdown-toggle user__profile']")
    private WebElement profile;
    
    @FindBy(xpath="//a[contains(text(), 'My Profile')]")
    private WebElement myprofile;
    
    @FindBy(xpath="//a[contains(text(), 'Logout')]")
    private WebElement logout;
    
    @FindBy(id="backBtn")
    private WebElement back;
    
    @FindBy(id="laboratoryId")
    private WebElement laboratoryname;
    
    @FindBy(xpath="//option[contains(text(), 'Enter the laboratory Name')]")
    private WebElement labdropdownenterlabname ;
    
    @FindBy(xpath="//option[contains(text(), 'BTC')]")
    private WebElement labdropdown;

    @FindBy(id="datepicker")
    private WebElement date;
    
    @FindBy(xpath="//td[@class='today active start-date active end-date available']")
    private WebElement picktodaysdate ;
    
    @FindBy(id="testTypeId")
    private WebElement geneticdropdown;
    
    @FindBy(xpath="//option[contains(text(), 'Somatic')]")
    private WebElement geneticdropdownsomatic;
    
    @FindBy(xpath="//option[contains(text(), 'To determine if my/my family')]")
    private WebElement geneticdropdownfamilycondition;
    
    @FindBy(xpath="//option[contains(text(), 'To learn about my ancestry/ download my raw genetic data')]")
    private WebElement geneticdropdownancestrydownload;
  
    @FindBy(xpath="(//option[contains(text(), 'Looking for a report not listed here?')])[1]")
    private WebElement geneticdropdownlookingforreport;
    
    @FindBy(id="subSpecialityId")
    private WebElement subspeciality;
    
    @FindBy(xpath="//option[contains(text(), 'A Promethease Report')]")
    private WebElement subspcldroppromethease;
    
    @FindBy(xpath="//option[contains(text(), 'Carrier Screening')]")
    private WebElement subspcldropcarrierscreening;
  
    @FindBy(xpath="//option[contains(text(), 'Carrier Testing')]")
    private WebElement subspcldropcarriertesting;
    
    @FindBy(xpath="//option[contains(text(), 'Hereditary Heart Conditions')]")
    private WebElement subspcldrophereditaryheart;
    
    @FindBy(xpath="//option[contains(text(), 'Quad Screen')]")
    private WebElement subspcldropquadscreen;
    
    @FindBy(xpath="//option[contains(text(), 'Hereditary Cancer')]")
    private WebElement subspclfamilydrophereditarycancer;
  
    @FindBy(xpath="//option[contains(text(), 'Hereditary Heart Conditions')]")
    private WebElement subspclfamilydrophereditaryheartcond;
  
    @FindBy(xpath="//option[contains(text(), 'Obstetrics')]")
    private WebElement subspclfamilydropobstetrics;
    
    @FindBy(xpath="(//option[contains(text(), 'Looking for a report not listed here?')])[2]")
    private WebElement subspclfamilydroplooking;
    
    @FindBy(xpath="//option[contains(text(), 'A 23andMe Report')]")
    private WebElement subspclancestrydrop23;
  
    @FindBy(xpath="//option[contains(text(), 'A Promethease Report')]")
    private WebElement subspclancestrydroppromethease;
    
    @FindBy(xpath="//option[contains(text(), 'Carrier Testing')]")
    private WebElement subspclancestrydropcarrier;
  
    @FindBy(xpath="//option[contains(text(), 'Metabolic')]")
    private WebElement subspclancestrydropmetabolic;
  
    @FindBy(xpath="//option[contains(text(), 'Pediatrics')]")
    private WebElement subspclancestrydroppediatrics;
  
    @FindBy(xpath="(//option[contains(text(), 'Looking for a report not listed here?')])[2]")
    private WebElement subspclancestrydroplookingfor;
    
     @FindBy(id="resultTypeId0")
    private WebElement testresult;
   
    @FindBy(xpath="//option[contains(text(), '1 variant detected')]")
    private WebElement testresultdropdownvariantdetected;
  
    @FindBy(xpath="//option[contains(text(), 'Allele')]")
    private WebElement testresultdropdownAllele;
    
    @FindBy(xpath="(//option[contains(text(), 'Benign Variant')])[1]")
    private WebElement testresultdropdownbenign;
    
    @FindBy(xpath="//option[contains(text(), 'High Risk')]")
    private WebElement testresultdropdownhighrisk;
    
    @FindBy(xpath="//option[contains(text(), 'Likely Benign Variant')]")
    private WebElement testresultdropdownlikelybenign;
  
    @FindBy(xpath="//option[contains(text(), 'Likely Pathogenic Variant')]")
    private WebElement testresultdropdownlikelypathogenic;
  
    @FindBy(xpath="//option[contains(text(), 'Looking for a Report Not Listed Here')]")
    private WebElement testresultdropdownlookingforreportHere;
    
    @FindBy(xpath="//option[contains(text(), '//option[contains(text(), 'Low Risk')]")
    private WebElement testresultdropdownlowrisk;
    
    @FindBy(xpath="//option[contains(text(), 'Mag 0 - 0.9')]")
    private WebElement testresultdropdownmag0;
    
    @FindBy(xpath="//option[contains(text(), 'Mag 1 - 1.9')]")
    private WebElement testresultdropdownmag1;
  
    @FindBy(xpath="//option[contains(text(), 'Magnitude 5 or Greater')]")
    private WebElement testresultdropdownmagnitude5;
    
    @FindBy(xpath="//option[contains(text(), 'Negative (no mutation(s) found)')]")
    private WebElement testresultdropdownnegativenomutation;
    
    @FindBy(xpath="Negative Screen")
    private WebElement testresultdropdownnegativescreen;

    @FindBy(xpath="Positive (also called pathogenic variant or mutation)")
    private WebElement testresultdropdownpositive;
    
    @FindBy(xpath="//option[contains(text(), 'Positive Screen')]")
    private WebElement testresultdropdownpositivescreen;
    
    @FindBy(xpath="(//option[contains(text(), 'Variant')])[4]")
    private WebElement testresultdropdownvariant;
    
    @FindBy(xpath="//option[contains(text(), 'Variant NOT detected')]")
    private WebElement testresultdropdownvariantnotdetected;
  
    @FindBy(xpath="//option[contains(text(), 'Variant of Uncertain Significance')]")
    private WebElement testresultdropdownvariantofuncertain;
    
    @FindBy(xpath="(//option[contains(text(), 'Looking for a report not listed here?')])[2]")
    private WebElement testresultdropdownlookingforreporthere;
    
    @FindBy(id="geneTestType0")
    private WebElement genetypeselect;
    
    @FindBy(id="mutationNameId0")
    private WebElement mutationname;
    
    @FindBy(name="imageFile")
    private WebElement image;
    
    @FindBy(id="termId1")
    private WebElement termsofuse;
    
    @FindBy(id="privacyId1")
    private WebElement privacy;
    
    @FindBy(xpath="//a[@class='btn btn-default margin__initial mr-sm'][contains(text(), 'CANCEL')]")
    private WebElement cancel;
    
    @FindBy(xpath="//a[@class='btn btn-primary margin__initial submit_btn'][contains(text(), 'SUBMIT')]")
    private WebElement submit;
    
    @FindBy(xpath="(//a[contains(text(), 'Contact')])[2]")
    private WebElement contact;
    
    @FindBy(id="faqFooterId1")
    private WebElement faq;
    
    @FindBy(id="cancelPolicyFooterId1")
    private WebElement cancelpolicy;
    
    
    
    
    
    
  
  
    
    
    
    
    
    
    

  
    
  
  
  
  
  
    
    
    
  
    
    
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
