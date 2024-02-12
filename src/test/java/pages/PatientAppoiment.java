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


















}
