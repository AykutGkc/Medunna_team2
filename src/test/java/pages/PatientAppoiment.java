package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientAppoiment {
    public PatientAppoiment() {PageFactory.initElements(Driver.getDriver(),this);}





























































    // 71-120 Gökhan
    @FindBy(css = "#fromDate")
    public WebElement from;

    @FindBy (css = "#toDate")
    public WebElement to;

    @FindBy (xpath = "(//*[@class='table-responsive'])[1]")
    public WebElement terminList;

    @FindBy (xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead")
    public WebElement terminTable;

    @FindBy (xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr/td[7]/div")
    public WebElement viewResults;

    @FindBy (css = "#app-view-container > div > div > div > div > div > table > tbody > tr > td.text-right > div > a > span")
    public WebElement showTest;

    @FindBy (css = "#app-view-container > div > div")
    public WebElement testTable;

    @FindBy (xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr/td[8]/div/a[2]/span")
    public WebElement showInvoice;

    @FindBy (css = "#app-view-container > div > div > div > div > table")
    public WebElement invoice;



}
