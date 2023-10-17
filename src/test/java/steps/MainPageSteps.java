package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static elements.BugPageElements.tasksButton;
import static elements.MainPageElements.*;

public class MainPageSteps {
    public static void goToTasks() {
        projects.shouldBe(Condition.visible).click();
        testProjects.shouldBe(Condition.visible).click();
        tasksButton.shouldBe(Condition.visible).click();
    }

    public static void seleniumTaskSearch() {
        Selenide.sleep(1000);
        searchField.shouldBe(Condition.visible).click();
        searchField.shouldBe(Condition.visible).sendKeys("TestSelenium");
        searchTestSelenium.shouldBe(Condition.visible).click();
    }

    public static void createBug() {
        createBugButton.shouldBe(Condition.visible).click();
    }

}