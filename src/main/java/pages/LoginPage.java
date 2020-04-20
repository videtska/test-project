package pages;

import libs.ConfigClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {

    @FindBy(name = "_username")
    private WebElement inputLoginName;

    @FindBy(name = "_password")
    private WebElement inputPasswordName;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement inputButtonXpath;

    @FindBy(xpath = "//div[@class = 'login-box-body']")
    private WebElement loginBox;

    @FindBy(xpath = "//p[@class='login-box-msg']")
    private WebElement titleAuth;

    //By inputLoginName = By.name("_username");
    //By inputPasswordName = By.name("_password");
    //By inputButtonXpath = By.xpath(".//button[@type='submit']");
    //String url = "http://v3.test.itpmgroup.com";

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    /*public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        actionWithWebElements = new ActionWithWebElements(webDriver);
    }*/

    public void openPage() {
        try {
            webDriver.get(ConfigClass.getCfgValue("base_url") + "/login");
            logger.info("Page LoginPage was opened");
        } catch (Exception e) {
            logger.error("Unable to open URL");
            Assert.fail("");
        }
    }

    private void inputLogin(String text) {
        logger.info("Setting username");
        actionWithWebElements.enterTextToTheFields(inputLoginName, text);
    }

    private void inputPassword(String text) {
        logger.info("Setting password");
        actionWithWebElements.enterTextToTheFields(inputPasswordName, text);
    }

    private void clickSubmitBtn() {
        logger.info("Submitting credentials");
        actionWithWebElements.clickBtn(inputButtonXpath);
    }

    //new 04-04
    public boolean isLoginBoxRefreshed() {
        return actionWithWebElements.isElementDisplayed(loginBox);
    }

    public void loginToPage(String login, String password) {
        inputLogin(login);
        inputPassword(password);
        clickSubmitBtn();
    }

    public boolean isAuthTitlePresent() {
        return actionWithWebElements.isElementDisplayed(titleAuth);
    }

    public void isLoginPageOpened() {
        Assert.assertTrue("Auth title is present", isAuthTitlePresent());
    }
}
