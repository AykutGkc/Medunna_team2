package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CStatePage {
    public CStatePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }































































































































































    //Aykut 171-220
    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewAStateCityButton;
}
