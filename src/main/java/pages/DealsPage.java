package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;

public class DealsPage extends ParentPage {

    @FindBy(xpath = "//a[@data-original-title='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "//select[@id='deal_dealDate_date_day']")
    private WebElement dealDateDDDay;

    @FindBy(xpath = "//select[@id='deal_dealDate_date_month']")
    private WebElement dealDateDDMonth;

    @FindBy(xpath = "//select[@id='deal_dealDate_date_year']")
    private WebElement dealDateDDYear;

    @FindBy(xpath = "//select[@id='deal_dealDate_time_hour']")
    private WebElement dealDateDDHour;

    @FindBy(xpath = "//select[@id='deal_dealDate_time_minute']")
    private WebElement dealDateDDMinute;

    @FindBy(xpath = "//select[@id='deal_dealType']")
    private WebElement dealType;

    @FindBy(xpath = "//select[@id='deal_customer']")
    private WebElement buyer;

    @FindBy(xpath = "//select[@id='deal_provider']")
    private WebElement provider;

    @FindBy(xpath = "//button[@name='add']")
    private WebElement btnCreate;

    @FindBy(xpath = "//table//tr")
    private List<WebElement> dealRow;

    public DealsPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void clickAdd() {
        actionWithWebElements.clickBtn(addBtn);
    }

    private void setDealDateDDDay(String day) {
        actionWithWebElements.selectElementByDD(dealDateDDDay, day);
    }

    private void setDealDateDDMonth(String month) {
        actionWithWebElements.selectElementByDD(dealDateDDMonth, month);
    }

    private void setDealDateDDYear(String year) {
        actionWithWebElements.selectElementByDD(dealDateDDYear, year);
    }

    private void setDealDateDDHour(String hour) {
        actionWithWebElements.selectElementByDD(dealDateDDHour, hour);
    }

    private void setDealDateDDMinute(String minute) {
        actionWithWebElements.selectElementByDD(dealDateDDMinute, minute);
    }

    private void setDealType(String dealTypeItem) {
        actionWithWebElements.selectElementByDD(dealType, dealTypeItem);
    }

    private void setBuyer(String buyerItem) {
        actionWithWebElements.selectElementByDD(buyer, buyerItem);
    }

    private void setProvider(String providerItem) {
        actionWithWebElements.selectElementByDD(provider, providerItem);
    }

    private void clickCreate() {
        actionWithWebElements.clickBtn(btnCreate);
    }

    public void createNewDeal(
            String day,
            String month,
            String year,
            String hour,
            String minute,
            String dealType,
            String buyer,
            String provider) {
        clickAdd();
        setDealDateDDDay(day);
        setDealDateDDMonth(month);
        setDealDateDDYear(year);
        setDealDateDDHour(hour);
        setDealDateDDMinute(minute);
        setDealType(dealType);
        setBuyer(buyer);
        setProvider(provider);
        clickCreate();
    }

    public boolean isDealAdded(
            String date,
            String dealType,
            String buyer,
            String provider) {
        return actionWithWebElements.isRowPresent(dealRow, date, dealType, buyer, provider);
    }
}
