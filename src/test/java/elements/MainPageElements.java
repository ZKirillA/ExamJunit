package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {
    public static SelenideElement projects = $x("//*[contains(text(),'Проекты')]");
    public static SelenideElement testProjects = $x("//*[contains(text(),'Test (TEST)')]");
    public static SelenideElement searchField = $x("//input[@name='searchString']");
    public static SelenideElement searchTestSelenium = $x("(//span[text()='TestSelenium'])[1]");
    public static SelenideElement createBugButton = $x("//a[text()='Создать']");

}
