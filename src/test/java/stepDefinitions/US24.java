package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.LoginPage;
import pages.PatientAppoiment;
import utilities.ReusableMethods;

import java.util.Random;

public class US24 {
    LoginPage loginPage=new LoginPage();
    PatientAppoiment patientAppoiment=new PatientAppoiment();
    @And("Klicken Sie auf die Schaltflache Registrieren")
    public void klickenSieAufDieSchaltflacheRegistrieren() {

    loginPage.registerButton.click();

    }

    @And("Geben Sie einen gultigen \\{string} einltigen Benutzernamen ein")
    public void gebenSieEinenGultigenStringEinltigenBenutzernamenEin() {
        Random random=new Random();
        String ssn=random.nextInt(999)+"-"+random.nextInt(99)+"-"+random.nextInt(9999);
        loginPage.registerSsn.sendKeys(ssn);
        String firstname=random.toString();
        String laststname=random.toString();
        String usertname=random.toString();
        String email=random.toString()+"@gmail.com";
        String password="Aa123456+.";


    }


    @And("Klicken Sie auf die Schaltflache Show Test")
    public void klickenSieAufDieSchaltflacheShowTest() {
        patientAppoiment.showTest.click();
        ReusableMethods.bekle(1);
    }


    @And("Klicken Sie auf die Schaltflache View Results")
    public void klickenSieAufDieSchaltflacheViewResults() {
        patientAppoiment.viewResults.click();
        ReusableMethods.bekle(1);
    }

    @And("Bestatigung, dass die Testergebnisse gesehen worden sind")
    public void bestatigungDassDieTestergebnisseGesehenWordenSind() {
        Assert.assertTrue(patientAppoiment.terminTable.isDisplayed());
    }


    @And("Klicken Sie auf die Schaltflache Show Invoice")
    public void klickenSieAufDieSchaltflacheShowInvoice() {
        patientAppoiment.showInvoice.click();
        ReusableMethods.bekle(1);
    }


    @And("Es stimmt, dass die Rechnung gesehen wurde")
    public void esStimmtDassDieRechnungGesehenWurde() {
        Assert.assertTrue(patientAppoiment.invoice.isDisplayed());
    }
}
