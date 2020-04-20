package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectIncorrectUser extends AbstractParentTest {

    @Test
    public void invalidUser() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        checkExpectedResult("Login success", loginPage.isAuthTitlePresent());
    }
}
