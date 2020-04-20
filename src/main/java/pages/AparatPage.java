package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;

public class AparatPage extends ParentPage {

    @FindBy(xpath = "//a[@data-original-title='Add']")
    private WebElement btnAdd;

    @FindBy(xpath = "//h3[@class='box-title']")
    private WebElement titleListOfAparats;

    @FindBy(xpath = "//h3[@class='box-title']")
    private WebElement titleEdit;

    @FindBy(xpath = "//label[@for='apparat_apparatNumber']")
    private WebElement labelAparatNumber;

    @FindBy(xpath = "//label[@for='apparat_apparatComment']")
    private WebElement labelAparatComment;

    @FindBy(id = "apparat_apparatNumber")
    private WebElement textFieldAparatNumber;

    @FindBy(id = "apparat_apparatComment")
    private WebElement getTextFieldAparatComment;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitBtn;

    @FindBy(name = "save")
    private WebElement saveBtn;

    @FindBy(name = "delete")
    private WebElement deleteBtn;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> tableRows;

    @FindBy(xpath = "//tr/td[1]")
    private WebElement tableNum;

    @FindBy(xpath = "//tr/td[2]")
    private WebElement tableComment;



    public AparatPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void clickAdd() {
        logger.info("Clicking add button");
        actionWithWebElements.clickBtn(btnAdd);
    }

    private void inputAparatNumber(String text) {
        actionWithWebElements.enterTextToTheFields(textFieldAparatNumber, text);
    }

    private void inputAparatComment(String text) {
        actionWithWebElements.enterTextToTheFields(getTextFieldAparatComment, text);
    }

    private void clickCreate() {
        actionWithWebElements.clickBtn(submitBtn);
    }

    public void createNewAparat(String number, String comment) {
        logger.info("Creating new aparat");
        clickAdd();
        inputAparatNumber(number);
        inputAparatComment(comment);
        clickCreate();
        logger.info("New aparat created");
    }

    public boolean isApparatRowAdded(String number, String comment) {
        return actionWithWebElements.isRowPresent(tableRows, number, comment);
    }

    public void deleteNewAparat(String number, String comment) {
        logger.info("Deleting new aparat");
        actionWithWebElements.clickBtn(actionWithWebElements.locateRow(tableRows, number, comment));
        actionWithWebElements.clickBtn(deleteBtn);
    }
}
