package pages;

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







    public AparatPage(WebDriver webDriver) {
        super(webDriver);
    }


}
