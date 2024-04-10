package Step_Definition;

import Base.TestBase;
import Pages.projectPageObjects;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class commonstepsTest extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the lexiNexis landing page$")
    public void iAmOnTheLexiNexisLandingPage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        projectPageObjects page = PageFactory.initElements(driver, projectPageObjects.class);
        page.acceptCookies();
    }
}
