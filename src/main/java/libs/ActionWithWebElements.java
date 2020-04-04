package libs;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ActionWithWebElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionWithWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    /*public void enterTextToTheFields(By element, String text) {
        try {
            webDriver.findElement(element).clear();
            webDriver.findElement(element).sendKeys(text);
            logger.info("");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("");
        }
    }*/

    public void enterTextToTheFields(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info("Input completed");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Input failed");
        }
    }

    /*public void clickBtn(By element) {
        try {
            webDriver.findElement(element).click();
            logger.info("");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("");
        }
    }
*/

    public void clickBtn(WebElement element) {
        try {
            element.click();
            logger.info("Click completed");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed to click");
        }
    }

    /*public boolean isElementDisplayed(By element) {
        try {
            return webDriver.findElement(element).isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("");
            return false;
        }
    }
*/
    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed");
            return false;
        }
    }

    /*public boolean isElementEnabled(By element) {
        try {
            return webDriver.findElement(element).isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("");
            return false;
        }
    }*/

    public boolean isElementEnabled(WebElement element) {
        try {
            return element.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed");
            return false;
        }
    }

    /*public void setCheckbox(By element, boolean state) {
        try {
            if (webDriver.findElement(element).isSelected() != state) {
                webDriver.findElement(element).click();
                logger.info("");
            }
            logger.info("");

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("");
        }
    }*/

    public void setCheckbox(WebElement element, boolean state) {
        try {
            if (element.isSelected() != state) {
                element.click();
                logger.info("Checkbox state changed");
            }
            logger.info("Checkbox state not changed");

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Unable to set checkbox");
        }
    }

    /*private void selectElementByDD(By element, String itemName) {
        Select dropDownValue = new Select(webDriver.findElement(element));
        try {
            dropDownValue.selectByVisibleText(itemName);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("");
        }
    }
*/

    private void selectElementByDD(WebElement element, String itemName) {
        Select dropDownValue = new Select(element);
        try {
            dropDownValue.selectByVisibleText(itemName);
            logger.info("");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("");
        }
    }
}
