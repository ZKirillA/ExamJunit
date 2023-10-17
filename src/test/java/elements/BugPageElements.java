package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BugPageElements {
    public static SelenideElement tasksButton = $x("//*[contains(text(),'Задачи')]");
    public static SelenideElement numberOfTasks = $x("//*[contains(text(),'1 из ')]");
    public static SelenideElement statusOfTask = $x("//span[@id='status-val']/span");
    public static SelenideElement versionOfTask = $x("//span[@id='fixVersions-field']/a");
    public static SelenideElement iframe = $x("(//div[@role= 'application']//descendant::iframe)[1]");
    public static SelenideElement subjectField = $x("//input[@name='summary']");
    public static SelenideElement descriptionField = $x("//body[@id='tinymce']/p");
    public static SelenideElement fixInVersions = $x("(//option[@value='10001'])[1]");
    public static SelenideElement priorityField = $x("//input[@id='priority-field']");
    public static SelenideElement choosePriority = $x("//*[text()='Highest']");
    public static SelenideElement tagsField = $x("//textarea[@id='labels-textarea']");
    public static SelenideElement iframeNext = $x("(//div[@role= 'application']//descendant::iframe)[2]");
    public static SelenideElement environmentField = $x("//body[@id='tinymce']/p");
    public static SelenideElement affectedVersions = $x("(//option[@value='10001'])[2]");
    public static SelenideElement relatedTasksField = $x("//select[@id='issuelinks-linktype']");
    public static SelenideElement chooseRelatedTasks = $x("//*[text()='clones']");
    public static SelenideElement tasksField = $x("//textarea[@id='issuelinks-issues-textarea']");
    public static SelenideElement executorField = $x("//button[@id='assign-to-me-trigger']");
    public static SelenideElement createButton = $x("//input[@id='create-issue-submit']");
    public static SelenideElement myBug = $x("//a[@class = 'issue-created-key issue-link']");
    public static SelenideElement buttonBussinesProc = $x("//span[text() = 'Бизнес-процесс']");
    public static SelenideElement buttonComplite = $x("//span[text() = 'Выполнено']");
    public static SelenideElement statusInBug = $x("//span[@id = 'status-val']/span");


}