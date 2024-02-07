package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }













































































































//Yusuf 121-170
    @FindBy(xpath = "//*[.='Administration']")
    public WebElement administration;
@FindBy(xpath = "//*[.='User management']")
    public WebElement userManagement;
@FindBy(xpath = "(//*[.='»»'])[2]")
    public WebElement usersLastPage;
@FindBy(css = "#metinerdem")
    public WebElement metinerdem;
@FindBy(css = "[href*='metinerdem/edit']")
    public WebElement metinErdemEdit;
@FindBy(css = "#authorities")
    public WebElement profilesDDM;
@FindBy(xpath = "//*[.='Save']")
    public WebElement userSave;
@FindBy(css = "#activated")
    public WebElement activatedButton;
@FindBy(xpath = "//*[.='Sign out']")
    public WebElement signOutButton;
@FindBy(css = "[href='/admin/user-management/metinerdem/delete']")
    public WebElement DeleteButton;
@FindBy(xpath = "//*[@class='modal-footer']//*[.='Delete']")
    public WebElement deleteConfirmButton;















































}
