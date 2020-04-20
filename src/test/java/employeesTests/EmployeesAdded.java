package employeesTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class EmployeesAdded extends AbstractParentTest {

    @Test
    public void EmployeeAdded() {
        String surname = RandomStringUtils.random(10, true, true);
        String name = RandomStringUtils.random(10, true, false);
        String middleName = RandomStringUtils.random(10, true, false);
        String phone = "+" + RandomStringUtils.random(10, false, true);

        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardWorkers();
        employeesPage.createNewEmployee(surname, name, middleName, phone);
        Assert.assertTrue(employeesPage.isEmployeeAdded(surname, name, middleName, phone));
    }
}
