package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    final SelenideElement userInput = $x("//input[@placeholder='Work email']");
    final SelenideElement passwordInput = $("[type='password'][placeholder='Password']");
    final SelenideElement loginBtn = $x("//*[text()='Sign in']//ancestor::button[@type='submit']");

    public LoginPage openPage() {
        open("login");
        return this;
    }

    public LoginPage login() {
        userInput.setValue("ququwka1@gmail.com");
        passwordInput.sendKeys("");
        loginBtn.submit();
        return this;
    }
}