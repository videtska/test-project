package libs;

import jdk.jshell.spi.ExecutionControl;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class ActionWithWebElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait webDriverWait_10, webDriverWait_15;


    public ActionWithWebElements(WebDriver webDriver) {

        this.webDriver = webDriver;
        webDriverWait_10 = new WebDriverWait(webDriver, 10);
        webDriverWait_15 = new WebDriverWait(webDriver, 15);
    }

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

    public void clickBtn(WebElement element) {
        try {
            webDriverWait_10.until(ExpectedConditions.visibilityOf(element));
            element.click();
            logger.info("Click completed");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed to click");
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            webDriverWait_15.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed");
            return false;
        }
    }

    public boolean isElementEnabled(WebElement element) {
        try {
            webDriverWait_10.until(ExpectedConditions.visibilityOf(element));
            return element.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed");
            return false;
        }
    }

    public void setCheckbox(WebElement element, boolean state) {
        try {
            webDriverWait_10.until(ExpectedConditions.visibilityOf(element));
            if (element.isSelected() != state) {
                element.click();
                logger.info("Checkbox state changed " + String.valueOf(state));
            } else {
                logger.info("Checkbox state not changed");
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Unable to set checkbox");
        }
    }

    public void selectElementByDD(WebElement element, String itemName) {
        webDriverWait_10.until(ExpectedConditions.visibilityOf(element));
        Select dropDownValue = new Select(element);
        try {
            dropDownValue.selectByVisibleText(itemName);
            logger.info("Dropdown values is selected");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Unable to set value in the dropdown");
        }
    }

    public String getTextFrom(WebElement element) {
        webDriverWait_10.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public boolean isRowPresent(List<WebElement> rows, String... columns) {
        String text = "";

        for (int i = 0; i < columns.length; i++) {
            text += " " + columns[i];
        }

        for (int j = 0; j < rows.size(); j++) {
            String row = getTextFrom(rows.get(j));

            if (row.equals(text.trim())) {
                return true;
            }
        }
        return false;
    }

    public WebElement locateRow(List<WebElement> rows, String... columns) {
        try {
            logger.info("Looking for the added row");
            String text = "";
            for (int i = 0; i < columns.length; i++) {
                text += " " + columns[i];
            }

            for (int j = 0; j < rows.size(); j++) {
                String row = getTextFrom(rows.get(j));

                if (row.equals(text.trim())) {
                    return rows.get(j);
                }
            }
            return null;
        } catch (Exception e) {
            logger.info("Failed");
            return null;
        }
    }
}
