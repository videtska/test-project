package parentTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import libs.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;


import java.util.concurrent.TimeUnit;
import org.apache.log4j.*;

public class AbstractParentTest {
    WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected AparatPage aparatPage;
    protected EmployeesPage employeesPage;
    protected ProvidersPage providersPage;
    protected DealsTypesPage dealsTypesPage;
    protected DealsPage dealsPage;
    protected Utils utils;
    private String pathToScreenshot;
    Logger log = Logger.getLogger(getClass());

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp() throws Exception {

        pathToScreenshot = "D:\\java\\test-project\\target\\screenshots\\" + this.getClass().getPackage().getName() + "\\" +
                this.getClass().getSimpleName() + this.testName.getMethodName() + ".jpg";

        webDriver = driverInit();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        aparatPage = new AparatPage(webDriver);
        employeesPage = new EmployeesPage(webDriver);
        providersPage = new ProvidersPage(webDriver);
        dealsTypesPage = new DealsTypesPage(webDriver);
        dealsPage = new DealsPage(webDriver);
        utils = new Utils();


    }

    private WebDriver driverInit() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    protected void checkExpectedResult(String message, boolean actualResult) {

        //if(!actualResult == true) {

        //}
        Assert.assertEquals(message,true, actualResult);
        utils.screenShot(pathToScreenshot, webDriver);
    }

}
