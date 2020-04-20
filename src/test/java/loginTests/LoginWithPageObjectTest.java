package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectTest extends AbstractParentTest {

    @Test
    public void validLogin() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
    }
}
