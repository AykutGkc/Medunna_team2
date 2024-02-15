package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class US10 {

    HomePage homePage= new HomePage();
    LoginPage loginPage =new LoginPage();
    MyPages myPages= new MyPages();
    PatientAppoiment patientAppoiment=new PatientAppoiment();


    @Given("Der Benutzer geht zur Webseite")

    public void derBenutzerGehtZurWebseite() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }



    @Then("Klicken Sie auf das Benutzersymbol oben rechts")
    public void klickenSieAufDasBenutzersymbolObenRechts() {
        homePage.userIcon.click();

    }



    @And("Klicken Sie auf die Schaltflache SignInn")
    public void klickenSieAufDieSchaltflacheSignInn() {
        homePage.signIn.click();
    }

    @And("Geben Sie einen gultigen {string} ein")
    public void gebenSieEinenGultigenEin(String arg1) {
        loginPage.userName.sendKeys(ConfigReader.getProperty(arg1));
    }

    @And("Geben Sie ein gultiges {string} ein")
    public void gebenSieEinGultigesEin(String arg0) {
        loginPage.password.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("Klicken Sie auf die Schaltflache Sign in")
    public void klickenSieAufDieSchaltflacheSignIn() {
        loginPage.submit.click();
    }

    @And("Klicken Sie auf die Schaltflache My Pages\\(Patient)")
    public void klickenSieAufDieSchaltflacheMyPagesPatient() {
        myPages.myPages.click();
    }

    @And("Klicken Sie auf die Schaltflache My Appoiment")
    public void klickenSieAufDieSchaltflacheMyAppoiment() {
        myPages.myAppointment.click();
    }

    @Given("Geben Sie das Datum in das Feld {string} {string} ein.")
    public void gebenSieDasDatumInDasFeldEin(String from, String to) {
        patientAppoiment.from.sendKeys(from, Keys.TAB,to);
    }

    @Then("Der Benutzer bestatigt, dass die Terminliste und die Zeitfenster auf der Registerkarte My Appointments sichtbar sind.")
    public void derBenutzerBestatigtDassDieTerminlisteUndDieZeitfensterAufDerRegisterkarteMyAppointmentsSichtbarSind() {
        Assert.assertTrue(patientAppoiment.terminList.isDisplayed());
    }

    @And("Es wird bestatigt, dass der Benutzer die Informationen Patienten-ID, Startdatum, Enddatum, Status gesehen hat.")
    public void esWirdBestatigtDassDerBenutzerDieInformationenPatientenIDStartdatumEnddatumStatusGesehenHat() {
    Assert.assertTrue(patientAppoiment.terminTable.isDisplayed());
    }


}
