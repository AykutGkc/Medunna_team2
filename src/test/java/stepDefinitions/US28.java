package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.ReusableMethods;

public class US28 {
    HomePage homePage=new HomePage();
    CountryPage countryPage=new CountryPage();
    CountryNewPage countryNewPage=new CountryNewPage();
    CStatePage cStatePage=new CStatePage();
    CStateNewPage cStateNewPage=new CStateNewPage();
    @Given("Klicken Sie auf die Schaltflache Country")
    public void klickenSieAufDieSchaltflacheCountry() {
        homePage.countryButton.click();
    }

    @Then("Klicken Sie auf die Schaltflache Create a new Country")
    public void klickenSieAufDieSchaltflacheCreateANewCountry() {
        countryPage.createANewCountryButton.click();
    }

    @Then("Geben Sie ein Country Name {string} ein")
    public void gebenSieEinCountryNameEin(String arg0) {
        countryNewPage.nameFeldInCountry.sendKeys(arg0);
    }

    @When("Klicken Sie auf die Schaltflache Save in CountryNewPage")
    public void klickenSieAufDieSchaltflacheSaveInCountryNewPage() {
        countryNewPage.SaveInCountryNew.click();
    }

    @And("Es erscheint ein grünes Kontrollkästchen A new Country is created with identifier")
    public void esErscheintEinGrünesKontrollkästchenANewCountryIsCreatedWithIdentifier() {
        ReusableMethods.waitFor(1);
        countryNewPage.kontrollKätchenANewCountryIsCreatedWithIdentifier.isDisplayed();
    }


    @Given("Klicken Sie auf die Schaltflache StateCity")
    public void klickenSieAufDieSchaltflacheStateCity() {
        homePage.stateCityButton.click();
    }

    @Then("Klicken Sie auf die Schaltflache Create a new StateCity")
    public void klickenSieAufDieSchaltflacheCreateANewStateCity() {
        cStatePage.createNewAStateCityButton.click();
    }

    @Then("Geben Sie ein StateCity Name {string} ein")
    public void gebenSieEinStateCityNameEin(String arg0) {
        cStateNewPage.nameFeldInCStatePage.sendKeys(arg0);
    }

    @When("Klicken Sie auf die Schaltflache Save in cStateNewPage")
    public void klickenSieAufDieSchaltflacheSaveInCStateNewPage() {
        countryNewPage.SaveInCountryNew.click();
    }

    @Then("Löschen Sie ein Land")
    public void löschenSieEinLand() {
        ReusableMethods.waitFor(2);
        ReusableMethods.scroll(countryPage.deleteButtonInCountry);
        countryPage.deleteButtonInCountry.click();
        countryPage.cancelInCountryPage.sendKeys(Keys.TAB,Keys.ENTER);

    }

    @And("Es erscheint ein grünes Kontrollkästchen A new Country is deleted with identifier")
    public void esErscheintEinGrünesKontrollkästchenANewCountryIsDeletedWithIdentifier() {
        countryPage.kontrollKätchenACountryIsDeletedWithIdentifier.isDisplayed();
    }
}
