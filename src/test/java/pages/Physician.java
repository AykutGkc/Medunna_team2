package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Physician {
    public Physician() {
        PageFactory.initElements(Driver.getDriver(),this);
    }





























































  // 71-120
  @FindBy(css = "#jh-create-entity")
    public WebElement createNewPhysician;

    @FindBy(css = "#useSSNSearch")
    public WebElement useSearch;

    @FindBy(css = "#searchSSN")
    public WebElement searchSsn;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement userFoundAlert;

    @FindBy(css = "#physician-firstName")
    public WebElement pyhsicianFirstName;

    @FindBy(css = "#physician-lastName")
    public WebElement pyhsicianLastName;

    @FindBy(css = "#physician1-birthDate")
    public WebElement pyhsicianbirthDate;

    @FindBy(css = "#file_image")
    public WebElement dateiAuswahlen;

  @FindBy(css = "#physician-speciality")
  public WebElement speciality;

  @FindBy(xpath = "//*[@id='physician-speciality']/option[1]")
  public WebElement allergy;

  @FindBy(css = "#physician-examFee")
  public WebElement examFree;

  @FindBy(xpath = "//*[@id='save-entity']/span")
  public WebElement save;

  @FindBy(css = "#physician-phone")
  public WebElement phone;

  @FindBy(xpath = "//*[@*='Toastify__toast-body']")
  public WebElement fehler;

  @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/div/table/tbody/tr[20]/td[2]")
  public WebElement doktorSil;

  @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/div/table/tbody/tr[20]/td[18]/div/a[3]")
  public WebElement sil;

  @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[2]/div[2]/div/nav/ul/li[5]/a")
  public WebElement sayfa3;

  @FindBy(css = "#jhi-confirm-delete-physician")
  public WebElement delete;

  @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div/div[1]")
  public WebElement deleteAlert;



}
