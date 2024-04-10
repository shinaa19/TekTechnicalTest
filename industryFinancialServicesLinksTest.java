package Step_Definition;

import Base.TestBase;
import Pages.projectPageObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class industryFinancialServicesLinksTest extends TestBase {

    @When("^I navigate to choose your industry page$")
    public void iNavigateToChooseYourIndustryPage() {
        projectPageObjects page = PageFactory.initElements(driver, projectPageObjects.class);
        page.clickOnChooseYourIndustry();
    }

    @And("^I select the financial services link$")
    public void iSelectTheFinancialServicesLink() {
        projectPageObjects page = PageFactory.initElements(driver, projectPageObjects.class);
        page.SelectIndustry_FinancialServices();
    }

    @Then("^I should see all financial services links displayed and enabled$")
    public void iShouldSeeAllFinancialServicesLinksDisplayedAndEnabled() {
        projectPageObjects page = PageFactory.initElements(driver, projectPageObjects.class);
        page.assertFinancialCrimesComplianceLinkIsDispalyedAndEnabled();
        page.assertFraudAndIdentityManagementLinksAreDisplayedAndEnabled();
        page.asserCustomerDataManagementLinksAreDisplayedAndEnabled();
        page.assertCreditRiskAssessmentLinksAreDisplayedAndEnabled();
        page.assertCollectionsAndRecoveryLinksAreDisplayedAndEnabled();
        page.assertTracingAndInvestigationsLinksAreDisplayedAndEnabled();

        driver.close();
    }
}
