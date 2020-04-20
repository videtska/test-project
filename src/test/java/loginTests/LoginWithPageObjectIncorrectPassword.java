package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectIncorrectPassword extends AbstractParentTest {

    @Test
    public void invalidPasswordLogin() {
        loginPage.openPage();
        loginPage.loginToPage("Student", "2342");
        checkExpectedResult("Login success", loginPage.isAuthTitlePresent());
    }
}
