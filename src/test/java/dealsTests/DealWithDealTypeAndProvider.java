package dealsTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import parentTests.AbstractParentTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DealWithDealTypeAndProvider extends AbstractParentTest {


    Calendar calendar = GregorianCalendar.getInstance();

    String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
    String month = "апр.";
    String getMonth = "04";
    String year = String.valueOf(calendar.get(Calendar.YEAR));
    String hour = String.valueOf(calendar.get(Calendar.HOUR));
    String minute = "03";
    String dealType = RandomStringUtils.random(7, true, false);
    String provider = RandomStringUtils.random(7, true, false);
    String customerName = RandomStringUtils.random(7, true, false);
    String customerAddress = RandomStringUtils.random(7, true, false);
    String customerPhone = "+" + RandomStringUtils.random(9, false, true);
    Boolean checkPrivate = true;
    Boolean checkIsOurFirm = true;
    String fullDate = day + "." + getMonth + "." + year + " " + hour + ":" + minute;

    @Test
    public void AddDealWithNewDealTypeAndProvider() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardDealTypes();
        dealsTypesPage.createNewDealType(dealType);
        homePage.clickOnDashboardProviders();
        providersPage.createNewProvider(customerName, customerAddress, customerPhone, checkPrivate, checkIsOurFirm);
        homePage.clickOnDashboardProviders();
        providersPage.createNewProvider(provider, customerAddress, customerPhone, checkPrivate, checkIsOurFirm);
        homePage.clickOnDeals();
        dealsPage.createNewDeal(day, month, year, hour, minute, dealType, customerName, provider);
        Assert.assertTrue(dealsPage.isDealAdded(fullDate, dealType, customerName, provider));
    }
}
