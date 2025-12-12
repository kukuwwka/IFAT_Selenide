import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectsPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;
    ProjectsPage projectsPage;

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 9000;
        Configuration.headless = false;
        Configuration.baseUrl = "https://app.qase.io/";
        Configuration.holdBrowserOpen = true;
        getWebDriver().manage().window().maximize();

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();

/*        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        setWebDriver(driver);*/
    }

    @AfterMethod
    public void close() {
        clearBrowserCookies();
        closeWebDriver();
    }
}