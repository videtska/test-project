package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectIncorrectPassword extends AbstractParentTest {

    @Test
    public void invalidPasswordLogin() {
        loginPage.openPage();
        loginPage.inputLogin("Student");
        loginPage.inputPassword("1234");
        loginPage.clickSubmitBtn();
        checkExpectedResult("Login success", loginPage.isAuthTitlePresent());
    }
}
