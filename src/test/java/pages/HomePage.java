package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }













































































































    // Yusuf 121-170
    @FindBy(css = "[data-icon='user'][class$='14 ']")
    public WebElement userIcon;
    @FindBy(xpath = "//*[.='Register']")
    public WebElement register;
    @FindBy(css = "#login-item")
    public WebElement signIn;











































//Aykut 171-220

    @FindBy(xpath ="//*[@id='password']" )
    public WebElement passwordinSignIn;

    @FindBy(xpath ="(//*[text()='Sign in'])[3]" )
    public WebElement signInInSignIn;

    @FindBy(xpath ="//*[@id='firstName']" )
    public WebElement firstNameInMakeAAppointment;

    @FindBy(xpath ="//*[text()='Send an Appointment Request']" )
    public WebElement sendAnAppointmentRequest;


    @FindBy(xpath ="//*[text()='Appointment registration saved!']")
    public WebElement grünesKontrollBoxAppointmentRegistrationSaved;

    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administrationButtonInHomePage;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagementButtonInHomePage;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[2]")
    public WebElement editButtonInUserManagemenent2Reihe;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-flag fa-w-16 fa-fw ']")
    public WebElement countryButton;
    @FindBy(xpath = "//*[text()='State/City']")
    public WebElement stateCityButton;





























































































}
