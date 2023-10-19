package hooks;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static configuration.Configuration.getFromProperties;

public class WebHooks {

    @BeforeAll
    public static void setDriver() {
        Configuration.browser = Browsers.CHROME;
        Selenide.open(getFromProperties("url"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.timeout = 12000;
    }

    @AfterEach
    public void closeDriver() {
        Selenide.webdriver().driver().close();
    }

    @BeforeAll
    public static void allureSubThreadParallel() {
        String listenerName = "AllureSelenide";
        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    (new AllureSelenide().screenshots(true).savePageSource(false)));

    }

}