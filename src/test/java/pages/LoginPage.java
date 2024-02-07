package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }













































































































    // Yusuf 121-170
    @FindBy(css = "#username")
    public WebElement userName;
    @FindBy(css = "#password")
    public WebElement password;
    @FindBy(css = "[type='submit']")
    public WebElement submit;















































}
