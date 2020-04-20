package loginTests;


import libs.ConfigClass;
import libs.ExcelDriver;
import org.junit.Test;
import parentTests.AbstractParentTest;


import java.io.IOException;
import java.util.Map;

public class LoginTestWithPageObjectWithExcel extends AbstractParentTest {
    @Test
    public void validLogin() throws IOException {
        Map<String, String> dataForValidLogin = ExcelDriver.getData(ConfigClass.getCfgValue("DATA_FILE"), "validLogOn");

        loginPage.openPage();
        loginPage.loginToPage(dataForValidLogin.get("login"), dataForValidLogin.get("pass"));
        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
    }



}
