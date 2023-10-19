package tests;

import hooks.WebHooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static steps.AutorizationPageSteps.authorizationInJira;
import static steps.BugPageSteps.*;
import static steps.MainPageSteps.*;

public class JiraTests extends WebHooks {
    @Test
    @DisplayName("Задание по проверке количества задач")
    public void test() {
        authorizationInJira();
        goToTasks();
        checkNumOfTasks();
    }

    @Test
    @DisplayName("Задание по проверке статуса задачи TestSelenium")
    public void test2() {
        authorizationInJira();
        seleniumTaskSearch("TestSelenium");
        checkStatus("ГОТОВО");
        checkVersion("Version 2.0");
    }

    @Test
    @DisplayName("Задание по созданию бага")
    public void test3() {
        authorizationInJira();
        createBug();
        fillBugFields();
        changeStatusToComplite();
        checkBugStatus();
    }
}
