package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPageElements {
    public static SelenideElement login = $x("//input[@name='os_username']");
    public static SelenideElement password = $x("//input[@name='os_password']");
    public static SelenideElement buttonEnter = $x("//input[@value='Войти']");
}
