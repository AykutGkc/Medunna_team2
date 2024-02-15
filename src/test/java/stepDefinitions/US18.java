package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AdminPage;
import pages.Physician;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US18 {
    AdminPage adminPage=new AdminPage();
    Physician physician=new Physician();
    @And("Klicken Sie auf die Schaltflache Items&Titles")
    public void klickenSieAufDieSchaltflacheItemsTitles() {
    adminPage.itemsTitles.click();
    }

    @And("Klicken Sie auf die Schaltflache Physician")
    public void klickenSieAufDieSchaltflachePhysician() {
        adminPage.physician.click();
    }

    @And("Uberpruft, ob die Angaben des Arztes sichtbar sind")
    public void uberpruftObDieAngabenDesArztesSichtbarSind() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.physicianTable.isDisplayed());
    }

    @Given("Klicken Sie auf die Schaltflache Create a new Physician")
    public void klickenSieAufDieSchaltflacheCreateANewPhysician() {
    physician.createNewPhysician.click();
    }

    @Then("Klicken Sie auf die Schaltflache Use Search")
    public void klickenSieAufDieSchaltflacheUseSearch() {
    physician.useSearch.click();
    }

    @And("{string} wird eingegeben")
    public void wirdEingegeben(String arg0) {
        physician.searchSsn.sendKeys(ConfigReader.getProperty(arg0), Keys.ENTER);
    }

    @And("Klicken Sie auf die Schaltflache Search User")
    public void klickenSieAufDieSchaltflacheSearchUser() {}

    @And("Uberprüft, ob die Angaben des Arztes gesehen worden sind")
    public void uberprüftObDieAngabenDesArztesGesehenWordenSind() {
    Assert.assertTrue(physician.userFoundAlert.isDisplayed());
    }

    @Then("Für Pyhsician {string} {string} {string} {string}wird eingegeben")
    public void fürPyhsicianWirdEingegeben(String arg0, String arg1, String arg2, String arg3) {
        physician.pyhsicianFirstName.sendKeys(arg0,Keys.TAB,arg1,Keys.TAB,arg2,Keys.TAB,arg3);
        ReusableMethods.bekle(2);
    }


    @And("Bild hochgeladen")
    public void bildHochgeladen() {
        String data="C:\\Users\\Admin\\OneDrive\\Desktop\\masaustu\\resim.jpg";
        ReusableMethods.bekle(2);
        physician.dateiAuswahlen.sendKeys(data);
        ReusableMethods.bekle(3);

    }


    @And("Verwaltung wahlt Spezialisierung")
    public void verwaltungWahltSpezialisierung() {
    physician.speciality.click();
    ReusableMethods.bekle(1);
    physician.allergy.click();
        ReusableMethods.scroll(physician.save);
    }

    @And("Admin gibt {string} ein")
    public void adminGibtEin(String arg0) {
        physician.examFree.sendKeys(arg0);
        ReusableMethods.bekle(1);
    }

    @And("Klicken Sie auf die Schaltflache Save")
    public void klickenSieAufDieSchaltflacheSave() {
        physician.save.click();
        ReusableMethods.bekle(1);
        ReusableMethods.screenShot();
    }



    @Then("Bestatigen Sie, dass die Loschung stattgefunden hat.")
    public void bestatigenSieDassDieLoschungStattgefundenHat() {

    }


    @And("die Bestatigung, dass die Registrierungsnachricht nicht empfangen werden konnte")
    public void dieBestatigungDassDieRegistrierungsnachrichtNichtEmpfangenWerdenKonnte() {
        Assert.assertTrue(physician.fehler.isDisplayed());
    }
}
