package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ProvidersPage extends ParentPage {

    @FindBy(xpath = "//a[@data-original-title='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "//input[@id='prov_cus_proCustName']")
    private WebElement proCustName;

    @FindBy(xpath = "//input[@id='prov_cus_proCustAddress']")
    private WebElement proCustAddress;

    @FindBy(xpath = "//input[@id='prov_cus_proCustPhone']")
    private WebElement proCustPhone;

    @FindBy(xpath = "//input[@id='prov_cus_proCustIsFl']")
    private WebElement checkBoxPrivatePerson;

    @FindBy(xpath = "//input[@id='prov_cus_isOurFirm']")
    private WebElement checkBoxIsOurFirm;

    @FindBy(xpath = "//button[@name='add']")
    private WebElement btnCreate;

    public ProvidersPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void clickAdd() {
        actionWithWebElements.clickBtn(addBtn);
    }

    private void inputCustName(String name) {
        actionWithWebElements.enterTextToTheFields(proCustName, name);
    }

    private void inputCustAdress(String adr) {
        actionWithWebElements.enterTextToTheFields(proCustAddress, adr);
    }

    private void inputCustPhone(String phone) {
        actionWithWebElements.enterTextToTheFields(proCustPhone, phone);
    }

    private void setCheckBoxPrivatePerson(Boolean checkBox) {
        actionWithWebElements.setCheckbox(checkBoxPrivatePerson, checkBox);
    }

    private void setCheckBoxIsOurFirm(Boolean checkBox) {
        actionWithWebElements.setCheckbox(checkBoxIsOurFirm, checkBox);
    }

    private void clickSubmit() {
        actionWithWebElements.clickBtn(btnCreate);
    }

    public void createNewProvider(String name, String adr, String phone, Boolean checkboxPrivatePerson, Boolean checkboxIsOur) {
        clickAdd();
        inputCustName(name);
        inputCustAdress(adr);
        inputCustPhone(phone);
        setCheckBoxPrivatePerson(checkboxPrivatePerson);
        setCheckBoxIsOurFirm(checkboxIsOur);
        clickSubmit();
    }





}
