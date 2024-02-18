package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminUserManagementUserEditPage {
    public AdminUserManagementUserEditPage() {PageFactory.initElements(Driver.getDriver(),this);
    }
































































































































































    //Aykut 171-220
    @FindBy(xpath = "//*[text()='First name']")
    public WebElement firstnameTextInUsermanagement;

    @FindBy(xpath = "//*[text()='Last name']")
    public WebElement lastnameTextInUsermanagement;

    @FindBy(xpath = "//*[text()='Email']")
    public WebElement emailTextInUsermanagement;

    @FindBy(xpath = "//*[@value='ROLE_ADMIN']")
    public WebElement RoleAdminOption;
    @FindBy(xpath = "//*[@value='ROLE_USER']")
    public WebElement RoleUserOption;
    @FindBy(xpath = "//*[@value='ROLE_PATIENT']")
    public WebElement RolePatientOption;
    @FindBy(xpath = "//*[@value='ROLE_STAFF']")
    public WebElement RoleStaffOption;
    @FindBy(xpath = "//*[@value='ROLE_PHYSICIAN']")
    public WebElement RolePhysicianOption;

    @FindBy(xpath = "//*[text()='A user is updated with identifier user']")
    public WebElement UserIsUpdatedWithIdentifierUser;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement AdminUserManagementUserEditSaveButton;















}
