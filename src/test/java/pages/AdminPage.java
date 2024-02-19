package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }






// Ilyas
    @FindBy(css = "#account-menu")
    public WebElement adminMenu;
















































// 71-120 Gökhan

   @FindBy(css = "#entity-menu")
   public  WebElement itemsTitles ;

    @FindBy(css = "#entity-menu > div > a:nth-child(3) > span")
    public  WebElement physician ;

    @FindBy(xpath = "(//*[@class='table-responsive'])[1] ")
    public  WebElement physicianTable ;








































//Yusuf 121-170
@FindBy(xpath = "//*[.='Administration']")
public WebElement administration;
@FindBy(xpath = "//*[.='User management']")
public WebElement userManagement;
@FindBy(xpath = "(//*[.='»»'])[2]")
public WebElement usersLastPage;
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
@FindBy(css = "#entity-menu")
public WebElement itemTitles;
@FindBy(css = "[data-icon='bed']")
public WebElement room;
@FindBy(css = "#jh-create-entity")
public WebElement createNewRoom;
@FindBy(css = "#room-roomNumber")
public WebElement roomNumberBox;
@FindBy(css = "#room-price")
public WebElement roomPriceBox;
@FindBy(css = "#room-description")
public WebElement roomDescriptionBox;
@FindBy(css = "#save-entity")
public WebElement roomSaveButton;
@FindBy(xpath = "//*[contains(text(),'A new Room is created')]")
public WebElement roomCreatedAlert;
@FindBy(xpath = "(//*[.='»»'])[2]")
public WebElement roomListLastPage;


















































}
