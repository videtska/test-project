package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectIncorrectUser extends AbstractParentTest {

    @Test
    public void invalidUser() {
        loginPage.openPage();
        loginPage.inputLogin("Vsdfsdf");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitBtn();
        checkExpectedResult("Login success", loginPage.isAuthTitlePresent());
    }
}
