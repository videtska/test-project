package suits;

import loginTests.LoginWithPageObjectEmptyPasswordLogin;
import loginTests.LoginWithPageObjectIncorrectPassword;
import loginTests.LoginWithPageObjectIncorrectUser;
import loginTests.LoginWithPageObjectTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginWithPageObjectEmptyPasswordLogin.class,
                LoginWithPageObjectIncorrectPassword.class,
                LoginWithPageObjectIncorrectUser.class,
                LoginWithPageObjectTest.class
        }
)


public class LoginSuit {
}
