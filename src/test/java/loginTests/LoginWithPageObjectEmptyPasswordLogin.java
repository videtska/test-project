package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectEmptyPasswordLogin extends AbstractParentTest {

    @Test
    public void emptyInputLogin() {
        loginPage.openPage();
        loginPage.inputLogin("");
        loginPage.inputPassword("");
        loginPage.clickSubmitBtn();
        checkExpectedResult("Login success", loginPage.isAuthTitlePresent());
    }
}
