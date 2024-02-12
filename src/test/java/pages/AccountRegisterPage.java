package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountRegisterPage {
    public AccountRegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }













































































































    // Yusuf 121-170
    @FindBy(css = "#ssn")
    public WebElement registerSsn;
    @FindBy(css = "#firstName")
    public WebElement registerFirstName;
    @FindBy(css = "#lastName")
    public WebElement registerLastName;
    @FindBy(css = "#username")
    public WebElement registerUserName;
    @FindBy(css = "#email")
    public WebElement registerEmail;
    @FindBy(css = "#firstPassword")
    public WebElement registerFirstPassword;
    @FindBy(css = "#secondPassword")
    public WebElement registerSecondPassword;
    @FindBy(css = "#register-submit")
    public WebElement registerSubmitButton;
    @FindBy(css = "div[class*='Toastify'][role='alert']")
    public WebElement alertRegistrationSaved;
    @FindBy(css = "#firstName")
    public WebElement accountSettingsFirstName;
    @FindBy(css = "#lastName")
    public WebElement accountSettingsLastName;
    @FindBy(css = "#email")
    public WebElement accountSettingsEmail;
    @FindBy(xpath = "//*[.='Settings']")
    public WebElement accountSettings;
@FindBy(xpath = "(//*[.='Save'])[2]")
    public WebElement accountSettingsSave;



}
