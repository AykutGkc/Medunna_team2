package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }








// Ilyas
    // css = "#react-select-3-input")
    // xpath = "//*[@class=' css-19bb58m']
    @FindBy(xpath = "//*[@class='form-check form-check-inline']")
    public WebElement rememberMeButton;
    @FindBy(xpath =" //*[@type='submit']")
    public WebElement SignIn;












































    // 71-120 gokhan
    @FindBy (css = "#account-menu > div > a:nth-child(2) > span")
    public WebElement registerButton;

    @FindBy(css = "#ssn")
    public  WebElement registerSsn;












































    // Yusuf 121-170
    @FindBy(css = "#username")
    public WebElement userName;
    @FindBy(css = "#password")
    public WebElement password;
    @FindBy(css = "[type='submit']")
    public WebElement submit;















































}
