import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void projectIsOpen() {
        loginPage
                .openPage()
                .login();
        projectsPage.waitOpen();

/*        $x("//*[text()='Create new project']/ancestor::span[@class='qc0jO1 v1VmCV']/ancestor::button")
                .shouldHave(attribute("readonly"));
        $x("//*[text()='Create new project']/ancestor::span[@class='qc0jO1 v1VmCV']/ancestor::button")
                .shouldNotHave(readonly);*/

/*        $$x("//tr//a").findBy(text("Demo Project")).getSize();
        $$x("//tr//a").findBy(text("Demo Project")).should(exist, Duration.ofSeconds(3));

        $(By.id("")).should(Condition.matchText("SSH([1-9][0-9]{0, 3})"));
        $(By.id("")).getWrappedElement().sendKeys();*/
    }
}