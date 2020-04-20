package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;

public class EmployeesPage extends ParentPage {

    @FindBy(xpath = "//a[@data-original-title='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "//input[@id='workers_workerSurname']")
    private WebElement workerSurname;

    @FindBy(xpath = "//input[@id='workers_workerName']")
    private WebElement workerName;

    @FindBy(xpath = "//input[@id='workers_workerMiddleName']")
    private WebElement workerMiddleName;

    @FindBy(xpath = "//input[@id='workers_workerPhone']")
    private WebElement workerPhone;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//button[@name='save']")
    private WebElement btnSave;

    @FindBy(xpath = "//table//tr")
    private List<WebElement> workersTableRows;

    public EmployeesPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void clickAdd() {
        actionWithWebElements.clickBtn(addBtn);
    }

    private void clickSubmit() {
        actionWithWebElements.clickBtn(btnSubmit);
    }

    private void clickSave() {
        actionWithWebElements.clickBtn(btnSave);
    }

    private void setWorkerName(String name) {
        actionWithWebElements.enterTextToTheFields(workerName, name);
    }

    private void setWorkerSurname(String surname) {
        actionWithWebElements.enterTextToTheFields(workerSurname, surname);
    }

    private void setWorkerMiddleName(String middleName) {
        actionWithWebElements.enterTextToTheFields(workerMiddleName, middleName);
    }

    private void setWorkerPhone(String phone) {
        actionWithWebElements.enterTextToTheFields(workerPhone, phone);
    }

    public void createNewEmployee(String surname, String name, String middleName, String phone) {
        clickAdd();
        setWorkerSurname(surname);
        setWorkerName(name);
        setWorkerMiddleName(middleName);
        setWorkerPhone(phone);
        clickSubmit();
    }

    public boolean isEmployeeAdded(String surname, String name, String middleName, String phone) {
        return actionWithWebElements.isRowPresent(workersTableRows, surname, name, middleName, phone);
    }

    public void clickOnTheRow(String surname, String name, String middleName, String phone) {
        actionWithWebElements.clickBtn(actionWithWebElements.locateRow(workersTableRows, surname, name, middleName, phone));
    }

    public void editEmployee(String surname, String name, String middleName, String phone) {
        setWorkerSurname(surname);
        setWorkerName(name);
        setWorkerMiddleName(middleName);
        setWorkerPhone(phone);
        clickSave();
    }


}
