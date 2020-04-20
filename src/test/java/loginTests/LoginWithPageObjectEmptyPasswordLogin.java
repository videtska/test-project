package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectEmptyPasswordLogin extends AbstractParentTest {

    @Test
    public void emptyInputLogin() {
        loginPage.openPage();
        loginPage.loginToPage("", "");
        checkExpectedResult("Login success", loginPage.isAuthTitlePresent());
    }
}
