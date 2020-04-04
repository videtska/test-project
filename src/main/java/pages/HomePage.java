package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.nio.channels.WritableByteChannel;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//*[@class='pull-left image']")
    private WebElement avatar;

    @FindBy(xpath = ".//li[@id='dictionary']//ul[@class='treeview-menu menu-open']//li[@id='prov_cus']")
    private WebElement submenuProviders;

    @FindBy(xpath = "//*[@id='dashboard']")
    private WebElement dashboard;

    @FindBy(xpath = ".//li[@id='service_apparat']//a[@href='/dictionary/service']")
    private WebElement service;

    @FindBy(xpath = "//*[@id='installation']")
    private WebElement installation;

    @FindBy(xpath = "//*[@id='deal']")
    private WebElement deals;

    @FindBy(xpath = "//*[@id='report']")
    private WebElement report;

    @FindBy(xpath = "//*[@id='apparat']")
    private WebElement apparat;

    @FindBy(xpath = "//*[@id='workers']")
    private WebElement employees;

    @FindBy(xpath = "//*[@id='spareType']")
    private WebElement spareTypes;

    @FindBy(xpath = "//*[@id='spares']")
    private WebElement spares;

    @FindBy(xpath = "//*[@id='prov_cus']")
    private WebElement providers;

    @FindBy(xpath = "//*[@id='deal_type']")
    private WebElement dealTypes;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarDisplayed() {
        logger.info("Checking if avatar is displayed...");
        return actionWithWebElements.isElementDisplayed(avatar);
    }

    public void checkIsAvatarPresent() {
        Assert.assertTrue("Avatar is not displayed", isAvatarDisplayed());
    }

    public void clickOnSubmenuProviders() {
        logger.info("Clicking on submenu...");
        actionWithWebElements.clickBtn(submenuProviders);
    }

    public void clickOnDashboard() {
        logger.info("Clicking on dashboard");
        actionWithWebElements.clickBtn(dashboard);
    }

    public void clickOnDashboardApparat() {
        logger.info("Clicking on  dashboard - apparat");
        actionWithWebElements.clickBtn(apparat);
    }

    public void clickOnDashboardWorkers() {
        logger.info("Clicking on  dashboard - workers");
        actionWithWebElements.clickBtn(employees);
    }

    public void clickOnDashboardSpareTypes() {
        logger.info("Clicking on  dashboard - spare types");
        actionWithWebElements.clickBtn(spareTypes);
    }

    public void clickOnDashboardSpares() {
        logger.info("Clicking on  dashboard - spares");
        actionWithWebElements.clickBtn(spares);
    }

    public void clickOnDashboardProviders() {
        logger.info("Clicking on  dashboard - providers");
        actionWithWebElements.clickBtn(providers);
    }

    public void clickOnDashboardDealTypes() {
        logger.info("Clicking on  dashboard - deal types");
        actionWithWebElements.clickBtn(dealTypes);
    }

    public void clickOnService() {
        logger.info("Clicking on service");
        actionWithWebElements.clickBtn(service);
    }

    public void clickOnInstallation() {
        logger.info("Clicking on installation");
        actionWithWebElements.clickBtn(installation);
    }

    public void clickOnDeals() {
        logger.info("Clicking on deals");
        actionWithWebElements.clickBtn(deals);
    }

    public void clickOnReport() {
        logger.info("Clicking on report");
    }
}
