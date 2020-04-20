package aparatTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class AparatAdd extends AbstractParentTest {
    @Test
    public void addAparat(){

        String randomNumber = RandomStringUtils.random(3, false, true);
        String randomComment = RandomStringUtils.random(10, true, false);

        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardApparat();
        aparatPage.createNewAparat(randomNumber, randomComment);
        Assert.assertTrue(aparatPage.isApparatRowAdded(randomNumber, randomComment));
    }
}
