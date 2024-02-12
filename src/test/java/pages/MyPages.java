package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyPages {
    public MyPages() { PageFactory.initElements(Driver.getDriver(),this);
    }






























































    //  71-120 gökhan

    @FindBy(xpath = "//*[@id='entity-menu']/a/span")
    public WebElement myPages;

    @FindBy (xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement myAppointment;





















}
