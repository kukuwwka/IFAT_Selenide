package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {
    final SelenideElement title = $x("//*[text()='Create new project']");
    final SelenideElement titleBtn = $x("//*[text()='Create new project']/ancestor::span/ancestor::button");
    // такой локатор более стабилен?

    public void waitOpen() {
        title.should(exist).shouldBe(visible);
        titleBtn.shouldHave(cssValue("background-color", "rgba(64, 64, 220, 1)"));
    }
}