package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class StaffPage {






























































































































































































































































































































































































































    //Fethi

    public StaffPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myPage;

    @FindBy (xpath ="//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement searchPatient;


    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[2]")
    public WebElement inPatient;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[1]/div[2]/input")
    public WebElement patientSSN;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/tbody/tr/td[16]/div/a[3]/span/span")
    public WebElement showAppointments;
    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[13]/div/a[3]/span/span")
    public WebElement paymentInvoiceProcess;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/table/thead/tr[5]/th[1]")
    public WebElement examFee;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/a")
    public WebElement createInvoice;

    @FindBy (xpath = "//*[@id=\"hospitalmsappfrontendApp.bill.home.createOrEditLabel\"]/span")
    public WebElement creatInvoiceForm;


    @FindBy (xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement saveInvoice;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/a")
    public WebElement showInvoiceButton;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/table/thead/tr[1]/th[1]")
    public WebElement invoice;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/table/thead/tr[1]/th[1]")
    public WebElement paymentDetail;

    // ================ PATIENT =====================

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement patientMyPages;

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement patientMyApointments;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[8]/div/a[2]/span/span")
    public WebElement patientShowInvoice;

    //=================== REQUIRED REGISTER ===================


   @FindBy (xpath = "//*[@id=\"register-form\"]/div[1]/div")
    public WebElement requiredSSN;


    @FindBy (xpath = "//*[@id=\"register-form\"]/div[1]/div")
    public WebElement invalidSSN;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[2]/div")
    public WebElement invalidFirstName;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[3]/div")
    public WebElement invalidLastName;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[4]/div")
    public WebElement invalidUserName;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[5]/div")
    public WebElement invalidEmail;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[6]/div")
    public WebElement invalidPassword;

}