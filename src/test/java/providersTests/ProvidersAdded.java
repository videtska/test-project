package providersTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import parentTests.AbstractParentTest;

import java.util.Calendar;

public class ProvidersAdded extends AbstractParentTest {

    String customerName = RandomStringUtils.random(7, true, false);
    String customerAddress = RandomStringUtils.random(7, true, false);
    String customerPhone = "+" + RandomStringUtils.random(9, false, true);
    Boolean checkPrivate = true;
    int checkPrivateInt = checkPrivate? 1 : 0;
    Boolean checkIsOurFirm = true;


    @Test
    public void ProvidersAddNew() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardProviders();
        providersPage.createNewProvider(customerName, customerAddress, customerPhone, checkPrivate, checkIsOurFirm);
        Assert.assertTrue(providersPage.isProviderAdded(customerName, customerAddress, customerPhone, String.valueOf(checkPrivateInt)));
    }
}
