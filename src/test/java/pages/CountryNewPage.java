package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CountryNewPage {
    public CountryNewPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }































































































































































    //Aykut 171-220
    @FindBy(xpath = "//*[@id='country-name']")
    public WebElement nameFeldInCountry;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement SaveInCountryNew;

    @FindBy(xpath = "//*[text()='A new Country is created with identifier']")
    public WebElement kontrollKätchenANewCountryIsCreatedWithIdentifier;












}
