package Step_Definition;

import Base.TestBase;
import Pages.projectPageObjects;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class transfYourRiskDecMakHeadingTest extends TestBase {


    @When("^I scroll to Transform Your Risk Decision Making Heading$")
    public void iScrollToTransformYourRiskDecisionMakingHeading() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    @Then("^I should see all the correct links and they should be enabled$")
    public void iShouldSeeAllTheCorrectLinksAndTheyShouldBeEnabled() {
        projectPageObjects page = PageFactory.initElements(driver, projectPageObjects.class);
        page.assertFinancialServicesLinkIsDisplayedAndEnabled();
        page.assertInsuranceLinkIsDisplayedAndEnabled();
        page.assertLifeAndPensionsLinkIsDisplayedAndEnabled();
        page.assertCorporationsAndNonProfitsLinkIsDisplayedAndEnabled();

        driver.close();
    }
}