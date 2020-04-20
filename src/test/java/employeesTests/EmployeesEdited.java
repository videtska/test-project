package employeesTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class EmployeesEdited extends AbstractParentTest {
    String surname = RandomStringUtils.random(10, true, true);
    String name = RandomStringUtils.random(10, true, false);
    String middleName = RandomStringUtils.random(10, true, false);
    String phone = "+" + RandomStringUtils.random(10, false, true);

    String surnameUpd = surname + "Upd";
    String nameUpd = name + "Upd";
    String middleNameUpd = middleName + "Upd";
    String phoneUpd = phone + "000";


    @Test
    public void EmployeesEditedSurname() {

        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardWorkers();
        employeesPage.createNewEmployee(surname, name, middleName, phone);
        employeesPage.clickOnTheRow(surname,name,middleName,phone);
        employeesPage.editEmployee(surnameUpd, name, middleName, phone);
        Assert.assertTrue(employeesPage.isEmployeeAdded(surnameUpd, name, middleName, phone));
    }

    @Test
    public void EmployeesEditedName() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardWorkers();
        employeesPage.createNewEmployee(surname, name, middleName, phone);
        employeesPage.clickOnTheRow(surname,name,middleName,phone);
        employeesPage.editEmployee(surname, nameUpd, middleName, phone);
        Assert.assertTrue(employeesPage.isEmployeeAdded(surname, nameUpd, middleName, phone));
    }

    @Test
    public void EmployeesEditedMiddleName() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardWorkers();
        employeesPage.createNewEmployee(surname, name, middleName, phone);
        employeesPage.clickOnTheRow(surname,name,middleName,phone);
        employeesPage.editEmployee(surname, name, middleNameUpd, phone);
        Assert.assertTrue(employeesPage.isEmployeeAdded(surname, name, middleNameUpd, phone));
    }

    @Test
    public void EmployeesEditedPhone() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardWorkers();
        employeesPage.createNewEmployee(surname, name, middleName, phone);
        employeesPage.clickOnTheRow(surname,name,middleName,phone);
        employeesPage.editEmployee(surname, name, middleName, phoneUpd);
        Assert.assertTrue(employeesPage.isEmployeeAdded(surname, name, middleName, phoneUpd));
    }
}
