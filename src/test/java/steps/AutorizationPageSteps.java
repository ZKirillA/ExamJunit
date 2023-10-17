package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static configuration.Configuration.getFromProperties;
import static elements.AutorizationPageElements.*;

public class AutorizationPageSteps {
    @Step("Авторизация на портале Jira")
    public static void authorizationInJira(){
        Selenide.open(getFromProperties("url"));
        login.shouldBe(Condition.visible).sendKeys(getFromProperties("login"));
        password.shouldBe(Condition.visible).sendKeys(getFromProperties("password"));
        buttonEnter.click();
    }

}
