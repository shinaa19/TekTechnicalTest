package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class projectPageObjects {
    @FindBy(how = How.XPATH, using = "//a[@href='https://risk.lexisnexis.co.uk/financial-services'][2]")
    public static WebElement financialServicesLink;

    @FindBy(how = How.XPATH, using = "//a[@href='https://risk.lexisnexis.co.uk/insurance'][2]")
    public static WebElement insuranceLink;

    @FindBy(how = How.XPATH, using = "//a[@href='https://risk.lexisnexis.co.uk/life-and-pension'][2]")
    public static WebElement lifeAndPensionLink;

    @FindBy(how = How.XPATH, using = "//a[@href='https://risk.lexisnexis.co.uk/corporations-and-non-profits'][2]")
    public static WebElement CorporationAndNonProfitsLink;

    @FindBy(how = How.XPATH, using = "//button[@id='onetrust-accept-btn-handler']")
    public static WebElement cookiesButton;

    @FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav score-nav']/li[1]")
    public static WebElement chooseIndustryLink;

    @FindBy(how = How.XPATH, using = "//a[@class='subpage-link']//div[text() = 'Financial Services ']")
    public static WebElement industry_financialServicesLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/financial-services/financial-crime-compliance']")
    public static WebElement financialCrimeComplianceLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/financial-services/fraud-and-identity-management']")
    public static WebElement fraudAndIdentityManagementLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/financial-services/customer-data-management']")
    public static WebElement CustomerDataManagementLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/financial-services/credit-risk-assessment']")
    public static WebElement creditRiskAssessmentLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/financial-services/collections-and-recovery']")
    public static WebElement CollectionsAndRecoveryLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/financial-services/tracing-and-investigations']")
    public static WebElement InvestigationsAndDueDiligenceLink;


    public void assertFinancialServicesLinkIsDisplayedAndEnabled() {
    financialServicesLink.isDisplayed();
    financialServicesLink.isEnabled();
    }

    public void assertInsuranceLinkIsDisplayedAndEnabled() {
        insuranceLink.isDisplayed();
        insuranceLink.isEnabled();
    }

    public void assertLifeAndPensionsLinkIsDisplayedAndEnabled() {
        lifeAndPensionLink.isDisplayed();
        lifeAndPensionLink.isEnabled();
    }

    public void assertCorporationsAndNonProfitsLinkIsDisplayedAndEnabled() {
        CorporationAndNonProfitsLink.isDisplayed();
        CorporationAndNonProfitsLink.isEnabled();
    }

    public void acceptCookies() {
        cookiesButton.click();
    }


    public void assertFinancialCrimesComplianceLinkIsDispalyedAndEnabled() {
        financialCrimeComplianceLink.isDisplayed();
        financialCrimeComplianceLink.isEnabled();
    }


    public void asserCustomerDataManagementLinksAreDisplayedAndEnabled() {
        CustomerDataManagementLink.isDisplayed();
        CustomerDataManagementLink.isEnabled();
    }

    public void assertFraudAndIdentityManagementLinksAreDisplayedAndEnabled() {
        financialCrimeComplianceLink.isDisplayed();
        financialCrimeComplianceLink.isEnabled();
    }


    public void assertCreditRiskAssessmentLinksAreDisplayedAndEnabled(){
        creditRiskAssessmentLink.isDisplayed();
        creditRiskAssessmentLink.isEnabled();
    }


    public void assertCollectionsAndRecoveryLinksAreDisplayedAndEnabled() {
        CollectionsAndRecoveryLink.isDisplayed();
        CollectionsAndRecoveryLink.isEnabled();
    }


    public void assertTracingAndInvestigationsLinksAreDisplayedAndEnabled() {
        InvestigationsAndDueDiligenceLink.isDisplayed();
        InvestigationsAndDueDiligenceLink.isEnabled();
    }


    public void SelectIndustry_FinancialServices() {
        industry_financialServicesLink.click();
    }


    public void clickOnChooseYourIndustry() {
        chooseIndustryLink.click();
    }
}


