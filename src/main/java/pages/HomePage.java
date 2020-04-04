package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//*[@class='pull-left image']")
    private WebElement avatar;

    @FindBy(xpath = ".//li[@id='dictionary']//ul[@class='treeview-menu menu-open']//li[@id='prov_cus']")
    private WebElement submenuProviders;

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
}
