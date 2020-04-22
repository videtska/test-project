package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DealsTypesPage extends ParentPage {

    @FindBy(xpath = "//a[@data-original-title='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "//input[@id='deal_type_dealTypeName']")
    private WebElement inputDealTypeName;

    @FindBy(xpath = "//button[@name='add']")
    private WebElement btnCreate;

    public DealsTypesPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void clickAdd() {
        actionWithWebElements.clickBtn(addBtn);
    }

    private void setInputDealTypeName(String dealTypeName) {
        actionWithWebElements.enterTextToTheFields(inputDealTypeName, dealTypeName);
    }

    private void clickCreate() {
        actionWithWebElements.clickBtn(btnCreate);
    }

    public void createNewDealType(String dealTypeName) {
        clickAdd();
        setInputDealTypeName(dealTypeName);
        clickCreate();
    }




}
