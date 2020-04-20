package aparatTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import parentTests.AbstractParentTest;

public class AparatDeleteRow extends AbstractParentTest {

    @Test
    public void AparatDeleteRow() {
        String randomNumber = RandomStringUtils.random(3, false, true);
        String randomComment = RandomStringUtils.random(10, true, false);

        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnSubmenuProviders();
        homePage.clickOnDashboardApparat();
        aparatPage.createNewAparat(randomNumber, randomComment);
        aparatPage.deleteNewAparat(randomNumber, randomComment);
        Assert.assertFalse(aparatPage.isApparatRowAdded(randomNumber, randomComment));
    }
}
