package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {
    final SelenideElement title = $x("//*[text()='Create new project']");
    final SelenideElement titleBtn = $x("//*[text()='Create new project']/ancestor::span[@class='qc0jO1 v1VmCV']/ancestor::button");
    // мне самому не нравится локатор, пробовал по айди кнопки ещё, но там айдишник почему-то меняется

    public void waitOpen() {
        title.should(exist).shouldBe(visible);
        titleBtn.shouldHave(cssValue("background-color", "rgba(64, 64, 220, 1)"));
    }
}